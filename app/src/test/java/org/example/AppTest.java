
package org.example;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void testNodeCreationWithData() {
        Squirrel testSquirrel = new Squirrel("Testy");
        Node node = new Node(testSquirrel);
        assertNotNull(node);
        assertEquals("Testy", node.getData().getName());
        assertNull(node.left());
        assertNull(node.right());
    }

    @Test
    void testSetAndGetLeftChild() {
        Squirrel parentSquirrel = new Squirrel("Parent");
        Node parentNode = new Node(parentSquirrel);
        Squirrel leftSquirrel = new Squirrel("Lefty");
        Node leftNode = new Node(leftSquirrel);
        parentNode.setLeft(leftNode);
        assertEquals(leftNode, parentNode.left());
    }

    @Test
    void testSetAndGetRightChild() {
        Squirrel parentSquirrel = new Squirrel("Parent");
        Node parentNode = new Node(parentSquirrel);
        Squirrel rightSquirrel = new Squirrel("Righty");
        Node rightNode = new Node(rightSquirrel);
        parentNode.setRight(rightNode);
        assertEquals(rightNode, parentNode.right());
    }

    @Test
    void testBinaryTreeCreationWithRoot() {
        Squirrel rootSquirrel = new Squirrel("Root");
        BinaryTree tree = new BinaryTree(rootSquirrel);
        assertNotNull(tree.getRoot());
        assertEquals("Root", tree.getRoot().getData().getName());
    }

    @Test
    void testAddLeftChildToTree() {
        BinaryTree tree = new BinaryTree(new Squirrel("Root"));
        Node root = tree.getRoot();
        Squirrel leftSquirrel = new Squirrel("Left");
        tree.addLeftChild(root, leftSquirrel);
        assertNotNull(root.left());
        assertEquals("Left", root.left().getData().getName());
    }

    @Test
    void testAddRightChildToTree() {
        BinaryTree tree = new BinaryTree(new Squirrel("Root"));
        Node root = tree.getRoot();
        Squirrel rightSquirrel = new Squirrel("Right");
        tree.addRightChild(root, rightSquirrel);
        assertNotNull(root.right());
        assertEquals("Right", root.right().getData().getName());
    }

    @Test
    void testLeftAndRightMethodsOnRoot() {
        BinaryTree tree = new BinaryTree(new Squirrel("Root"));
        Node root = tree.getRoot();
        Squirrel leftSquirrel = new Squirrel("Left");
        Squirrel rightSquirrel = new Squirrel("Right");
        tree.addLeftChild(root, leftSquirrel);
        tree.addRightChild(root, rightSquirrel);
        assertNotNull(root.left());
        assertEquals("Left", root.left().getData().getName());
        assertNotNull(root.right());
        assertEquals("Right", root.right().getData().getName());
    }

    @Test
    void testEmptyTreeCreation() {
        BinaryTree emptyTree = new BinaryTree();
        assertNull(emptyTree.getRoot());
    }

    @Test
    void testAddChildrenToNullRootDoesNothing() {
        BinaryTree emptyTree = new BinaryTree();
        Squirrel childSquirrel = new Squirrel("Child");
        emptyTree.addLeftChild(emptyTree.getRoot(), childSquirrel);
        emptyTree.addRightChild(emptyTree.getRoot(), childSquirrel);
        assertNull(emptyTree.getRoot());
    }
}