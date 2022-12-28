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
returnType: TYPE | ;

functionBody: declaration expressions;
declaration: VAR IDENTIFIER TYPE EQUALS expr newLine declaration | ;
expr:  unary | expr MULT expr | expr PLUS expr | expr MINUS expr | expr COMPAIR expr | expr LOGICAL_AND expr | expr LOGICAL_OR expr |
    L_BRACE expr R_BRACE | NUMBER | BOOLEAN | STRING | IDENTIFIER| unary | methodCall;
unary: NOT unaryExpr | PLUS NUMBER | MINUS NUMBER;
unaryExpr: IDENTIFIER | BOOLEAN | L_BRACE expr R_BRACE;
methodCall: IDENTIFIER L_BRACE methodParams R_BRACE methodCall | IDENTIFIER POINT IDENTIFIER L_BRACE methodParams R_BRACE methodCall
    | POINT IDENTIFIER L_BRACE methodParams R_BRACE methodCall |  ;
methodParams: param | param COMMA param | ;
param: methodCall | IDENTIFIER | STRING | NUMBER| BOOLEAN ;

expressions: variableAssignment newLine expressions | methodCall newLine expressions| if newLine expressions | return | ;
variableAssignment: IDENTIFIER EQUALS expr;
if: IF expr L_BRACKET newLine expressions R_BRACKET optNewLine else;
else: ELSE L_BRACKET expressions R_BRACKET | ;

return: RETURN expr | ;

newLine: NEWLINE | NEWLINE newLine ;
optNewLine: NEWLINE | NEWLINE newLine | ;