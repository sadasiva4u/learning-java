package com.sada.java.trees;

import java.util.ArrayList;
import java.util.List;

public class TestTrees {
    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(3);
        numbers.contains(2);
        numbers.remove(0);

// Add element
// Traverse
// Check if element present
// Delete a element

        binaryTree.addElement(6);
        binaryTree.displayTree();
        binaryTree.addElement(3);
        binaryTree.displayTree();
        binaryTree.addElement(9);
        binaryTree.displayTree();
        binaryTree.addElement(4);
        binaryTree.displayTree();
        binaryTree.addElement(2);
        binaryTree.displayTree();
        binaryTree.addElement(7);
        binaryTree.displayTree();
        binaryTree.addElement(10);
        binaryTree.addElement(1);
        binaryTree.addElement(5);


/*
InOrder   -> [Left -> Node -> Right]
PreOrder  -> [Node -> Left -> Right]
PostOrder -> [Left -> Right -> Node]
*/

        binaryTree.inOrderPrint();
        binaryTree.preOrderPrint();
        binaryTree.postOrderPrint();

        System.out.println();

        System.out.println("Print By Level");
        binaryTree.printByLevel();
        System.out.println("*****************************************************");

        System.out.println(binaryTree.isPresent(4));
        System.out.println(binaryTree.isPresent(8));

        System.out.println("*****************************************************");

        System.out.println("Before Deleting element");
        binaryTree.inOrderPrint();
        binaryTree.remove(4);
        System.out.println("\nAfter Deleting element");
        binaryTree.inOrderPrint();

        System.out.println("*****************************************************");

        binaryTree.displayTree();
        binaryTree.addElement(4);
        binaryTree.displayTree();
        binaryTree.addElement(8);
        binaryTree.displayTree();
        binaryTree.remove(6);
        System.out.println("After deleting Root");
        binaryTree.displayTree();
    }
}
