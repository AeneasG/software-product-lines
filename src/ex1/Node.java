package ex1;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private List<Edge> edges;

    private Boolean isMarked;
    private String nodeId;

    public Node(String nodeId) {
        this.edges = new LinkedList<>();
        this.nodeId = nodeId;
        this.isMarked = false;
    }

    void addEdge(Edge edge) {
        this.edges.add(edge);
    }

    public List<Edge> getEdges() {
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
