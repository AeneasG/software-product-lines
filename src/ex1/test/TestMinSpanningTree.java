package ex1.test;

import ex1.*;
import ex1.algorithms.DepthFirstSearch;
import ex1.algorithms.MinimumSpanningTree;
import ex1.factories.NodeFactory;
import ex1.factories.WeightedEdgeFactory;

import java.util.HashMap;
import java.util.List;

public class TestMinSpanningTree {

    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(new Graph(new WeightedEdgeFactory(), new NodeFactory()));

        HashMap<String, Node> nodes = new HashMap<String, Node>();

        String[] nodeChars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (String nodeId : nodeChars) {
            nodes.put(nodeId, graph.addNode(nodeId));
        }

        graph.addEdge(nodes.get("A"), nodes.get("B"), 9);
        graph.addEdge(nodes.get("A"), nodes.get("C"), 3);
        graph.addEdge(nodes.get("A"), nodes.get("D"), 6);
        graph.addEdge(nodes.get("B"), nodes.get("C"), 9);
        graph.addEdge(nodes.get("B"), nodes.get("F"), 8);
        graph.addEdge(nodes.get("B"), nodes.get("J"), 18);
        graph.addEdge(nodes.get("C"), nodes.get("D"), 4);
        graph.addEdge(nodes.get("C"), nodes.get("E"), 2);
        graph.addEdge(nodes.get("C"), nodes.get("F"), 9);
        graph.addEdge(nodes.get("D"), nodes.get("E"), 2);
        graph.addEdge(nodes.get("D"), nodes.get("G"), 9);
        graph.addEdge(nodes.get("E"), nodes.get("F"), 8);
        graph.addEdge(nodes.get("E"), nodes.get("G"), 9);
        graph.addEdge(nodes.get("F"), nodes.get("G"), 7);
        graph.addEdge(nodes.get("F"), nodes.get("I"), 9);
        graph.addEdge(nodes.get("F"), nodes.get("J"), 10);
        graph.addEdge(nodes.get("G"), nodes.get("H"), 4);
        graph.addEdge(nodes.get("G"), nodes.get("I"), 5);
        graph.addEdge(nodes.get("H"), nodes.get("I"), 1);
        graph.addEdge(nodes.get("H"), nodes.get("J"), 4);
        graph.addEdge(nodes.get("I"), nodes.get("J"), 3);

        MinimumSpanningTree min = new MinimumSpanningTree(graph);
        List<WeightedEdge> minSpanningTree = min.calculate();
        for(WeightedEdge e : minSpanningTree) {
            System.out.println(e.getA() + ", " + e.getB());
        }

        System.out.println("DFS result");
        DepthFirstSearch dfs = new DepthFirstSearch(graph);
        List<Edge> res = dfs.calculate("G");
        for(Edge e : res) {
            System.out.println(e.getA() + ", " + e.getB());
        }
    }
}
