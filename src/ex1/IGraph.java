package ex1;

import java.util.List;

public interface IGraph {
    public Edge addEdge(Node a, Node b);
    public Node addNode(String nodeId);
    public List<Edge> getEdges();
    public List<Node> getNodes();
}
