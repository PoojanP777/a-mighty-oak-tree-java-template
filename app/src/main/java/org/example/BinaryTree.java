package org.example;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(Squirrel rootData) {
        this.root = new Node(rootData);
    }

    public void addLeftChild(Node parent, Squirrel childData) {
        if (parent != null) {
            parent.setLeft(new Node(childData));
        }
    }

    public void addRightChild(Node parent, Squirrel childData) {
        if (parent != null) {
            parent.setRight(new Node(childData));
        }
    }

    public Node getRoot() {
        return root;
    }

    
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.println(node.getData().getName());
            traversePreOrder(node.left());
            traversePreOrder(node.right());
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left());
            System.out.println(node.getData().getName());
            traverseInOrder(node.right());
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left());
            traversePostOrder(node.right());
            System.out.println(node.getData().getName());
        }
    }
}