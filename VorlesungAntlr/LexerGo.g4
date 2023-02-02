lexer grammar LexerGo;

WS: [ \t] -> skip;
COMMENT: '/''/'.*? '\n' -> skip;
BIG_COMMENT: '/''*'.*? '*''/' -> skip;
PACKAGE: 'package';
IMPORT: 'import';
FUNC: 'func' ;

L_BRACKET: '{';
R_BRACKET: '}' ;
L_BRACE: '(';
R_BRACE: ')';
COMMA: ',';
POINT: '.';
EQUALS: '=';

IF: 'if';
ELSE: 'else';
FOR: 'for';
RETURN: 'return';

TYPE: 'int' | 'float64' | 'string' | 'bool';
NUMBER: INT | FLOAT64;
INT: [0-9]+;
FLOAT64: [0-9]+ '.' [0-9]+;
STRING: '"' ([ -~]*) '"';
VAR: 'var';

NEWLINE: '\n' | '\r' | '\r\n';


MULT: '*' | '/' | '%';
NOT: '!';
PLUS: '+';
MINUS: '-';
COMPAIR: '!=' | '==' | '<' | '>' | '<=' | '>=';
LOGICAL_AND: '&&';
LOGICAL_OR: '||';
BOOL: 'true' | 'false';


IDENTIFIER: ([A-Za-z][A-Za-z_0-9]*);