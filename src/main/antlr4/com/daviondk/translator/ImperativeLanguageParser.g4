parser grammar ImperativeLanguageParser;

options { tokenVocab=ImperativeLanguageLexer; }

program : statements EOF;

statements : (defVariable | function)* mainStatement? (defVariable | function )*;

function : DEF NAME LPAREN args RPAREN COLON type functionBody ;
args : (NAME COLON type (COMMA NAME COLON type)*)? ;
type : TYPENAME ;
functionBody : LBRACE statement returnStatement RBRACE ;

statement : (callUser SEMICOLON | defVariable | assignment | callPrint SEMICOLON | conditionStatement | cycleStatement | expr SEMICOLON )* ;

callUser : NAME LPAREN callArgs RPAREN ;

callArgs : (NAME (COMMA NAME)*)? ;

assignment : NAME ASSIGN (callRead | expr) SEMICOLON ;

value : INT | STRING | DOUBLE | BOOLEAN | NAME ;

callRead : callReadInt | callReadDouble | callReadString ;

callReadInt : READINT LPAREN RPAREN ;
callReadDouble : READDOUBLE LPAREN RPAREN ;
callReadString : READ LPAREN RPAREN ;
callPrint : ( PRINT | PRINTLN | PRINTINT | PRINTDOUBLE ) LPAREN expr RPAREN ;


expr : maxExpr | expr ADD maxExpr | expr SUB maxExpr | expr XOR maxExpr | expr OR maxExpr | expr logical maxExpr ;
maxExpr : unary | maxExpr MUL unary | maxExpr DIV unary | maxExpr MOD unary | maxExpr AND unary ;
unary : recExpr | NOT unary ;
recExpr : value | callUser | LPAREN expr RPAREN ;

logical : EQ | NE | LT | GT | GE | LE ;

conditionStatement : IF LPAREN expr RPAREN LBRACE statement RBRACE ( ELSE ( conditionStatement | LBRACE statement RBRACE ) )? ;

condition : expr ;

cycleStatement : whileStatement | forStatement ;
whileStatement : WHILE LPAREN condition RPAREN LBRACE statement RBRACE ;
forStatement : FOR NAME IN INT RANGE INT LBRACE statement RBRACE ;

defVariable : type assignment ;

returnStatement : RETURN expr SEMICOLON ;

mainStatement : DEF MAIN LPAREN RPAREN LBRACE statement RBRACE ;