package ex1.graph;

import ex1.node.INode;
import ex1.node.Node;
import ex1.edge.IEdge;
import ex1.edge.WeightedEdge;

import java.util.List;

public abstract class GraphDecorator implements IGraph {

    protected IGraph graph;

    public GraphDecorator(IGraph graph) {
        this.graph = graph;
    }

    public IEdge addEdge(INode a, INode b) {
        return this.graph.addEdge(a, b);
    }

    public INode addNode(String nodeId) {
        return this.graph.addNode(nodeId);
    }

    public List<IEdge> getEdges() {
        return this.graph.getEdges();
    }

    public List<WeightedEdge> getWeightedEdges() {
        return this.getEdges().stream().map(e -> (WeightedEdge) e).toList();
    }

    public List<INode> getNodes() {
        return this.graph.getNodes();
    }
}
