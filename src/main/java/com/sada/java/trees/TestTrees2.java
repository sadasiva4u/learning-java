package com.sada.java.trees;

public class TestTrees2 {
    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();

        binaryTree.addElement(20);
        binaryTree.addElement(18);
        binaryTree.addElement(14);
        binaryTree.addElement(16);
        binaryTree.addElement(15);
        binaryTree.addElement(18);
        binaryTree.addElement(12);
        binaryTree.addElement(10);
        binaryTree.addElement(13);
        binaryTree.addElement(17);
        binaryTree.addElement(29);
        binaryTree.addElement(25);
        binaryTree.addElement(22);
        binaryTree.addElement(21);
        binaryTree.addElement(24);
        binaryTree.addElement(26);
        binaryTree.addElement(36);
        binaryTree.addElement(34);
        binaryTree.addElement(33);
        binaryTree.addElement(35);
        binaryTree.addElement(38);
        binaryTree.addElement(37);
        binaryTree.addElement(39);

        binaryTree.displayTree();

        BinaryTreePrinter binaryTreePrinter = new BinaryTreePrinter();

        binaryTreePrinter.addElement(20);
        binaryTreePrinter.addElement(18);
        binaryTreePrinter.addElement(14);
        binaryTreePrinter.addElement(16);
        binaryTreePrinter.addElement(15);
        binaryTreePrinter.addElement(18);
        binaryTreePrinter.addElement(12);
        binaryTreePrinter.addElement(10);
        binaryTreePrinter.addElement(13);
        binaryTreePrinter.addElement(17);
        binaryTreePrinter.addElement(29);
        binaryTreePrinter.addElement(25);
        binaryTreePrinter.addElement(22);
        binaryTreePrinter.addElement(21);
        binaryTreePrinter.addElement(24);
        binaryTreePrinter.addElement(26);
        binaryTreePrinter.addElement(36);
        binaryTreePrinter.addElement(34);
        binaryTreePrinter.addElement(33);
        binaryTreePrinter.addElement(35);
        binaryTreePrinter.addElement(38);
        binaryTreePrinter.addElement(37);
        binaryTreePrinter.addElement(39);


        binaryTreePrinter.printTree();
    }
}
