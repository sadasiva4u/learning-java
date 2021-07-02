package com.algoexpert.recurssion;

public class BasicRecurssion {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(getFacotial(n));
    }

    private static int getFacotial(int n) {
        if(n == 1){
            return 1;
        }
        return n * getFacotial(n-1);
    }
}
