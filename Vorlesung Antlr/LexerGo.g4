lexer grammar LexerGo;

WS: [ \t] -> skip;
COMMENT: '/''/'.*? '\n' -> skip;
BIG_COMMENT: '/''*'.*? '*''/' -> skip;
PACKAGE: 'package';
IMPORT: 'import';
//IMPORTNAME: '"'([A-Za-z][A-Za-z_0-9]*)'"';
FUNC: 'func' ;

L_BRACKET: '{';
R_BRACKET: '}' ;
L_BRACE: '(';
R_BRACE: ')';
COMMA: ',';
POINT: '.';
EQUALS: '=';

TYPE: 'int' | 'float64' | 'string' | 'boolean';
NUMBER: INT | FLOAT64;
INT: [0-9]+;
FLOAT64: [0-9]+ '.' [0-9]+;
STRING: '"' ([ -~]*) '"';
VAR: 'var';

NEWLINE: '\n' | '\r' | '\r\n';


ADD: '+' | '-';
MULT: '*' | '/' | '%';
NOT: '!';
POSTIV: '+';
NEGATIV: '-';
COMPAIR: '!=' | '==' | '<' | '>' | '<=' | '>=';
LOGICAL_AND: '&&';
LOGICAL_OR: '||';
BOOLEAN: 'true' | 'false';


IDENTIFIER: ([A-Za-z][A-Za-z_0-9]*);