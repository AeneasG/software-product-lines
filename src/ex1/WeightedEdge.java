package ex1;

public class WeightedEdge {
    private Node a;
    private Node b;
    private Integer weight;

    private Boolean isMarked;

    public WeightedEdge(Node a, Node b, Integer weight) {
        this.a = a;
        this.b = b;
        this.weight = weight;
        this.isMarked = false;
    }

    public Boolean isMarked() {
        return isMarked;
    }

    public Boolean isExactlyOneNodeMarked() {
        return this.a.isMarked() && !this.b.isMarked() || !this.a.isMarked() && this.b.isMarked();
    }

    public void mark() {
        this.isMarked = true;
    }

    public void unmark() {
        this.isMarked = false;
    }

    public Integer getWeight() {
        return weight;
    }

    public Node getA() {
        return a;
    }

    public Node getB() {
        return b;
    }
}
