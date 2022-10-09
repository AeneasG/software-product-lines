package ex1.node;

import ex1.edge.IEdge;

import java.util.List;

public class NodeDecorator implements INode {

    protected INode n;

    public NodeDecorator(INode n) {
        this.n = n;
    }


    @Override
    public void addEdge(IEdge edge) {
        this.n.addEdge(edge);
    }

    @Override
    public List<IEdge> getEdges() {
        return this.n.getEdges();
    }

    @Override
    public Boolean isMarked() {
        return this.n.isMarked();
    }

    @Override
    public void mark() {
        this.n.mark();
    }

    @Override
    public void unmark() {
        this.n.unmark();
    }

    @Override
    public String getNodeId() {
        return this.n.getNodeId();
    }
}
