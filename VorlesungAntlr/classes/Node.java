package classes;

import classes.NodeType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Node {

    List<Node> children = new ArrayList<>();
    String value = "";
    NodeType type;

    public Node() {
    }

    public Node(String value){
        this.value = value;
    }

    public Node(String value, List<Node> children){
        this.children = children;
        this.value = value;
    }

    public Node(String value, NodeType type){
        this.value = value;
        this.type = type;
    }

    public Node(String value, NodeType type, List<Node> children){
        this.value = value;
        this.type = type;
        this.children = children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public void addChild(Node child){
        this.children.add(child);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setType(NodeType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public List<Node> getChildren() {
        return children;
    }
    public Node getChild(int number){
        return children.get(number);
    }

    public NodeType getType() {
        return type;
    }

    public int getChildcount() {
        return children.size();
    }
    public String toString() {
        StringBuilder buffer = new StringBuilder(500000);
        print(buffer, "", "");
        return buffer.toString();
    }

    // Print Methode ist aus Stackoverflow
    private void print(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        buffer.append(value);
        //type
        buffer.append('\n');
        for (Iterator<Node> it = children.iterator(); it.hasNext();) {
            Node next = it.next();
            if (it.hasNext()) {
                next.print(buffer, childrenPrefix + " |--- ", childrenPrefix + " |   ");
            } else {
                next.print(buffer, childrenPrefix + " '--- ", childrenPrefix + "     ");
            }
        }
    }
}
