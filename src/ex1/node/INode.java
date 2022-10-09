package ex1.node;

import ex1.edge.IEdge;

import java.util.List;

public interface INode {
    void addEdge(IEdge edge);

    List<IEdge> getEdges();

    Boolean isMarked();

    void mark();

    void unmark();

    String toString();

    String getNodeId();
}
