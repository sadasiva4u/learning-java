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

        // Root
        binaryTree.addElement(6);
        // Root -> Root.left=3
        binaryTree.addElement(3);

        binaryTree.addElement(9);
        binaryTree.addElement(4);
        binaryTree.addElement(2);
        binaryTree.addElement(7);
        binaryTree.addElement(10);
        binaryTree.addElement(1);
        binaryTree.addElement(5);



        /*
                    6//root
            3               9
       2       4       7       10
   1
                    */


/*
InOrder   -> [Left -> Node -> Right]
PreOrder  -> [Node -> Left -> Right]
PostOrder -> [Left -> Right -> Node]
*/

        binaryTree.inOrderPrint();
        binaryTree.preOrderPrint();
        binaryTree.postOrderPrint();

        System.out.println();

        binaryTree.printByLevel();

        System.out.println(binaryTree.isPresent(4));
        System.out.println(binaryTree.isPresent(8));

        /* Before Deleting
                    6//root
            3               9
       2       4        7       10
   1              5
                    */

        System.out.println("Before Deleting element");
        binaryTree.inOrderPrint();
        binaryTree.remove(4);
        System.out.println("\nAfter Deleting element");
        binaryTree.inOrderPrint();
        /* After Deleting
                    6//root
            3               9
       2       5       7       10
   1
                    */
        binaryTree.addElement(4);
        /* After inserting 4
                    6//root
            3               9
       2       5       7       10
   1        4
                    */
        binaryTree.inOrderPrint();

        binaryTree.remove(6);
        System.out.println("After deleting Root");
        binaryTree.inOrderPrint();
    }
}
