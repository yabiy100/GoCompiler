// UNIX:
// java -jar antlr-4.11.1-complete.jar LexerGo.g4
// java -jar antlr-4.11.1-complete.jar -visitor ParserGo.g4
// javac -cp antlr-4.11.1-complete.jar *.java
// java -classpath antlr-4.11.1-complete.jar:. Main input.txt
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

//FILE -> PROJECT STRUCTURE
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
        ParseTree tree = parser.s();
        Visitor visitor = new Visitor();
        visitor.visit(tree);

        System.out.println(visitor.getRoot().toString());
        System.out.println("Parsing finished");

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
