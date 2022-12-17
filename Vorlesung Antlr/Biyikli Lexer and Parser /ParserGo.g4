parser grammar ParserGo;

options{
tokenVocab=LexerGo;
}
s :   package imports function;
package: PACKAGE IDENTIFIER newLine;

imports: IMPORT IMPORTNAME newLine;

function: functionHead optNewLine L_BRACKET optNewLine functionBody R_BRACKET optNewLine function | ;
functionHead: FUNC IDENTIFIER L_BRACE params R_BRACE returnType;
params: IDENTIFIER TYPE | IDENTIFIER TYPE COMMA params |  ;
functionBody: declaration;
declaration: VAR IDENTIFIER TYPE EQUALS expression newLine declaration | ;
expression: STRING | expr;
expr: unary expr |  expr MULT expr | expr ADD expr | expr COMPAIR expr | expr LOGICAL_AND expr | expr LOGICAL_OR expr |
    L_BRACE expr R_BRACE | NUMBER | BOOLEAN | STRING ;
unary: NOT expr | POSTIV expr | NEGATIV expr;
returnType: TYPE | ;

newLine: NEWLINE | NEWLINE newLine ;
optNewLine: NEWLINE | NEWLINE newLine | ;