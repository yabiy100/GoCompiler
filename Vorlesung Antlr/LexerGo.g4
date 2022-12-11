lexer grammar LexerGo;

//COMMENT: '/''/'.*? '\n';
WS: [ \t] -> skip;
PACKAGE: 'package';
IMPORT: 'import';
IMPORTNAME: '"'([a-z][a-z_0-9]*)'"';
FUNC: 'func' ;
//MAIN: 'main';

L_BRACKET: '{';
R_BRACKET: '}' ;
L_BRACE: '(';
R_BRACE: ')';
COMMA: ',';
//WS: (' '|'\t') -> skip;
//OPTWS: WS | WS OPTWS | '';

//NEWLINE: ('\n'|'\n''\r');
NEWLINE: '\n' | '\r' | '\r\n';
INT: [0-9]+;

ADD: '+';

TYPE: 'int' | 'float64' | 'string' | 'boolean';


IDENTIFIER: ([a-z][a-z_0-9]*);