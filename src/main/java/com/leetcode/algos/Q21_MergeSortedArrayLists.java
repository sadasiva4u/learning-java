package com.leetcode.algos;

import com.leetcode.ds.ListNode;
import com.leetcode.ds.MyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Q21_MergeSortedArrayLists {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(2,5,8,10);
        List<Integer> list2 = List.of(1,3,4,7);

        System.out.println(mergeTwoLists(list1,list2));
    }

    private static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> output = new ArrayList<>();
        if(null == list1 || list1.isEmpty()){
            return list2;
        }else if (null == list2 || list2.isEmpty()){
            return list1;
        }

        int idx1 = 0;
        int idx2=0;

        while(idx1 < list1.size() || idx2 < list2.size()){
            if(idx1 == list1.size()){
                output.add(list2.get(idx2));
                ++idx2;
            }else if (idx2 == list2.size()){
                output.add(list1.get(idx1));
                ++idx1;
            }else if(list1.get(idx1) == list2.get(idx2)){
                output.add(list1.get(idx1));
                output.add(list2.get(idx2));
                ++idx1;
                ++idx2;
            }else if(list1.get(idx1) < list2.get(idx2)){
                output.add(list1.get(idx1));
                ++idx1;
            }else{
                output.add(list2.get(idx2));
                ++idx2;
            }
        }

        return output;
    }

}
