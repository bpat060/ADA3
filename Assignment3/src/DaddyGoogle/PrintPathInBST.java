/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaddyGoogle;

import java.util.ArrayList;

public class PrintPathInBST {

    public void printPath(BinarySearchTree tree) {
        ArrayList<TreeNode> path = new ArrayList<>();
        this.printPathRecursive(tree.getRoot(), path);
    }

    private void printPathRecursive(TreeNode root,
            ArrayList<TreeNode> path) {
        if (root == null) {
            return;
        }

        path.add(root);

        //If node is leaf node
        if (root.getLeft() == null && root.getRight() == null) {
            path.forEach(node -> System.out.print(" "
                    + node.getValue()));
            path.remove(path.size() - 1);
            System.out.println();
            return;
        }

        /*Not a leaf node, add this node to
        path and continue traverse */
        printPathRecursive(root.getLeft(), path);
        printPathRecursive(root.getRight(), path);

        //Remove the root node from the path
        path.remove(path.size() - 1);
    }
}
