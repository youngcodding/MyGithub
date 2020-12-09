package com.yn.structure.binarytree;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-15:29
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(32);
        binaryTree.add(10);
        binaryTree.add(9);
        binaryTree.add(78);
        binaryTree.add(23);
        binaryTree.add(15);
        binaryTree.add(90);
        binaryTree.add(85);
        binaryTree.add(100);
        binaryTree.traversing();
        System.out.println();
        binaryTree.traversingM();
        System.out.println();
        binaryTree.traversingL();
    }
}
