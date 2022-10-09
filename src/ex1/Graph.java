package ex1;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    List<WeightedEdge> edges;
    List<Node> nodes;

    public Graph() {
        this.edges = new LinkedList<>();
        this.nodes = new LinkedList<>();
    }

    public WeightedEdge addEdge(Node a, Node b, Integer weight) {
        WeightedEdge e = new WeightedEdge(a, b, weight);
        a.addEdge(e);
        b.addEdge(e);
        this.edges.add(e);
        return e;
    }

    public Node addNode(String nodeId) {
        Node n = new Node(nodeId);
        this.nodes.add(n);
        return n;
    }

    public List<WeightedEdge> getEdges() {
        return this.edges;
    }

    public List<Node> getNodes() {
        return this.nodes;
    }
}
