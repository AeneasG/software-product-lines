package ex1.node;

public class LabelledNode extends NodeDecorator {
    protected String label;

    public LabelledNode(INode node, String label) {
        super(node);
        this.label = label;
    }
}
