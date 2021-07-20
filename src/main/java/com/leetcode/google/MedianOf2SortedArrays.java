package com.leetcode.google;

import java.util.Arrays;

public class MedianOf2SortedArrays {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2} , new int[]{3,4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double median = 0;
        int resultArrayLength = nums1.length+nums2.length;
        int[] resultArray= new int[resultArrayLength];
        int pos =0;

        for(int i:nums1)
            resultArray[pos++]=i;
        for(int j:nums2)
            resultArray[pos++]=j;
        Arrays.sort(resultArray);

        if(resultArrayLength%2 ==0){
            median = ((double) resultArray[resultArrayLength/2 -1 ] + (double) resultArray[resultArrayLength/2])/2;
        }else{
            median = resultArray[resultArrayLength/2];
        }
        return median;
    }
}
