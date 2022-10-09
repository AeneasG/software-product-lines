package ex1.node;

import ex1.edge.IEdge;

import java.util.LinkedList;
import java.util.List;

public class Node implements INode {
    protected List<IEdge> edges;

    protected Boolean isMarked;
    protected String nodeId;

    public Node(String nodeId) {
        this.edges = new LinkedList<>();
        this.nodeId = nodeId;
        this.isMarked = false;
    }

    public void addEdge(IEdge edge) {
        this.edges.add(edge);
    }

    public List<IEdge> getEdges() {
        return edges;
    }

    public Boolean isMarked() {
        return this.isMarked;
    }

    public void mark() {
        this.isMarked = true;
    }

    public void unmark() {
        this.isMarked = false;
    }

    public String toString() {
        return this.nodeId;
    }

    public String getNodeId() {
        return this.nodeId;
    }
}
