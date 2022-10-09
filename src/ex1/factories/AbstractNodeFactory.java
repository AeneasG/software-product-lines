package ex1.factories;

import ex1.node.INode;

public abstract class AbstractNodeFactory {

    public abstract INode createNode(String id);
}
