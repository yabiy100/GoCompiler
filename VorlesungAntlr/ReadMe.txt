wsl
sudo apt install openjdk-17-jdk
sudo curl -O https://www.antlr.org/download/antlr-4.7.2-complete.jar
sudo apt install antlr4

antlr4 Expr.g4 (java -jar antlr-4.7.2-complete.jar Expo.g4
javac *.java
javac -cp antlr-4.7.2-complete.jar *.java
java org.antlr.v4.gui.TestRig Expr prog -gui

antlr4 -Dlanguage=Python3 Basic.g4
python.exe main.py input.txt

0_Basis:
java -jar antlr-4.11.1-complete.jar Basic.g4
javac -cp antlr-4.11.1-complete.jar *.java
java -cp .:antlr-4.11.1-complete.jar org.antlr.v4.gui.TestRig Basic s -gui input.txt

1_Expr:
java -jar antlr-4.7.2-complete.jar Expr.g4
javac -cp antlr-4.7.2-complete.jar *.java
java -cp .:antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig Expr prog -gui input.txt

3_Lexer_and_Parser:
//pip3 install antlr4-python3-runtime==4.11
antlr -Dlanguage=Python3 ExprLexer.g4
python3 main.py input.txt

Projekt:
java -jar antlr-4.11.1-complete.jar LexerGo.g4
java -jar antlr-4.11.1-complete.jar ParserGo.g4
javac -cp antlr-4.11.1-complete.jar *.java
java -cp .:antlr-4.11.1-complete.jar org.antlr.v4.gui.TestRig ParserGo s -gui input.txt



antlr ExprParser.g4