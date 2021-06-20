package com.algoexpert.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;

    public void addElement(int element){
        root= addToTree(root,element);
    }

    private Node addToTree(Node current, int element) {
        if(null == current){
            return new Node(element);
        }
        if(element < current.value){
            current.left = addToTree(current.left,element);
        }else{
            current.right = addToTree(current.right,element);
        }
        return current;
    }

    public void inOrderTraversal(){
        recursiveInorder(root);
    }

    private void recursiveInorder(Node current) {
        if(null == current){
            return;
        }
        recursiveInorder(current.left);
        System.out.print(current.value + " ");
        recursiveInorder(current.right);
    }

    public int treeSum(){
        return sumOfTree(root);
    }

    private int sumOfTree(Node current) {
        if(null == current){
            return 0;
        }
        return current.value + sumOfTree(current.left) + sumOfTree(current.right);
    }

    public List<Integer> sumOfEachBranch() {
        List<Integer> sumList = new ArrayList<>();
        return calculateBranchSum(sumList,root,0);
    }

    private List<Integer> calculateBranchSum(List<Integer> sumList, Node current, int sum) {
        if(null == current){
            return sumList;
        }
        int latestSum = sum + current.value;
        if(null == current.left && null == current.right){
            sumList.add(latestSum);
            return sumList;
        }

        calculateBranchSum(sumList,current.left,latestSum);
        calculateBranchSum(sumList,current.right,latestSum);

        return sumList;
    }
}

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value=value;
        left=right=null;
    }
}
