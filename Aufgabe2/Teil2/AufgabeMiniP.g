grammar AufgabeMiniP;

options{
output=AST;
ASTLabelType=CommonTree;
}

tokens{ASSIGNMENT; ARITHMETIC; LOOP; CONDITIONAL; DECLARATION;}

start		:	PROGRAM declaration*  BEGIN statement+ END; 
declaration	:	DATATYPE ID (COMMA ID)* SEM
				-> ^(DECLARATION DATATYPE ID)+;
statement       :	(assignment | read_statement | while_statement | if_statement | println)^ SEM!;


assignment 	:	ID ASSIGNOR (
			arithmetic -> ^(ASSIGNMENT ID arithmetic)
			| compare -> ^(ASSIGNMENT ID compare) 
			| STRINGCONST -> ^(ASSIGNMENT ID STRINGCONST)
			| BOOLEANCONST -> ^(ASSIGNMENT ID BOOLEANCONST)
			);

read_statement 	: 	READ OPENROUND ID CLOSEROUND;
while_statement :	WHILE compare DO statement* OD	
				-> ^(LOOP compare statement*); 
if_statement    :       IF compare THEN statement+ (ELSE statement+)?  FI; 
//				-> ^(CONDITIONAL compare statement+ statement?);


compare 	:	OPENROUND! (ID | constants) COMPARATOR^ (ID | constants) CLOSEROUND!;  
println 	:	PRINTLN^ OPENROUND!(ID | STRINGCONST) CLOSEROUND!;

constants	:	BOOLEANCONST | STRINGCONST | REALCONST | INTEGERCONST;

arithmetic	:	mult_expression(ADD_SUB^ mult_expression)*;
mult_expression :       atom(MULT_DIV^ atom)* ;
atom		:       ADD_SUB^? (INTEGERCONST | REALCONST) | OPENROUND! arithmetic CLOSEROUND! | ID;


OD		:       'od';	
DO		:       'do';	
WHILE 		:       'while';	
READ 		:	'read';
COMPARATOR 	:	'=' | '<>' | '<' | '<=' | '>' | '>=';   
ASSIGNOR	:	':=';
IF 		:	'if';
THEN 		:	'then';
ELSE 		:	'else';
FI		:	'fi';
END 		:	'end';
PROGRAM		:	'program';
BEGIN		:	'begin';
PRINTLN		:	'println';
DATATYPE        :	'integer' | 'real' | 'string' | 'boolean';

OPENROUND	: 	'(';
CLOSEROUND	:	')';
COMMA		:	',';
SEM  		:	 ';';
ADD_SUB		:	'+' | '-';
MULT_DIV	:	'*' | '/';

WS       	:	(' '|'\t'|'\n'|'\r'|'\f')+{ $channel=HIDDEN; };
COMMENTS	: 	('/*' .* '*/')   { $channel=HIDDEN; };  // das .* bedeutet in ANTLR, beliebiges Zeichen beliebig oft
BOOLEANCONST	:	'true' | 'false';
STRINGCONST	:       '\'' .* '\'';	
REALCONST	:	DIGIT+ '.' DIGIT+;
INTEGERCONST	:	DIGIT+;
ID		:	LETTER (LETTER|DIGIT|'_')*;


//****************************************Fragments******************************************************************


fragment LETTER	:	('a'..'z'|'A'..'Z');
fragment DIGIT	:	('0'..'9');