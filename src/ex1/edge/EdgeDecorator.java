package ex1.edge;

import ex1.node.INode;
import ex1.node.Node;

public abstract class EdgeDecorator implements IEdge {
    protected IEdge edge;

    public EdgeDecorator(IEdge e) {
        this.edge = e;
    }

    public Boolean isMarked() {
        return this.edge.isMarked();
    }

    public Boolean isExactlyOneNodeMarked() {
        return this.edge.isExactlyOneNodeMarked();
    }

    public void mark() {
        this.edge.mark();
    }

    public void unmark() {
        this.edge.unmark();
    }



    public INode getA() {
        return this.edge.getA();
    }

    public INode getB() {
        return this.edge.getB();
    }
}
