package ex1;

import java.util.List;

public abstract class GraphDecorator implements IGraph {

    protected IGraph graph;

    public GraphDecorator(IGraph graph) {
        this.graph = graph;
    }

    public Edge addEdge(Node a, Node b) {
        return this.graph.addEdge(a, b);
    }

    public Node addNode(String nodeId) {
        return this.graph.addNode(nodeId);
    }

    public List<Edge> getEdges() {
        return this.graph.getEdges();
    }

    public List<WeightedEdge> getWeightedEdges() {
        return this.getEdges().stream().map(e -> (WeightedEdge) e).toList();
    }

    public List<Node> getNodes() {
        return this.graph.getNodes();
    }
}
