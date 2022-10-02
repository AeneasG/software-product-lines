package ex1.algorithms;

import ex1.*;

import java.util.LinkedList;
import java.util.List;

public class MinimumSpanningTree {

    Graph graph;

    public MinimumSpanningTree(Graph graph) {
        this.graph = graph;
    }

    public List<Edge> calculate() {
        List<Edge> edges = this.graph.getEdges();
        List<Node> nodes = this.graph.getNodes();
        List<Edge> result = new LinkedList<>();
        if(edges.isEmpty() || nodes.isEmpty()) {
            return result;
        }

        Color passed = new Color("red");

        Node target = nodes.get(0);
        target.setColor(passed);
        Edge minWeight = findMinNotColored(edges, passed);
        while(minWeight != null) {
            minWeight.setColor(passed);
            minWeight.getA().setColor(passed);
            minWeight.getB().setColor(passed);
            result.add(minWeight);

            minWeight = findMinNotColored(edges, passed);
        }

        return result;
    }

    private Edge findMinNotColored(List<Edge> edges, Color colorOfPassed) {
        Edge cheapest = null;

        for (Edge edge : edges) {
            if (edge.getColor() != colorOfPassed && edge.hasOneNodeColor(colorOfPassed) && (cheapest == null || cheapest.getWeight() > edge.getWeight())) {
                cheapest = edge;
            }
        }
        return cheapest;
    }
}
