package ex1.algorithms;

import ex1.Graph;
import ex1.Node;
import ex1.WeightedEdge;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private final Graph graph;

    public DepthFirstSearch(Graph graph) {
        this.graph = graph;
    }

    public List<WeightedEdge> calculate(String nodeId) {
        Boolean traversingOnly = nodeId == null;

        List<WeightedEdge> edges = this.graph.getEdges();
        List<Node> nodes = this.graph.getNodes();
        List<WeightedEdge> result = new LinkedList<>();
        if(edges.isEmpty() || nodes.isEmpty()) {
            return result;
        }

        Node firstNode = nodes.get(0);
        result = traverseNonRecursive(firstNode, nodeId);

        for(WeightedEdge e: edges) {
            e.unmark();
        }
        for(Node n: nodes) {
            n.unmark();
        }

        return result;
    }

    private List<WeightedEdge> traverse(Node n, String target) {
        n.mark();
        List<WeightedEdge> edges = n.getEdges();
        List<WeightedEdge> result = new LinkedList<>();
        for(WeightedEdge e: edges) {
            if(!e.isMarked() && e.isExactlyOneNodeMarked()) {
                Node next = e.getA() == n ? e.getB() : e.getA();
                e.mark();
                if(next.getNodeId().equals(target)) {
                    return result;
                }
                result.addAll(traverse(next, target));
            }
        }
        return result;
    }
    private List<WeightedEdge> traverseNonRecursive(Node n, String target) {
        n.mark();
        Stack<WeightedEdge> edges = new Stack<>();
        edges.addAll(n.getEdges());
        List<WeightedEdge> result = new LinkedList<>();
        while(!edges.isEmpty()) {
            WeightedEdge e = edges.pop();
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
