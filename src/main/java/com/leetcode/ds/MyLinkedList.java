package com.leetcode.ds;

public class MyLinkedList {

    public ListNode root;

    public void insert(int value){
        if(root == null){
            root = new ListNode(value);
            return;
        }
        insertToLinkedList(root,value);
    }

    private void insertToLinkedList(ListNode node, int value) {
        while (node.next != null){
            node = node.next;
        }
        node.next = new ListNode(value);
    }


    public void print(){
        printRecusrsive(root);
        System.out.println();
    }

    private void printRecusrsive(ListNode node) {
        while(node != null){
            System.out.print (node.val + " ");
            node = node.next;
            }
    }

    public MyLinkedList reverse(){
        return reverseLinkedList(root);
    }

    private MyLinkedList reverseLinkedList(ListNode root) {
        MyLinkedList output = new MyLinkedList();
        ListNode prev = null , next;
        ListNode current = root;
        while(current != null){
            next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        output.root = prev;
        return output;
    }
}

