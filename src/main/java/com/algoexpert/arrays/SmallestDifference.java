package com.algoexpert.arrays;

import java.util.Arrays;

public class SmallestDifference {

    public static void main(String[] args) {
        int[] out = smallestDifference(new int[]{-1,5,10,20,28,3}, new int[]{26,135,134,15,17});
        for (int i:out ) {
            System.out.print(i + " ");
        }
    }


    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.

        int[] output = new int[2];
        int diff = Integer.MAX_VALUE;
        int current = 0;
        int fromFirstArray;
        int fromSecondArray;

        for(int i = 0; i < arrayOne.length; i++){
            for(int j = 0; j < arrayTwo.length; j++){

                if(arrayOne[i] > arrayTwo[j]){
                    current = arrayOne[i] - arrayTwo[j];
                }else if(arrayOne[i] < arrayTwo[j]){
                    current = arrayTwo[j] - arrayOne[i] ;
                }else{
                    return new int[]{arrayOne[i] , arrayTwo[j]};
                }

                if(diff > current ){
                    output=new int[] {arrayOne[i],arrayTwo[j]};
                    diff = current;
                }
            }
        }
        return output;
    }
}
