package com.leetcode.dynamicprogramming;

public class Q338_Counting_Bits {
    public static void main(String[] args) {
        System.out.println(convertToBinary(1));
        System.out.println(convertToBinary(2));
        System.out.println(convertToBinary(8));
        System.out.println(convertToBinary(15));
        System.out.println(convertToBinary(6));
    }

    static public int convertToBinary(int num) {
        if(num == 0){
            return 0;
        }

        int digit = (num%2 == 0) ? 0 : 1;
        int result = convertToBinary(num/2) * 10 + digit;
        return result;
    }



    static public int[] countBits(int n) {
        int[] result = new int[n+1];

        for(int i = 0; i <=n ; i++){
            int bitCount = countBitsOnEachNumber(i);
        }

        return result;
    }

    static int countBitsOnEachNumber(int num){
        if(num == 0){
            return 0;
        }
        int digit = (num%2 == 0) ? 0 :1;

        return digit + countBitsOnEachNumber(num/2);
    }
}
