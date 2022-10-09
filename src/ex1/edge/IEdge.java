package ex1.edge;

import ex1.node.INode;
import ex1.node.Node;

public interface IEdge {
    Boolean isMarked();
    Boolean isExactlyOneNodeMarked();
    void mark();
    void unmark();
    INode getA();
    INode getB();
}
