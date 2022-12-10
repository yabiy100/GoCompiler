parser grammar ParserGo;

options{
tokenVocab=LexerGo;
}
s :   package imports function;
package: PACKAGE MAIN newLine;

imports: IMPORT IMPORTNAME;

function: FUNC MAIN L_BRACE params R_BRACE returnType L_BRACKET R_BRACKET function | ;

params: IDENTIFIER TYPE | IDENTIFIER TYPE COMMA params |  ;

returnType: TYPE | ;

newLine: NEWLINE | NEWLINE newLine;