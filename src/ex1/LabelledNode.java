package ex1;

public class LabelledNode extends Node {
    protected String label;

    public LabelledNode(String nodeId, String label) {
        super(nodeId);
        this.label = label;
    }
}
