package com.leetcode.arrays;

public class Q92_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
//        System.out.println(removeDuplicates(new int[]{1}));
//        System.out.println(removeDuplicates(new int[]{}));
//        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }


    static public int removeDuplicates(int[] nums) {
        if(nums.length ==0){
            return 0;
        }

        int uniqueValues=1;
        int lastUniqueIdx = 0;
        for(int i = 1; i < nums.length;i++){
            if(! (nums[lastUniqueIdx] == nums[i] )){
                nums[++lastUniqueIdx]=nums[i];
                ++uniqueValues;
            }
        }

//        for(int j = uniqueValues ; j < nums.length ; j++){
//            nums[j] =0;
//        }
        return uniqueValues;
    }
}
