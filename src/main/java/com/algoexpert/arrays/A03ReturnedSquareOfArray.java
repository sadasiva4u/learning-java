package com.algoexpert.arrays;

import java.util.Arrays;

public class A03ReturnedSquareOfArray {
    public static void main(String[] args) {
        int[] array = {-7,-5, -4, 3, 6, 8, 9};
        int[] out = sortedSquaredArray(array);

        for(int a: out)
        System.out.print(a + " ");

        out = sortedSquareSameArray(array);
        System.out.println();
        for(int a: out)
            System.out.print(a + " ");

        out = sortedSquareUsingAbsoluteMethod(new int[] {-7,-5, -4, 3, 6, 8, 9} );
        System.out.println();
        for(int a: out)
            System.out.print(a + " ");
    }

    private static int[] sortedSquareUsingAbsoluteMethod(int[] array) {
        int arrayLength= array.length;
        int[] output = new int[arrayLength];
        int smallestValueIndex=0;
        int largestValueIndex=arrayLength-1;
        for(int i = arrayLength-1; i >=0; i--){
            int valueAtSmallestIndex= array[smallestValueIndex];
            int valueAtLargestIndex= array[largestValueIndex];
            if(Math.abs(valueAtSmallestIndex) > valueAtLargestIndex){
                output[i] = valueAtSmallestIndex*valueAtSmallestIndex;
                smallestValueIndex++;
            }else{
                output[i] = valueAtLargestIndex*valueAtLargestIndex;
                largestValueIndex--;
            }
        }

        return output;
    }

    private static int[] sortedSquareSameArray(int[] array) {
        for (int i=0; i< array.length; i++) {
            array[i] = array[i]*array[i];
        }
        Arrays.sort(array);
        return array;
    }

    public static int[] sortedSquaredArray(int[] array) {
        int[] output = new int[array.length];
        for(int i = 0; i<array.length ; i++){
            output[i]=array[i]*array[i];
        }
        Arrays.sort(output);
        return output;
    }
}
