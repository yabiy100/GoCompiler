parser grammar ParserGo;

options{
tokenVocab=LexerGo;
}
s :   package imports function;
package: PACKAGE IDENTIFIER newLine;

imports: IMPORT IMPORTNAME newLine;

function: FUNC IDENTIFIER L_BRACE params R_BRACE returnType L_BRACKET newLine R_BRACKET newLine function | ;

params: IDENTIFIER TYPE | IDENTIFIER TYPE COMMA params |  ;

returnType: TYPE | ;

newLine: NEWLINE | NEWLINE newLine;