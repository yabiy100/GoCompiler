import classes.Node;
import classes.NodeType;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;


public class Visitor extends ParserGoBaseVisitor<Node> {
    private Node root = new Node();

    @Override
    public Node visitS(ParserGo.SContext ctx) {
        root.setValue("Start");
        root.setChildren(getFunctions(ctx.function())); //function
        return root;
    }

    private List<Node> getFunctions(ParserGo.FunctionContext functionContext) { //child = function
        List<Node> functions = new ArrayList<>();
        //functionContext.functionHead().getText();
        Node function = new Node(functionContext.functionHead().getText(), NodeType.FUNCTION);
        function.setChildren(this.visitFunc(functionContext));
        functions.add(function);
        if(functionContext.function().functionHead() != null){
            functions.addAll(getFunctions(functionContext.function()));
        }
        return functions;
    }

    public List<Node> visitFunc(ParserGo.FunctionContext functionContext) { //child = function
        Node params = new Node("params");
        if(functionContext.functionHead().params().getChild(0) != null) {
            params.setChildren(getParams(functionContext.functionHead().params()));
        }
        ParseTree returnNode = functionContext.functionHead().returnType().getChild(0);
        if (returnNode != null) {
            String returnText = functionContext.functionHead().returnType().getChild(0).getText();
            Node returnType = new Node(returnText,getNodetype(returnText));
            Node declarations = new Node("declarations");
            declarations.setChildren(getDeclarations(functionContext.functionBody().declaration()));
            return List.of(params, returnType, declarations);
        }
        Node returnType = new Node("void", NodeType.VOID);
        Node declarations = new Node("declarations");
        declarations.setChildren(getDeclarations(functionContext.functionBody().declaration()));
        return List.of(params, returnType, declarations);
    }

    private List<Node> getDeclarations(ParserGo.DeclarationContext declarationNode) { //child = function
        List<Node> declarations = new ArrayList<>();
        String identifier = declarationNode.IDENTIFIER().getText();
        Node ident = new Node(identifier, getNodetype(identifier));
        if(declarationNode.expr().getChildCount() == 1){
            String declarationText = declarationNode.expr().getChild(0).getText();
            Node declaration = new Node(declarationText,getNodetype(declarationText));
            ident.setChildren(List.of(declaration));
            declarations.add(ident);
        }
        if(declarationNode.expr().getChildCount() == 3){
            String declarationText = declarationNode.expr().getChild(1).getText();
            Node declaration = new Node(declarationText,getNodetype(declarationText));
            Node leftchild = getExpression(declarationNode.expr().getChild(0));
            Node rightchild = getExpression(declarationNode.expr().getChild(2));
            declaration.setChildren(List.of(leftchild, rightchild));
            ident.setChildren(List.of(declaration));
            declarations.add(ident);
        }
        if(declarationNode.declaration().getChild(0) != null){
            declarations.addAll(getDeclarations(declarationNode.declaration()));
        }
        return declarations;
    }

    private Node getExpression(ParseTree child) {
        if(child.getChildCount() == 1){
            return new Node(child.getChild(0).getText(), getNodetype(child.getChild(0).getText()));
        }
        //ParseTree child = child.getChild(4).getChild(0).getChild(4);
        Node root = new Node(child.getChild(1).getText(), getNodetype(child.getChild(1).getText()));
        Node leftchild = getExpression(child.getChild(0));
        Node rightchild = getExpression(child.getChild(2));
        root.setChildren(List.of(leftchild, rightchild));
        return root;
    }

    private List<Node> getParams(ParseTree child) {
        List<Node> params = new ArrayList<>();
        params.add(new Node(child.getChild(0).getText(),getNodetype(child.getChild(1).getText())));
        if(child.getChildCount() == 4){
            params.addAll(getParams(child.getChild(3)));
        }
        return params;
    }

    public Node getRoot() {
        return root;
    }

    public NodeType getNodetype(String text){
        if(isNumeric(text)){
            return NodeType.NUMBER;
        }
        return switch (text) {
            case "-", "+" -> NodeType.NUMBER;
            case "&&", "||", "bool" -> NodeType.BOOL;
            case "int" -> NodeType.INT;
            case "float" -> NodeType.FLOAT;
            case "string" -> NodeType.STRING;
            default -> null;
        };
    }
    //methode von stack overflow
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }


}
