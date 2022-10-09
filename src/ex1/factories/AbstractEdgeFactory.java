package ex1.factories;

import ex1.edge.Edge;
import ex1.node.INode;
import ex1.node.Node;
import ex1.edge.IEdge;

public abstract class AbstractEdgeFactory {

    public IEdge createEdge(INode a, INode b) {
        return new Edge(a, b);
    }
}
