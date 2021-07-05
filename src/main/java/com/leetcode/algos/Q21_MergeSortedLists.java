package com.leetcode.algos;

import com.leetcode.ds.ListNode;
import com.leetcode.ds.MyLinkedList;

import java.util.List;

public class Q21_MergeSortedLists {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        list1.insert(3);
        list1.insert(5);

        MyLinkedList list2 = new MyLinkedList();
        list2.insert(3 );
        list2.insert(4);

        mergeTwoLists(list1.root, list2.root);
    }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        MyLinkedList output = new MyLinkedList();

        while(l1 !=null || l2 !=null){
            if(l1 !=null && l2 !=null){
                if(l1.val >= l2.val ){
                    output.insert(l1.val);
                }
            }
        }

        throw new IllegalArgumentException();
    }
}
