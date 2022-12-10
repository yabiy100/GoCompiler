lexer grammar LexerGo;

//COMMENT: '/''/'.*? '\n';

PACKAGE: 'package' WS;
IMPORT: 'import'WS;
IMPORTNAME: '"'IDENTIFIER'"';
FUNC: 'func' WS;
MAIN: 'main';

L_BRACKET: '{';
R_BRACKET: '}' ;
L_BRACE: '(';
R_BRACE: ')'WS;
COMMA: ','WS;
WS: (' '|'\t') ;
//WS: [ \t] -> skip;
//NEWLINE: ('\n'|'\n''\r');
NEWLINE: '\n';
INT: [0-9]+;

ADD: '+';

TYPE: 'int' | 'float64' | 'string' | 'boolean';


IDENTIFIER: ([a-z][a-z_0-9]*);