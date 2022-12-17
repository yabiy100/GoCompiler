// UNIX:
// java -jar antlr-4.11.1-complete.jar LexerGo.g4
// java -jar antlr-4.11.1-complete.jar ParserGo.g4
// javac -cp antlr-4.11.1-complete.jar *.java
// java -classpath antlr-4.11.1-complete.jar:. Main input.txt
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {
        String input = readFile(args[0]);
        CharStream chars = CharStreams.fromString(input);
        Lexer lexer = new LexerGo(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParserGo parser = new ParserGo(tokens);
        System.out.println("Could parse the programm succesfully");

    }

    public static String readFile(String fileName) {
        String fileContent = "";

        try
        {
        byte[] bytes = Files.readAllBytes(Paths.get(fileName));
        fileContent = new String (bytes);
        }
        catch (IOException e)
        {
            e.printStackTrace(); // TODO: Fehlermeldung
        }
        return fileContent;
    }
}
