package com.sada.java.algorithms;

public class KadaneAlgorithm {

    /*
        Finding maximum sub-array
     */
    public static void main(String[] args) {

        /*
            7 is the largest sum of a sub array
            {4,-1,-2,1,5}
         */

        int[] input = {-2, -3, 4, -1, -2, 1, 5, -1};
        int[] input2 = {-2, -3, -4, -5, -6};
        int[] input3 = {1,-2,4,5,-11,5,3,-8,4,-5,7};

        maxSubArray(input3);
    }

    static void maxSubArray(int[] input){

        int max_sum=input[0];
        int max_ending_here=0;
        int start = 0;
        int end = 0;
        int temp =0;

        for(int i=0; i< input.length ; i++){
            max_ending_here = max_ending_here+input[i];
            if(max_sum < max_ending_here){
                max_sum = max_ending_here;
                start = temp;
                end = i;
            }
            if(max_ending_here < 0){
                max_ending_here =0;
                temp = i+1;
            }
        }

        System.out.println("Maximum sum=" + max_sum);
        System.out.print("Maximum sub array ={");
        for(int j = start; j<=end ; j++){
            System.out.print(input[j] + ",");
        }
        System.out.print("}");
    }
}
