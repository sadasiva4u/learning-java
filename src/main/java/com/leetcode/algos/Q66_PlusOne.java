package com.leetcode.algos;

public class Q66_PlusOne {
    public static void main(String[] args) {
        int[] result = plusOne(new int[]{1,2,3});

        for (int i:result ) {
            System.out.print(i + " ");
        }

        result = plusOne(new int[]{9});

        for (int i:result ) {
            System.out.print(i + " ");
        }
    }

    private static int[] plusOne(int[] ints) {
        for(int i = ints.length-1; i >=0 ; i--){
            if(ints[i] < 9){
                ints[i] = ints[i]+1;
                return ints;
            }
            ints[i]=0;
        }

        int[] result = new int[ints.length+1];
        result[0] =1;
        return result;
    }
}
