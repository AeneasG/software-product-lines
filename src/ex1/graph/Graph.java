package ex1.graph;

import ex1.node.INode;
import ex1.node.Node;
import ex1.edge.IEdge;
import ex1.factories.AbstractEdgeFactory;
import ex1.factories.AbstractNodeFactory;

import java.util.LinkedList;
import java.util.List;

public class Graph implements IGraph {

    protected List<IEdge> edges;
    protected List<INode> nodes;

    protected AbstractEdgeFactory edgeFactory;
    protected AbstractNodeFactory nodeFactory;

    public Graph(AbstractEdgeFactory edgeFactory, AbstractNodeFactory nodeFactory) {
        this.edges = new LinkedList<>();
        this.nodes = new LinkedList<>();
        this.edgeFactory = edgeFactory;
        this.nodeFactory = nodeFactory;
    }

    @Override
    public IEdge addEdge(INode a, INode b) {
        IEdge e = this.edgeFactory.createEdge(a, b);
        this.edges.add(e);
        a.addEdge(e);
        b.addEdge(e);
        return e;
    }

    @Override
    public INode addNode(String nodeId) {
        INode n = this.nodeFactory.createNode(nodeId);
        this.nodes.add(n);
        return n;
    }

    @Override
    public List<IEdge> getEdges() {
        return this.edges;
    }

    @Override
    public List<INode> getNodes() {
        return this.nodes;
    }
}
