package com.algoexpert.trees;

public class T01SumOfAllTreeBranches {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        /*
                        6
                3               9
           1      4         7       10
              2      5        8
         */
        bt.addElement(6);
        bt.addElement(3);
        bt.addElement(1);
        bt.addElement(2);
        bt.addElement(4);
        bt.addElement(5);
        bt.addElement(9);
        bt.addElement(7);
        bt.addElement(8);
        bt.addElement(10);

        bt.inOrderTraversal();

        System.out.println();
        System.out.println(bt.treeSum());

        System.out.println(bt.sumOfEachBranch());
    }
}
