package ex1;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    List<Edge> edges;
    List<Node> nodes;

    public Graph() {
        this.edges = new LinkedList<>();
        this.nodes = new LinkedList<>();
    }

    public Edge addEdge(Node a, Node b, Integer weight) {
        Edge e = new Edge(a, b, weight);
        a.addEdge(e);
        b.addEdge(e);
        this.edges.add(e);
        return e;
    }

    public Node addNode(char nodeId) {
        Node n = new Node(nodeId);
        this.nodes.add(n);
        return n;
    }

    public List<Edge> getEdges() {
        return this.edges;
    }

    public List<Node> getNodes() {
        return this.nodes;
    }
}
