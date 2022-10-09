package ex1;

public class WeightedGraph extends GraphDecorator implements IGraph {

    public WeightedGraph(IGraph graph) {
        super(graph);
    }

    public WeightedEdge addEdge(Node a, Node b, Integer weight) {
        // we know the Edge is a Weighted Edge because of our Factory
        WeightedEdge e = (WeightedEdge) super.addEdge(a, b);
        e.setWeight(weight);
        return e;
    }

    @Override
    public Edge addEdge(Node a, Node b) {
        return this.addEdge(a, b, 0);
    }
}
