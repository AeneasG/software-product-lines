package ex1.edge;

import ex1.node.INode;
import ex1.node.Node;

public class Edge implements IEdge {
    protected INode a;
    protected INode b;
    protected Boolean isMarked;

    public Edge(INode a, INode b) {
        this.a = a;
        this.b = b;
        this.isMarked = false;
    }

    public Boolean isMarked() {
        return isMarked;
    }

    public Boolean isExactlyOneNodeMarked() {
        return this.a.isMarked() && !this.b.isMarked() || !this.a.isMarked() && this.b.isMarked();
    }

    public void mark() {
        this.isMarked = true;
    }

    public void unmark() {
        this.isMarked = false;
    }



    public INode getA() {
        return a;
    }

    public INode getB() {
        return b;
    }
}
