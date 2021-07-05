package com.leetcode.ds;


public class LinkedListSum {

    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        l1.insert(2);
        l1.insert(4);
        l1.insert(5);

        MyLinkedList l2 = new MyLinkedList();
        l2.insert(3);
        l2.insert(4);
        l2.insert(5);

        MyLinkedList out = addTwoNumbers(l1,l2);
        out.print();
        out.reverse().print();
    }
    static MyLinkedList addTwoNumbers(MyLinkedList l1, MyLinkedList l2) {
        MyLinkedList result = new MyLinkedList();
        int carry = 0;
        ListNode l1Node = l1.root;
        ListNode l2Node = l2.root;
        while(l1Node != null || l2Node !=null){
            int x = (l1Node !=null) ? l1Node.val :0;
            int y = (l2Node !=null) ? l2Node.val :0;
            int sum = carry + x + y;
            result.insert(sum%10);

            carry = sum/10;
            if(l1Node !=null)
                l1Node = l1Node.next;
            if(l2Node !=null)
                l2Node= l2Node.next;
        }
        if(carry > 0){
            result.insert(carry);
        }
        return result;
    }
}
