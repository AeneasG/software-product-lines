package ex1.algorithms;

import ex1.*;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MinimumSpanningTree {

    WeightedGraph graph;

    public MinimumSpanningTree(WeightedGraph graph) {
        this.graph = graph;
    }

    public List<WeightedEdge> calculate() {
        List<WeightedEdge> edges = this.graph.getWeightedEdges();
        List<Node> nodes = this.graph.getNodes();
        List<WeightedEdge> result = new LinkedList<>();
        if(edges.isEmpty() || nodes.isEmpty()) {
            return result;
        }

        Node target = nodes.get(0);
        target.mark();
        WeightedEdge minWeight = findMinNotMarked();
        while(minWeight != null) {
            minWeight.mark();
            minWeight.getA().mark();
            minWeight.getB().mark();
            result.add(minWeight);

            minWeight = findMinNotMarked();
        }

        for(WeightedEdge e: edges) {
            e.unmark();
        }
        for(Node n: nodes) {
            n.unmark();
        }

        return result;
    }

    private WeightedEdge findMinNotMarked() {
        return this.graph.getNodes().stream()
                .filter(Node::isMarked)
                .map(Node::getEdges)
                .flatMap(List::stream)
                .filter(e -> !e.isMarked())
                .map(e -> (WeightedEdge) e)
                .filter(WeightedEdge::isExactlyOneNodeMarked)
                .min(Comparator.comparing(WeightedEdge::getWeight))
                .orElse(null);
    }
}
