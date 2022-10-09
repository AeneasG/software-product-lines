package ex1.edge;

public class WeightedEdge extends EdgeDecorator {
    protected Integer weight;


    public WeightedEdge(IEdge e, Integer weight) {
        super(e);
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
