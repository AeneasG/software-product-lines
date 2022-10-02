package ex1;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private List<Edge> edges;
    private Color color;

    private char nodeId;

    public Node(char nodeId) {
        this.edges = new LinkedList<Edge>();
        this.nodeId = nodeId;
    }

    void addEdge(Edge edge) {
        this.edges.add(edge);
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return this.nodeId + "";
    }
}
