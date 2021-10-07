/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

/**
 *
 * @author Owner
 */
public class PersistentDynamicSet {

    //ANSWERS OFF DADDY GOOGLE
    public static ArrayList<Integer> printPath(TreeNode node, ArrayList<Integer> path, int value) {
        if (node == null) {
            return path;
        }

        path.add(node.data);

        int cmp = Integer.compare(value, node.data);

        if (cmp < 0) // value is smaller, so go left
        {
            printPath(node.left, path, value);
        } else if (cmp > 0) // value is larger, so go right
        {
            printPath(node.right, path, value);
        } else /* if (cmp == 0) */ {
            return path; // value found
        }
        return path;
    }

}
