/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class PDS extends BinarySearchTreeGivenTemplate {

    BinarySearchTreeGivenTemplate tree;

    PDS(BinarySearchTreeGivenTemplate tree) {
        tree = this.tree;
    }

    public void printPath() {
        ArrayList<BinarySearchTreeGivenTemplate.BinaryTreeNode> path = new ArrayList<>();
        BinaryTreeNode root = getRoot();

        this.printPathRecursive(getRoot(), path);
    }

    public ArrayList<BinarySearchTreeGivenTemplate.BinaryTreeNode> printPathRecursive(BinarySearchTreeGivenTemplate.BinaryTreeNode root, ArrayList<BinarySearchTreeGivenTemplate.BinaryTreeNode> path) {
        if (root == null) {
            System.out.println("Root is null");
            return path;
        }

        path.add(rootNode);

        //If node is leaf node
        if (root.getLeft() == null && root.getRight() == null) {
            path.forEach(node -> System.out.print(" " + node.getValue()));
            path.remove(path.size() - 1);
            System.out.println("\nRoot is found");

            /*Not a leaf node, add this node to
        path and continue traverse */
            printPathRecursive(root.getLeft(), path);
            printPathRecursive(root.getRight(), path);

            //Remove the root node from the path
            //path.remove(path.size() - 1);
            return path;
        }

        /*Not a leaf node, add this node to
        path and continue traverse */
        printPathRecursive(root.getLeft(), path);
        printPathRecursive(root.getRight(), path);
        //Remove the root node from the path
        path.remove(path.size() - 1);

        return path;
    }
}
