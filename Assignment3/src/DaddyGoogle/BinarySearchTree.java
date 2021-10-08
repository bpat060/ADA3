/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaddyGoogle;

import DaddyGoogle.TreeNode;

/**
 *
 * @author Owner
 */
public class BinarySearchTree {

    Node node;

    //constructor for the binary search tree
    public BinarySearchTree() {
        node = null;
    }

    public void printPath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TreeNode getRoot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //node class for the tree
    public class Node {

        int value;
        Node left;
        Node right;

        //setting node value
        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    //removing a node from the tree
    public void remove(int value) {
        node = removeItterative(node, value);
    }

    public Node removeItterative(Node node, int value) {
        //if tree if empty
        if (node == null) {
            return node;
        }
        //iterating through the tree
        if (value < node.value) { //iterating the left subtree
            node.left = removeItterative(node.left, value);
        } else if (value > node.value) { //iterating the right subtree
            node.right = removeItterative(node.right, value);
        } else {
            //if node contains one child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            //
            node.value = minValue(node.right);
            node.right = removeItterative(node.right, node.value);
        }
        return node;
    }

    public int minValue(Node node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    public void add(int value) {
        node = addItterative(node, value);
    }

    public Node addItterative(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = addItterative(node.left, value);
        } else if (value > node.value) {
            node.right = addItterative(node.right, value);
        }
        return node;
    }

    public void inOrder() {
        inOrderItterative(node);
    }

    public void inOrderItterative(Node node) {
        if (node != null) {
            inOrderItterative(node.left);
            System.out.print(node.value + " ");
            inOrderItterative(node.right);
        }
    }

    public boolean contains(int value) {
        node = containsItterative(node, value);
        if (node != null) {
            return true;
        } else {
            return false;
        }
    }

    public Node containsItterative(Node node, int value) {
        if (node == null || node.value == value) {
            return node;
        }
        if (node.value > value) {
            return containsItterative(node.left, value);
        }
        return containsItterative(node.right, value);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(45);
        tree.add(10);
        tree.add(7);
        tree.add(12);
        tree.add(90);
        tree.add(50);
        System.out.println("The BST Created with input data(Left-root-right):");
        tree.inOrder();

        System.out.println("\nThe BST after Delete 12(leaf node):");
        tree.remove(12);
        tree.inOrder();
        System.out.println("\nThe BST after Delete 90 (node with 1 child):");
        tree.remove(90);
        tree.inOrder();

        System.out.println("\nThe BST after Delete 45 (Node with two children):");
        tree.remove(45);
        tree.inOrder();
        boolean returnValue = tree.contains(50);
        System.out.println("\nKey 50 found in BST:" + returnValue);
        returnValue = tree.contains(12);
        System.out.println("\nKey 12 found in BST:" + returnValue);
    }
}
