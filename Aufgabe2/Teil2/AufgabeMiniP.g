grammar AufgabeMiniP;

options{
output=AST;
ASTLabelType=CommonTree;
}

tokens{START; DECLARATIONS; DECLARATION; STATEMENTS; ASSIGNMENT; READ_STATEMENT; 
ARITHMETIC; LOOP; EXECUTION; CONDITIONAL; CONDITION; CONSEQUENCE; ALTERNATIVE; PRINTLINE;}


start		:	PROGRAM declaration*  BEGIN statement+ END  -> ^(START ^(DECLARATIONS declaration*) ^(STATEMENTS statement*)); 

declaration	:	DATATYPE ids+=ID (COMMA ids+=ID)* SEM       -> ^(DATATYPE  $ids*);

statement      :	(assignment | read_statement | while_statement | if_statement | println) SEM!;
		
assignment      :	ID ASSIGNOR value -> ^(ASSIGNMENT ID value);

value 	        :	(arithmetic | compare | STRINGCONST | BOOLEANCONST);

read_statement 	: 	READ OPENROUND ID CLOSEROUND -> ^(READ_STATEMENT ID);
				
// Achtung: sowas wie "while (true)" nicht möglich, trotzdem iO?
while_statement :	WHILE compare DO statement* OD	-> ^(LOOP ^(CONDITION compare) ^(EXECUTION statement*)); 
	
if_statement    :       IF compare THEN ifthen=statement+ (ELSE ifelse=statement)?  FI
				-> ^(CONDITIONAL ^(CONDITION compare) ^(CONSEQUENCE $ifthen) ^(ALTERNATIVE $ifelse)?);
 		
compare 	:	OPENROUND! (ID | constants) COMPARATOR^ (ID | constants) CLOSEROUND!;  

println 	:	PRINTLN OPENROUND(ID | STRINGCONST) CLOSEROUND    ->  ^(PRINTLINE ID* STRINGCONST*);
					
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