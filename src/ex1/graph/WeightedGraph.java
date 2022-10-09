package ex1.graph;

import ex1.node.INode;
import ex1.node.Node;
import ex1.edge.WeightedEdge;

public class WeightedGraph extends GraphDecorator implements IGraph {

    public WeightedGraph(IGraph graph) {
        super(graph);
    }

    public WeightedEdge addEdge(INode a, INode b, Integer weight) {
        // we know the Edge is a Weighted Edge because of our Factory
        WeightedEdge e = (WeightedEdge) super.addEdge(a, b);
        e.setWeight(weight);
        return e;
    }

    @Override
    public WeightedEdge addEdge(INode a, INode b) {
        return this.addEdge(a, b, 0);
    }
}
