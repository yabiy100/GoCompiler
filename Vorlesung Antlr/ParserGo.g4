parser grammar ParserGo;

options{
tokenVocab=LexerGo;
}
s :   package imports function;
package: PACKAGE IDENTIFIER newLine;

imports: IMPORT STRING newLine;

function: functionHead optNewLine L_BRACKET optNewLine functionBody R_BRACKET optNewLine function | ;
functionHead: FUNC IDENTIFIER L_BRACE params R_BRACE returnType;
params: IDENTIFIER TYPE | IDENTIFIER TYPE COMMA params |  ;

functionBody: declaration;
declaration: VAR IDENTIFIER TYPE EQUALS expr newLine declaration | ;
expr: unary expr |  expr MULT expr | expr ADD expr | expr COMPAIR expr | expr LOGICAL_AND expr | expr LOGICAL_OR expr |
    L_BRACE expr R_BRACE | NUMBER | BOOLEAN | STRING | methodCall;
unary: NOT expr | POSTIV expr | NEGATIV expr; //richtig oder falsch gepast
methodCall: IDENTIFIER L_BRACE methodParams R_BRACE methodCall | IDENTIFIER POINT IDENTIFIER L_BRACE methodParams R_BRACE methodCall
    | POINT IDENTIFIER L_BRACE methodParams R_BRACE methodCall |  ;
methodParams: param | param COMMA params | ;
param: methodCall | IDENTIFIER | STRING | NUMBER| BOOLEAN ;
returnType: TYPE | ;

newLine: NEWLINE | NEWLINE newLine ;
optNewLine: NEWLINE | NEWLINE newLine | ;