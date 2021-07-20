package com.algoexpert.arrays;

import java.util.Arrays;

public class SubArraySort {
    public static void main(String[] args) {
    //int[] out = subarraySort(new int[]{1,2,4,7,10,11,12,6,16,18,19});
    int[] out = subarraySort(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89});
        for (int i: out) {
            System.out.print(i + " ");
        }
    }

    public static int[] subarraySort(int[] array) {
        // Write your code here.
        if(array.length == 0 || array.length ==1){
            return new int[]{-1,-1};
        }
        final int[] orginalArray = array.clone();
        Arrays.sort(array);
        int[] output = new int[]{-1,-1};
        int left=0, right = array.length-1;

        while(left<right && orginalArray[left] == array[left]){
            left++;
        }
        while(left<right &&  orginalArray[right] == array[right]){
            right--;
        }

        if(left < right ){
            output[0]=left;
            output[1]=right;
        }
        return output;
    }

}
