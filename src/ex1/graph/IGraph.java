package ex1.graph;

import ex1.node.INode;
import ex1.node.Node;
import ex1.edge.IEdge;

import java.util.List;

public interface IGraph {
    public IEdge addEdge(INode a, INode b);
    public INode addNode(String nodeId);
    public List<IEdge> getEdges();
    public List<INode> getNodes();
}
