package ex1;

public class Edge {
    protected Node a;
    protected Node b;
    protected Boolean isMarked;

    public Edge(Node a, Node b) {
        this.a = a;
        this.b = b;
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



    public Node getA() {
        return a;
    }

    public Node getB() {
        return b;
    }
}
