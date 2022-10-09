package ex1;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private List<WeightedEdge> edges;

    private Boolean isMarked;
    private String nodeId;

    public Node(String nodeId) {
        this.edges = new LinkedList<WeightedEdge>();
        this.nodeId = nodeId;
        this.isMarked = false;
    }

    void addEdge(WeightedEdge edge) {
        this.edges.add(edge);
    }

    public List<WeightedEdge> getEdges() {
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
        return this.nodeId + "";
    }
}
