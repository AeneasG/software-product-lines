package ex1.algorithms;

import ex1.edge.IEdge;
import ex1.graph.IGraph;
import ex1.graph.WeightedGraph;
import ex1.node.INode;
import ex1.node.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private final IGraph graph;

    public DepthFirstSearch(WeightedGraph graph) {
        this.graph = graph;
    }

    public List<IEdge> calculate(String nodeId) {
        List<IEdge> edges = this.graph.getEdges();
        List<INode> nodes = this.graph.getNodes();
        List<IEdge> result = new LinkedList<>();
        if(edges.isEmpty() || nodes.isEmpty()) {
            return result;
        }

        INode firstNode = nodes.get(0);
        result = traverseNonRecursive(firstNode, nodeId);

        for(IEdge e: edges) {
            e.unmark();
        }
        for(INode n: nodes) {
            n.unmark();
        }

        return result;
    }

    private List<IEdge> traverseNonRecursive(INode n, String target) {
        n.mark();
        Stack<IEdge> edges = new Stack<>();
        edges.addAll(n.getEdges());
        List<IEdge> result = new LinkedList<>();
        while(!edges.isEmpty()) {
            IEdge e = edges.pop();
            if(!e.isMarked() && e.isExactlyOneNodeMarked()) {
                INode next = e.getA() == n ? e.getB() : e.getA();
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
