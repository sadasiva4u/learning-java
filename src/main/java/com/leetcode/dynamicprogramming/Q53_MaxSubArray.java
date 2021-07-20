package com.leetcode.dynamicprogramming;

public class Q53_MaxSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

        int[] indexes = maxSubArrayWithIndexes(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println("-------");
        for (int idex:indexes ) {
            System.out.println(idex);
        }
    }

    private static int[] maxSubArrayWithIndexes(int[] ints) {
        int[] indexes = new int[2];
        int maxSum = Integer.MIN_VALUE;
        int max_sum_ends = 0;
        int max_begin_index = 0;
        int max_ending_index = 0;

        for(int i = 0; i < ints.length;i++){
            max_sum_ends =max_sum_ends + ints[i];
            if(maxSum < max_sum_ends){
                maxSum = max_sum_ends;
                max_ending_index = i;
            }
            if(max_sum_ends < 0){
                max_sum_ends = 0;
                max_begin_index = i+1;
            }
        }
        indexes[0] = max_begin_index;
        indexes[1] = max_ending_index;
        return indexes;
    }

    static public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int max_ending =0;
        for(int i = 0; i <nums.length ; i++){
            max_ending = max_ending + nums[i];

            if(maxSum < max_ending){
                maxSum=max_ending;
            }
            if(max_ending < 0){
                max_ending=0;
            }
        }

        return maxSum;
    }
}
