package ex1.algorithms;

import ex1.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private final IGraph graph;

    public DepthFirstSearch(WeightedGraph graph) {
        this.graph = graph;
    }

    public List<Edge> calculate(String nodeId) {
        List<Edge> edges = this.graph.getEdges();
        List<Node> nodes = this.graph.getNodes();
        List<Edge> result = new LinkedList<>();
        if(edges.isEmpty() || nodes.isEmpty()) {
            return result;
        }

        Node firstNode = nodes.get(0);
        result = traverseNonRecursive(firstNode, nodeId);

        for(Edge e: edges) {
            e.unmark();
        }
        for(Node n: nodes) {
            n.unmark();
        }

        return result;
    }

    private List<Edge> traverseNonRecursive(Node n, String target) {
        n.mark();
        Stack<Edge> edges = new Stack<>();
        edges.addAll(n.getEdges());
        List<Edge> result = new LinkedList<>();
        while(!edges.isEmpty()) {
            Edge e = edges.pop();
            if(!e.isMarked() && e.isExactlyOneNodeMarked()) {
                Node next = e.getA() == n ? e.getB() : e.getA();
                e.mark();
                next.mark();
                result.add(e);
                if(next.getNodeId().equals(target)) {
                    return result;
                }
                edges.addAll(next.getEdges());
                n = next;
            }
        }
        return result;
    }

}
