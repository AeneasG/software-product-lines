package ex1;

public class WeightedEdge extends Edge {
    protected Integer weight;


    public WeightedEdge(Node a, Node b, Integer weight) {
        super(a,b);
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
