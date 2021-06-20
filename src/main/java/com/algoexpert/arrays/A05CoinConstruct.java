package com.algoexpert.arrays;

import java.util.Arrays;
import java.util.List;

public class A05CoinConstruct {
    public static void main(String[] args) {
        int[] coins = {5,7,1,1,2,3,22};
        //int[] coins = {5,1,1,10,2,20,20,50};
        System.out.println(nonConstructibleChange(coins));
    }

    private static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int currentChangeCreated = 0;
        for(int coin:coins){
            if(coin > currentChangeCreated+1){
                return currentChangeCreated +1;
            }
            currentChangeCreated +=coin;
        }
        return currentChangeCreated+1;
    }
}
