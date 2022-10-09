package ex1.factories;

import ex1.edge.Edge;
import ex1.node.INode;
import ex1.node.Node;
import ex1.edge.IEdge;
import ex1.edge.WeightedEdge;

public class WeightedEdgeFactory extends AbstractEdgeFactory {

    @Override
    public IEdge createEdge(INode a, INode b) {
        return createEdge(a, b, 0);
    }
    public WeightedEdge createEdge(INode a, INode b, Integer weight) {
        return new WeightedEdge(super.createEdge(a,b), weight);
    }
}
