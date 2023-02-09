import classes.Node;
import classes.NodeType;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;

public class TypeChecker {
    Node AST;
    HashMap<String, NodeType> variableTypes;
    public TypeChecker(Node root) {
        AST = root;
        variableTypes = new HashMap<>();
    }

    public void check() {
        for (Node function: AST.getChildren()){
            visit(function);
        }
    }

    private void visit(Node function) {
        if(function.getChild(1).getType() != function.getChild(4).getType()){
            System.err.println("Type " + function.getChild(1).getType() + " of function: " + function.getValue()+
                    " is not same as provited return value because its:" + function.getChild(4).getType());
        }
        //test declarations
        if(function.getChild(2).getChild(0) != null){
            for (Node declaration: function.getChild(2).getChildren()){
                visitDec(declaration);
            }
        }
        //test expressions
        if(function.getChild(3).getChild(0) != null){
            for (Node expression: function.getChild(3).getChildren()){
                visitExpression(expression);
            }
        }
    }

    private void visitExpression(Node expression) {
        Visitor typeGiver = new Visitor();
        if(expression.getType() == NodeType.IF){
            NodeType conditionType = typeGiver.getNodetype(expression.getChild(0).getChild(0).getValue());
            if(conditionType != NodeType.BOOL){
                System.err.println("If condition: " + expression.getChild(0).getChild(0).toString() + "is not a boolean");
            }
            if(expression.getChild(1).getChild(0) == null){
                System.err.println("If clause is empty");
                return;
            }
            for (Node expr: expression.getChild(1).getChildren()){
                visitExpression(expr);
            }
            if(expression.getChildcount() == 3) {
                if(expression.getChild(2).getValue() == "return"){
                    return;
                }//if its an else
                for (Node expr: expression.getChild(2).getChildren()){
                    visitExpression(expr);
                }
                return;
            }//expression.getCHildcount() == 4
            for (Node expr: expression.getChild(3).getChildren()){
                visitExpression(expr);
            }
        }
        if(expression.getType() == null){
            System.err.println("Variable: " + expression.getValue() + " is not previously declared");
            return;
        }
        NodeType decType = typeGiver.getNodetype(expression.getChild(0).getValue());
        NodeType expressionType = expression.getType();
        String name = expression.getValue();
        if(expressionType != decType) {
            System.err.println("Type " + expression.getType() + " of expression " + name +
                    " is not same as " + decType);
        }
    }

    private void visitDec(Node declaration) {
        Visitor typeGiver = new Visitor();
        NodeType decType = typeGiver.getNodetype(declaration.getChild(0).getValue());
        NodeType given = declaration.getType();
        String name = declaration.getValue();
        variableTypes.put(name, given);
        if(declaration.getType() != decType ){
            System.err.println("Type " + given + " of declaration " + name +
                    " is not same as " + decType);
        }
    }
}
