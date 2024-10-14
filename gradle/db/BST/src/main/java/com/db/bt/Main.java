package main.java.com.db.bt;

import main.java.com.db.bt.model.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(10);
        tree.insert(11);

        // Printing the tree
        System.out.println("Inorder traversal of the tree:");
        tree.printTree();

        // Finding the maximum value in the tree
        System.out.println("Maximum value in the tree: " + tree.getMax());

        // Calculating the depth of the tree
        System.out.println("Depth of the tree: " + tree.calculateDepth());
    }
}