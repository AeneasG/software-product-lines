package ex1.edge;

public class DirectedEdge extends EdgeDecorator{

    public DirectedEdge(IEdge e) {
        super(e);
    }

    public Boolean isExactlyOneNodeMarked() {
        return this.getB().isMarked();
    }
}
