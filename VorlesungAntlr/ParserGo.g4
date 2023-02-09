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

functionBody: declaration expressions return;
declaration: VAR IDENTIFIER TYPE EQUALS expr newLine declaration | ;
expr:  unary | expr MULT expr | expr PLUS expr | expr MINUS expr | expr COMPAIR expr | expr LOGICAL_AND expr | expr LOGICAL_OR expr |
    L_BRACE expr R_BRACE | NUMBER | BOOL| STRING | IDENTIFIER| unary | methodCall | ;
unary: NOT unaryExpr | PLUS NUMBER | MINUS NUMBER;
unaryExpr: IDENTIFIER | BOOL | L_BRACE expr R_BRACE;

variableAssignment: IDENTIFIER EQUALS expr;
if: IF expr L_BRACKET newLine expressions return R_BRACKET optNewLine else optNewLine;
else: ELSE L_BRACKET optNewLine expressions return R_BRACKET | ;
bloc: L_BRACKET optNewLine expressions R_BRACKET optNewLine;
for: FOR expr optNewLine L_BRACKET optNewLine expressions optNewLine R_BRACKET optNewLine;

return: RETURN newLine | RETURN expr newLine | ;

newLine: NEWLINE | NEWLINE newLine ;
optNewLine: NEWLINE | NEWLINE newLine | ;

expressions: variableAssignment newLine expressions | methodCall newLine expressions| if expressions
    | bloc expressions | for newLine expressions| ;
methodCall: IDENTIFIER L_BRACE methodParams R_BRACE methodCallend | IDENTIFIER POINT IDENTIFIER L_BRACE methodParams R_BRACE methodCallend
    | POINT IDENTIFIER L_BRACE methodParams R_BRACE methodCallend;
methodCallend: IDENTIFIER L_BRACE methodParams R_BRACE methodCallend | IDENTIFIER POINT IDENTIFIER L_BRACE methodParams R_BRACE methodCallend
                   | POINT IDENTIFIER L_BRACE methodParams R_BRACE methodCallend | ;
methodParams: expr | expr COMMA expr | ;

