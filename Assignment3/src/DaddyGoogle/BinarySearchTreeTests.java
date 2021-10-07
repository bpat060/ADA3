/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaddyGoogle;

import A3.BinarySearchTree;

/**
 *
 * @author Sheetal
 */
public class BinarySearchTreeTests {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(7);
        binarySearchTree.add(8);
        binarySearchTree.add(6);
        binarySearchTree.add(9);
        binarySearchTree.add(3);
        binarySearchTree.add(4);

        binarySearchTree.printPath();
    }
}
