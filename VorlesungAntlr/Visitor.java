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
            return getNodes(functionContext, params, returnType);
        }
        Node returnType = new Node("void", NodeType.VOID);
        return getNodes(functionContext, params, returnType);
    }

    private List<Node> getNodes(ParserGo.FunctionContext functionContext, Node params, Node returnType) {
        Node declarations = new Node("declarations");
        if(functionContext.functionBody().declaration().getChild(0) != null){
            declarations.setChildren(getDeclarations(functionContext.functionBody().declaration()));
        }
        Node expressions = new Node("expressions");
        if(functionContext.functionBody().expressions().getChild(0) != null){
            expressions.setChildren(getExpressions(functionContext.functionBody().expressions()));
        }
        if(functionContext.functionBody().return_().getChild(0) != null){
            Node returnNode = new Node("return");
            returnNode.setChildren(List.of(getExpr(functionContext.functionBody().return_().expr())));
            return List.of(params, returnType, declarations, expressions,returnNode);
        }
        return List.of(params, returnType, declarations, expressions);
    }

    private List<Node> getExpressions(ParserGo.ExpressionsContext expressionNode) {
        List<Node> expressions = new ArrayList<>();
        //varibale assigment
        if(expressionNode.variableAssignment() != null) {
            String identifier = expressionNode.variableAssignment().IDENTIFIER().getText();
            Node ident = new Node(identifier);
            return recursiveExpr(expressionNode, expressions, ident);
        }
        //if
        if(expressionNode.if_() != null) {
            //if case
            Node ifClause = new Node("if", NodeType.BOOL);
            Node condition = new Node("condition");
            condition.setChildren(List.of(getExpr(expressionNode.if_().expr())));
            Node body = new Node("body");
            body.setChildren(getExpressions(expressionNode.if_().expressions()));
            ifClause.addChild(condition);
            ifClause.addChild(body);
            if(expressionNode.if_().else_().getChild(0) != null) {
                Node elseClause = new Node("else", NodeType.FUNCTION);
                elseClause.setChildren(getExpressions(expressionNode.if_().else_().expressions()));
                if(expressionNode.if_().else_().return_().getChild(0) != null){
                    Node returnClause =  new Node("return");
                    returnClause.setChildren(List.of(getExpr(expressionNode.if_().else_().return_().expr())));
                    elseClause.addChild(returnClause);
                }
                ifClause.addChild(elseClause);
            }
            if(expressionNode.if_().return_().getChild(0) != null){
                Node returnClause = new Node("return");
                returnClause.setChildren(List.of(getExpr(expressionNode.if_().return_().expr())));
                ifClause.addChild(returnClause);
            }
            expressions.add(ifClause);
            if (expressionNode.expressions().getChild(0) != null) {
                expressions.addAll(getExpressions(expressionNode.expressions()));
            }
        }


        return expressions;
    }

    private List<Node> recursiveExpr(ParserGo.ExpressionsContext expressionNode, List<Node> expressions, Node ident) {
        if (expressionNode.variableAssignment().expr().getChildCount() == 1) {
            //the children of unary
            if (expressionNode.variableAssignment().expr().getChild(0).getChildCount() == 2) {
                String lowerText = expressionNode.variableAssignment().expr().getChild(0).getChild(1).getText(); //right child of unary (number)
                Node lower = new Node(lowerText, getNodetype(lowerText));
                String rootText = expressionNode.variableAssignment().expr().getChild(0).getChild(0).getText();//left child of unary (operator)
                ident.setChildren(List.of(new Node(rootText, getNodetype(rootText), List.of(lower))));
                expressions.add(ident);
            } else { //if there is just on child (eg.number)
                String declarationText = expressionNode.variableAssignment().expr().getChild(0).getText();
                Node declaration = new Node(declarationText, getNodetype(declarationText));
                ident.setChildren(List.of(declaration));
                expressions.add(ident);
            }
        }
        if (expressionNode.variableAssignment().expr().getChildCount() == 3) {
            if (expressionNode.variableAssignment().expr().getChild(0).getText().equals("(")) {
                if (expressionNode.variableAssignment().expr().expr(0).getChildCount() == 3) {
                    String declarationText = expressionNode.variableAssignment().expr().expr(0).getChild(1).getText();
                    getLeftAndRightChild(expressionNode, expressions, ident, declarationText);
                }
            }
            String declarationText = expressionNode.variableAssignment().expr().getChild(1).getText();
            getLeftAndRightChild(expressionNode, expressions, ident, declarationText);
        }
        if (expressionNode.expressions().getChild(0) != null) {
            expressions.addAll(getExpressions(expressionNode.expressions()));
        }
        return expressions;
    }

    private void getLeftAndRightChild(ParserGo.ExpressionsContext expressionNode, List<Node> expressions, Node ident, String declarationText) {
        Node declaration = new Node(declarationText,getNodetype(declarationText));
        Node leftchild = getExpr(expressionNode.variableAssignment().expr().getChild(0));
        Node rightchild = getExpr(expressionNode.variableAssignment().expr().getChild(2));
        declaration.setChildren(List.of(leftchild, rightchild));
        ident.setChildren(List.of(declaration));
        expressions.add(ident);
    }

    private List<Node> getDeclarations(ParserGo.DeclarationContext declarationNode) { //child = function
        List<Node> declarations = new ArrayList<>();
        String identifier = declarationNode.IDENTIFIER().getText();
        Node ident = new Node(identifier, getNodetype(identifier));
        if(declarationNode.expr().getChildCount() == 1){
            if(declarationNode.expr().getChild(0).getChildCount() == 2){
                String lowerText = declarationNode.expr().getChild(0).getChild(1).getText(); //right child of unary (number)
                Node lower = new Node(lowerText, getNodetype(lowerText));
                String rootText = declarationNode.expr().getChild(0).getChild(0).getText();//left child of unary (operator)
                ident.setChildren(List.of(new Node(rootText, getNodetype(rootText), List.of(lower))));
                declarations.add(ident);
            }else {
                String declarationText = declarationNode.expr().getChild(0).getText();
                Node declaration = new Node(declarationText, getNodetype(declarationText));
                ident.setChildren(List.of(declaration));
                declarations.add(ident);
            }
        }
        if(declarationNode.expr().getChildCount() == 3){
            if(declarationNode.expr().getChild(0).getText().equals("(")){
                if(declarationNode.expr().expr(0).getChildCount() == 3){
                    String declarationText = declarationNode.expr().expr(0).getChild(1).getText();
                    Node declaration = new Node(declarationText,getNodetype(declarationText));
                    Node leftchild = getExpr(declarationNode.expr().expr(0).getChild(0));
                    Node rightchild = getExpr(declarationNode.expr().expr(0).getChild(2));
                    declaration.setChildren(List.of(leftchild, rightchild));
                    ident.setChildren(List.of(declaration));
                    declarations.add(ident);
                }
            }
            String declarationText = declarationNode.expr().getChild(1).getText();
            Node declaration = new Node(declarationText,getNodetype(declarationText));
            Node leftchild = getExpr(declarationNode.expr().getChild(0));
            Node rightchild = getExpr(declarationNode.expr().getChild(2));
            declaration.setChildren(List.of(leftchild, rightchild));
            ident.setChildren(List.of(declaration));
            declarations.add(ident);
        }
        if(declarationNode.declaration().getChild(0) != null){
            declarations.addAll(getDeclarations(declarationNode.declaration()));
        }
        return declarations;
    }

    private Node getExpr(ParseTree child) {
        if(child.getChildCount() == 1){
            String unary = child.getChild(0).getText();
            if(child.getChild(0).getChildCount() == 2){
                String lowerText = child.getChild(0).getChild(1).getText(); //right child of unary (number)
                Node lower = new Node(lowerText, getNodetype(lowerText));
                String rootText = child.getChild(0).getChild(0).getText();//left child of unary (operator)
                return new Node(rootText, getNodetype(rootText), List.of(lower));
            }
            return new Node(child.getChild(0).getText(), getNodetype(child.getChild(0).getText()));
        }
        if(child.getChild(0).getText().equals("(") || child.getChild(2).getText().equals(")")){
            // wenn langer ausdruch in Klammern
            if(child.getChild(1).getChild(2) != null) {
                String rootText = child.getChild(1).getChild(1).getText(); //operator
                Node root = new Node(rootText, getNodetype(rootText));
                Node leftchild = getExpr(child.getChild(1).getChild(0));
                Node rightchild = getExpr(child.getChild(1).getChild(2));
                root.setChildren(List.of(leftchild, rightchild));
                return root;
            }
            //                           expr ->      unary->         6
            String lowerText = child.getChild(1).getChild(0).getChild(1).getText();
            Node lower = new Node(lowerText, getNodetype(lowerText));
            String rootText = child.getChild(1).getChild(0).getChild(0).getText(); // -
            return new Node(rootText, getNodetype(rootText), List.of(lower));
        }
        Node root = new Node(child.getChild(1).getText(), getNodetype(child.getChild(1).getText()));
        Node leftchild = getExpr(child.getChild(0));
        Node rightchild = getExpr(child.getChild(2));
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
