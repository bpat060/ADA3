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
public class BalancedPersistentDynamicSet<E extends Comparable<E>> extends BinarySearchTreeGivenTemplate {

    public static final boolean RED = true;
    public static final boolean BLACK = false;
    public BinaryTreeNode root;

    public BalancedPersistentDynamicSet() {

    }

    private boolean isRed(BinaryTreeNode x) {
        if (x == null) {
            return false;
        }
        return x.color == RED;
    }

    // number of node in subtree rooted at x; 0 if x is null
    private int size(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.size;
    }

    public int size() {
        return size(root);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(E element) {
        if (element == null) {
            delete(element);
            return;
        }
        root = insert(root, element);
        root.color = BLACK;
        // assert check();
    }

    // insert the key-value pair in the subtree rooted at node
    private BinaryTreeNode insert(BinaryTreeNode node, E element) {
        if (node == null) {
            return new BinaryTreeNode(element, RED, 1);
        }

        //cannot compare coz E cannot turn into int
//        int compare = element.compareTo(node.element);
//        if (compare < 0) {
//            node.leftChild = insert(node.leftChild, element);
//        } else if (compare > 0) {
//            node.rightChild = insert(node.rightChild, element);
//        } else {
//            node.element = element;
//        }
        // fix-up any right-leaning links
        if (isRed(node.rightChild) && !isRed(node.leftChild)) {
            node = rotateLeft(node);
        }
        if (isRed(node.leftChild) && isRed(node.leftChild.leftChild)) {
            node = rotateRight(node);
        }
        if (isRed(node.leftChild) && isRed(node.rightChild)) {
            flipColors(node);
        }
        node.size = size(node.leftChild) + size(node.rightChild) + 1;

        return node;
    }

    private void delete(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private BinaryTreeNode rotateLeft(BinaryTreeNode node) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private BinaryTreeNode rotateRight(BinaryTreeNode node) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void flipColors(BinaryTreeNode node) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
