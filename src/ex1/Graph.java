package ex1;

import ex1.factories.AbstractEdgeFactory;
import ex1.factories.AbstractNodeFactory;

import java.util.LinkedList;
import java.util.List;

public class Graph implements IGraph {

    protected List<Edge> edges;
    protected List<Node> nodes;

    protected AbstractEdgeFactory edgeFactory;
    protected AbstractNodeFactory nodeFactory;

    public Graph(AbstractEdgeFactory edgeFactory, AbstractNodeFactory nodeFactory) {
        this.edges = new LinkedList<>();
        this.nodes = new LinkedList<>();
        this.edgeFactory = edgeFactory;
        this.nodeFactory = nodeFactory;
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
        Node n = this.nodeFactory.createNode(nodeId);
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
