package ex1.factories;

import ex1.node.INode;
import ex1.node.LabelledNode;
import ex1.node.Node;

public class LabelledNodeFactory extends AbstractNodeFactory {
    @Override
    public INode createNode(String id) {
        return createNode(id, "");
    }
    public INode createNode(String id, String label) {
        return new LabelledNode(new Node(id), label);
    }
}
