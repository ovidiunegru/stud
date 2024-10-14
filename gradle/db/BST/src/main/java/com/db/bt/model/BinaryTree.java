package main.java.com.db.bt.model;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
     public Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null) {
                current.left = newNode;
                break;
            } else {
                queue.add(current.left);
            }

            if (current.right == null) {
                current.right = newNode;
                break;
            } else {
                queue.add(current.right);
            }
        }
    }

    public int getMax() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        return findMaxRec(root);
    }

    private int findMaxRec(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = findMaxRec(node.left);
        int rightMax = findMaxRec(node.right);

        return Math.max(node.value, Math.max(leftMax, rightMax));
    }

    public int calculateDepth() {
        return calculateDepthRec(root);
    }

    private int calculateDepthRec(Node node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = calculateDepthRec(node.left);
        int rightDepth = calculateDepthRec(node.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    // to be removed
    public void printTree() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

}