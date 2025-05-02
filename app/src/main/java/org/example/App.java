
package org.example;


public class App {
    public static void main(String[] args) {
        
        Squirrel cheeks = new Squirrel("Cheeks");
        Squirrel squeaks = new Squirrel("Squeaks");
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Squirrel nutsy = new Squirrel("Nutsy");

        
        BinaryTree tree = new BinaryTree(cheeks);
        Node root = tree.getRoot();

        
        tree.addLeftChild(root, squeaks);
        tree.addRightChild(root, fluffybutt);

       
        tree.addLeftChild(root.left(), nutsy);

        System.out.println("Pre-order Traversal:");
        tree.traversePreOrder(root);

        System.out.println("\nIn-order Traversal:");
        tree.traverseInOrder(root);

        System.out.println("\nPost-order Traversal:");
        tree.traversePostOrder(root);

        
        Node leftChild = root.left();
        if (leftChild != null) {
            System.out.println("\nLeft child's name: " + leftChild.getData().getName());
        }

        Node rightChild = root.right();
        if (rightChild != null) {
            System.out.println("Right child's name: " + rightChild.getData().getName());
        }
    }
}