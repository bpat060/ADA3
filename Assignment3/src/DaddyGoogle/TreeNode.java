/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaddyGoogle;

/**
 *
 * @author Sheetal
 * @param <T>
 */
public class TreeNode<T> {

    private T value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public T getValue() {
        return this.value;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setRight(TreeNode node) {
        this.right = node;
    }

    public void setLeft(TreeNode node) {
        this.left = node;
    }
}
