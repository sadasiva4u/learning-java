package com.sada.java.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeImpl {

    Node root;
    
    public void addElement(int value){
        root = addRecurrsive(root,value);
    }

    private Node addRecurrsive(Node current, int value) {
        if(null == current){
            return new Node(value);
        }

        if( value < current.value){
            current.left=addRecurrsive(current.left,value);
        }else if (value > current.value){
            current.right=addRecurrsive(current.right,value);
        }
        return current;
    }

    public void inOrderPrint(){
        System.out.println();
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(Node current) {
        if(null != current) {
            if(null != current.left)
                printInOrderRecursive(current.left);
            System.out.print(current.value + " ");
            if(null != current.right)
                printInOrderRecursive(current.right);
        }
    }

    public void preOrderPrint(){
        System.out.println();
        printPreOrder(root);
    }

    private void printPreOrder(Node current) {
        if(null != current) {
            System.out.print(current.value + " ");
            if(null != current.left)
                printPreOrder(current.left);
            if(null != current.right)
                printPreOrder(current.right);
        }
    }

    public void postOrderPrint(){
        System.out.println();
        printPostOrderRecursive(root);
    }

    private void printPostOrderRecursive(Node current) {
        if(null != current) {
            if(null != current.left)
                printPostOrderRecursive(current.left);
            if(null != current.right)
                printPostOrderRecursive(current.right);
            System.out.print(current.value + " ");
        }
    }

    public void printByLevel(){
        byLevel(root);
    }
    private void byLevel(Node current){
        Queue<Node> level  = new LinkedList<>();
        level.add(current);
        while(!level.isEmpty()){
            Node node = level.poll();
            System.out.print(node.value + " ");
            if(node.left!= null)
                level.add(node.left);
            if(node.right!= null)
                level.add(node.right);
        }
    }

    public boolean isPresent(int value){
        return recursiveSearch(root,value);
    }

    private boolean recursiveSearch(Node current, int searchElement) {
        if(null == current){
            return false;
        }
        if(current.value == searchElement){
            return true;
        }
        return searchElement < current.value
                ? recursiveSearch(current.left, searchElement)
                : recursiveSearch(current.right, searchElement) ;
    }

    public void remove(int deleteElement){
        if(isPresent(deleteElement)) {
            removeRecurssive(root, deleteElement);
        }
    }

    private Node removeRecurssive(Node current, int deleteElement) {
        if(null == current){
            return null;
        }
        if(current.value == deleteElement ){
            // Deleting Leaf Node
            if(null == current.left && null == current.right){
                return null;
            }
            // If the node have both children... Anyone of the below approaches we can take
            //1. Find smallest from right of the node... assign that as node/root... rearrange the tree
            //2. Find largest from left of the node... assign that as node/root... rearrange the tree

            /*
            else if(null != current.left && null != current.right){
                int smallestNodeValueFromRight = findSmallestFromRight(current.right);
                current.value = smallestNodeValueFromRight;
                current.right = removeRecurssive(current.right,smallestNodeValueFromRight);
                return current;
            }*/
            else if(null != current.left && null != current.right){
                int largestNodeValueFromLeft = findLargestFromLeft(current.left);
                current.value = largestNodeValueFromLeft;
                current.left = removeRecurssive(current.left,largestNodeValueFromLeft);
                return current;
            }
            // Return Left Node if it's not null... Otherwise return right node
            /*
                else if(null != current.left){
                    return current.left;
                }else if(null != current.right){
                    return current.right;
                }
             */
            return (null!=current.left ? current.left : current.right);

        }else if(deleteElement < current.value){
            current.left = removeRecurssive(current.left,deleteElement);
            return current;
        }

        current.right = removeRecurssive(current.right,deleteElement);
        return current;

    }

    private int findSmallestFromRight(Node findSmallest) {
        return (null == findSmallest.left
                ? findSmallest.value
                : findSmallestFromRight(findSmallest.left));
    }

    private int findLargestFromLeft(Node findLargest) {
        return (null == findLargest.right
                ? findLargest.value
                : findLargestFromLeft(findLargest.right));
    }

    public void displayTree()
    {
        Stack<Node> globalStack = new Stack();
        globalStack.push(root);
        int emptyLeaf = 32;
        boolean isRowEmpty = false;
        System.out.println("\n......................................................");
        while(!isRowEmpty)
        {
            Stack<Node> localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<emptyLeaf; j++)
                System.out.print(" ");
            while(!globalStack.isEmpty())
            {
                Node temp = globalStack.pop();
                if(temp != null)
                {
                    System.out.print(temp.value);
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    if(temp.left != null || temp.right != null)
                        isRowEmpty = false;
                }
                else
                {
                    System.out.print("\t");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j<emptyLeaf*2-2; j++)
                    System.out.print(" ");
            }
            System.out.println();
            emptyLeaf /= 2;
            while(!localStack.isEmpty())
                globalStack.push( localStack.pop() );
        }
        System.out.println("......................................................");
    }

    static int sumValues(Node current) {
        if (current == null) {
            return 0;
        }
        return current.value + sumValues(current.left) + sumValues(current.right);
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

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}