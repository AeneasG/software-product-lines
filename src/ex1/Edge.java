package ex1;

public class Edge {
    private Node a;
    private Node b;
    private Integer weight;

    private Color color;

    public Edge(Node a, Node b, Integer weight) {
        this.a = a;
        this.b = b;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public boolean hasOneNodeColor(Color colorOfPassed) {
        return this.a.getColor() == colorOfPassed && this.b.getColor() != colorOfPassed || this.b.getColor() == colorOfPassed && this.a.getColor() != colorOfPassed;
    }
}
