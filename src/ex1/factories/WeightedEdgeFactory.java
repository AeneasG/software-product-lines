package ex1.factories;

import ex1.Edge;
import ex1.Node;
import ex1.WeightedEdge;

public class WeightedEdgeFactory extends AbstractEdgeFactory {

    @Override
    public Edge createEdge(Node a, Node b) {
        return createEdge(a, b, 0);
    }
    public Edge createEdge(Node a, Node b, Integer weight) {
        return new WeightedEdge(a, b, weight);
    }
}
