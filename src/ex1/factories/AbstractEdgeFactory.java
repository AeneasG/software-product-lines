package ex1.factories;

import ex1.Edge;
import ex1.Node;

public abstract class AbstractEdgeFactory {

    public abstract Edge createEdge(Node a, Node b);
}
