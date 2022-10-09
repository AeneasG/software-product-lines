package ex1;

import ex1.factories.AbstractEdgeFactory;

import java.util.LinkedList;
import java.util.List;

public class Graph implements IGraph {

    protected List<Edge> edges;
    protected List<Node> nodes;

    protected AbstractEdgeFactory edgeFactory;

    public Graph(AbstractEdgeFactory edgeFactory) {
        this.edges = new LinkedList<>();
        this.nodes = new LinkedList<>();
        this.edgeFactory = edgeFactory;
    }

    @Override
    public Edge addEdge(Node a, Node b) {
        Edge e = this.edgeFactory.createEdge(a, b);
        this.edges.add(e);
        a.addEdge(e);
        b.addEdge(e);
        return e;
    }

    @Override
    public Node addNode(String nodeId) {
        Node n = new Node(nodeId);
        this.nodes.add(n);
        return n;
    }

    @Override
    public List<Edge> getEdges() {
        return this.edges;
    }

    @Override
    public List<Node> getNodes() {
        return this.nodes;
    }
}
