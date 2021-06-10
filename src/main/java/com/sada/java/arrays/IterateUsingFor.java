package com.sada.java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IterateUsingFor {
    public static void main(String[] args) {
        int[] output = twoNumberSumUsing2ForLoops(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println(output[0] +" , " + output[1]);

        output = twoNumberSumUsingSet(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println(output[0] +" , " + output[1]);

        output = twoNumberSumUsingArraysSort(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println(output[0] +" , " + output[1]);

    }

    private static int[] twoNumberSumUsingArraysSort(int[] ints, int targetSum) {
        Arrays.sort(ints);
        int leftSide = 0;
        int rightSide = ints.length-1;
        while(leftSide < rightSide ){
            if((ints[leftSide]+ints[rightSide]) == targetSum){
                return new int[]{ints[leftSide],ints[rightSide]};
            }else if(ints[leftSide]+ints[rightSide] < targetSum){
                leftSide++;
            }else{
                rightSide--;
            }
        }
        return new int[0];
    }

    private static int[] twoNumberSumUsingSet(int[] ints, int targetSum) {
        Set temp = new HashSet();
        for(int element : ints){
            int potentialInt = targetSum-element;
            if(temp.contains(potentialInt)){
                return new int[]{element,potentialInt};
            }else{
                temp.add(element);
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSumUsing2ForLoops(int[] array, int targetSum) {
        for(int i=0; i < (array.length-1); i++){
            for (int j=i+1;j<array.length;j++) {
                if(array[i]+array[j] == targetSum){
                    return new int[]{array[i],array[j]};
                }
            }
        }
        return new int[0];
    }
}
