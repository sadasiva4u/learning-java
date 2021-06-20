package com.algoexpert.arrays;

import java.util.List;

public class A02ValidateSubsequence {
    public static void main(String[] args) {
        List<Integer> array = List.of(5,1,22,25,6,-1,8,10);
        List<Integer> sequence = List.of(1,6,-1,10);

        System.out.println(isSubArrayIsSubsequence01(array,sequence));
        System.out.println(isSubArrayIsSubsequence02(array,sequence));
    }

    private static boolean isSubArrayIsSubsequence02(List<Integer> array, List<Integer> sequence) {
        int subArrayIndex=0;
        for(int element:array){
            if(element == sequence.get(subArrayIndex)){
                subArrayIndex++;
            }
            if(subArrayIndex == sequence.size()){
                return true;
            }
        }
        return false;
    }

    private static boolean isSubArrayIsSubsequence01(List<Integer> array, List<Integer> sequence) {
        int arrayIndex=0;
        int subArrayIdxex = 0;
        while(arrayIndex < array.size() && subArrayIdxex < sequence.size()){
            if(array.get(arrayIndex)==sequence.get(subArrayIdxex)){
                subArrayIdxex++;
            }
            arrayIndex++;
        }
        return subArrayIdxex == sequence.size();
    }
}
