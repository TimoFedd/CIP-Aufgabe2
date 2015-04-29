grammar AufgabeMiniP;

options{
output=AST;
ASTLabelType=CommonTree;
}

tokens{START; DECLARATION; STATEMENT; ASSIGNMENT; ARITHMETIC; LOOP; CONDITIONAL; CONDITION; CONSEQUENCE; ALTERNATIVE;}

start		:	PROGRAM declaration*  BEGIN statement+ END
				-> ^(START declaration* statement+); 
declaration	:	DATATYPE ID (COMMA ID)* SEM
				-> ^(DECLARATION DATATYPE ID)+;
statement       :	(
			assignment -> ^(STATEMENT assignment)
			| read_statement -> ^(STATEMENT read_statement)
			| while_statement -> ^(STATEMENT while_statement) 
			| if_statement -> ^(STATEMENT if_statement) 
			| println -> ^(STATEMENT println)
			) SEM;


assignment 	:	ID ASSIGNOR (
			arithmetic -> ^(ASSIGNMENT ID arithmetic)
			| compare -> ^(ASSIGNMENT ID compare) 
			| STRINGCONST -> ^(ASSIGNMENT ID STRINGCONST)
			| BOOLEANCONST -> ^(ASSIGNMENT ID BOOLEANCONST)
			);

read_statement 	: 	READ OPENROUND ID CLOSEROUND 
				-> ^(READ ID);
while_statement :	WHILE compare DO statement* OD	
				-> ^(LOOP compare statement*); 
// RÜCKFRAGE: So oder anders?				
if_statement    :       condition consequence alternative? FI
				-> ^(CONDITIONAL condition consequence alternative?);
condition	:	IF compare 
				-> ^(CONDITION compare);						
consequence	:	THEN statement+
				-> ^(CONSEQUENCE statement+);
alternative	:	ELSE statement+ 
				-> ^(ALTERNATIVE statement+);				


compare 	:	OPENROUND! (ID | constants) COMPARATOR^ (ID | constants) CLOSEROUND!;  
println 	:	PRINTLN^ OPENROUND!(ID | STRINGCONST) CLOSEROUND!;

constants	:	BOOLEANCONST | STRINGCONST | REALCONST | INTEGERCONST;

arithmetic	:	mult_expression(ADD_SUB^ mult_expression)*;
mult_expression :       atom(MULT_DIV^ atom)* ;
// RÜCKFRAGE: Extrawurzel für Vorzeichen? Ja oder Nein?
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