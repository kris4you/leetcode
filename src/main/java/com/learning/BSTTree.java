package com.learning;

import java.util.ArrayDeque;
import java.util.Queue;

class Node {

    private Integer data;

    private Node left;
    private Node right;

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node() {
    }

    public Node(Integer data) {
        this.data = data;

    }

    public Integer getData() {
        return data;
    }

}

public class BSTTree {

    Node root;

    public void insert(Integer data) {

        root = insertNode(data, root);
    }

    private Node insertNode(Integer data, Node root2) {

        if (root2 == null) {

            return new Node(data);

        }
        if (root2.getData() < data) {
            root2.setRight(insertNode(data, root2.getRight()));
        } else if (root2.getData() >= data) {
            root2.setLeft(insertNode(data, root2.getLeft()));
        } else {
            return root2;
        }

        return root2;
    }

    private void printNode(Node r) {

        if (r.getLeft() != null) {
            printNode(r.getLeft());
        }
        System.out.println(r.getData());

        if (r.getRight() != null) {
            printNode(r.getRight());
        }

    }

    public void bfs() {

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node d = q.remove();
            System.out.print(d.getData() + " ");

            if (d.getLeft() != null)
                q.add(d.getLeft());
            if (d.getRight() != null)
                q.add(d.getRight());
        }

    }

    public void print() {
        printNode(root);

    }

    public static void main(String[] args) {

        BSTTree bstTree = new BSTTree();
        int[] elements = new int[] { 1, 2, 3, 4, 5 };

        for (int i = 0; i < elements.length; i++) {
            bstTree.insert(elements[i]);

        }
        bstTree.print();
        bstTree.bfs();

    }
}
