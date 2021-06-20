package com.algoexpert.arrays;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A01TwoNumberSum {
    public static void main(String[] args) {

        int[] ints = {3, 5, -4, 8, 11, 1, 6, -1};

        int[] output = twoNumberSumUsing2ForLoops(ints, 10);
        System.out.println(output[0] +" , " + output[1]);

        output = twoNumberSumUsingSet(ints, 10);
        System.out.println(output[0] +" , " + output[1]);

        output = twoNumberSumUsingArraysSort(ints, 10);
        System.out.println(output[0] +" , " + output[1]);

    }

    private static int[] twoNumberSumUsingArraysSort(int[] ints, int targetSum) {
        Arrays.sort(ints);
        int leftIndex=0;
        int rightIndex=ints.length-1;
        while(leftIndex < rightIndex){
            int tempSum = ints[leftIndex]+ints[rightIndex];
            if( tempSum == targetSum){
                return new int[]{ints[leftIndex],ints[rightIndex]};
            }
            if (tempSum < targetSum )
                leftIndex++;
            else
                rightIndex--;

            //tempSum < targetSum ? leftIndex++:rightIndex--;
        }
        return new int[0];
    }

    private static int[] twoNumberSumUsingSet(int[] ints, int targetSum) {
        Set numSet = new HashSet();
        for (int element: ints) {
            int potentialElement = targetSum - element;
            if(numSet.contains(potentialElement)){
                return new int[]{potentialElement,element};
            }else
                numSet.add(element);
        }
        return new int[0];
    }

    private static int[] twoNumberSumUsing2ForLoops(int[] ints, int targetSum) {
        for (int i = 0; i< ints.length-1 ; i++)
            for (int j = i ; j <ints.length ; j++){
                if(i == j)
                    continue;
                if(ints[i] + ints[j] == targetSum){
                    return new int[]{ints[i] , ints[j]};
                }
            }
        return new int[0];
    }

}
