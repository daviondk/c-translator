lexer grammar ImperativeLanguageLexer;

/**
*  cycles, etc.
*/
WHILE : 'while' ;
FOR : 'for' ;
IN : 'in' ;

/**
*  functions
*/
READINT : 'readInt' ;
READDOUBLE : 'readDouble' ;
READ : 'read' ;
PRINT : 'print' ;
PRINTINT : 'printInt' ;
PRINTDOUBLE : 'printDouble' ;
PRINTLN : 'println' ;


/**
*  condition
*/
IF : 'if' ;
ELSE : 'else' ;

/**
*  arithmetic
*/
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
MOD : '%' ;

/**
*  conditional binary operators
*/
EQ : '==' ;
NE : '!=' ;
LT : '<' ;
GT : '>' ;
GE : '>=' ;
LE : '<=' ;

/**
*  logical operators
*/
AND : 'and' ;
OR : 'or' ;
XOR : 'xor' ;
NOT : 'not' ;

/**
*  etc
*/
LPAREN : '(' ;
RPAREN : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;
RANGE : '..' ;
SEMICOLON : ';' ;
COLON : ':' ;
COMMA : ',' ;
NEWLINE : '\r\n' | 'r' | '\n' ;
WS : [\t ]+ -> skip ;
VAR : 'var' ;
VAL : 'val' ;
ASSIGN : '=' ;
DEF : 'def' | 'define' ;
RETURN : 'return' ;
MAIN : 'main' ;

/**
*  types
*/
BOOLEAN : 'true' | 'false' ;

TYPENAME : 'integer' | 'double' | 'string' | 'boolean' ;

INT : ('-')*[0-9]+ ;
STRING : '".*"' ;
DOUBLE : '-*[0-9]+'.'[0-9]*' ;
NAME : [a-zA-Z_][A-Za-z0-9_]* ;