package ex1.factories;

import ex1.Node;

public class NodeFactory extends AbstractNodeFactory {
    @Override
    public Node createNode(String id) {
        return new Node(id);
    }
}
