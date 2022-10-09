package ex1.factories;

import ex1.LabelledNode;
import ex1.Node;

public class LabelledNodeFactory extends AbstractNodeFactory {
    @Override
    public Node createNode(String id) {
        return createNode(id, "");
    }
    public Node createNode(String id, String label) {
        return new LabelledNode(id, label);
    }
}
