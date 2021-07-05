package com.leetcode.algos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] input = {2,7,9,3,6};
        System.out.println(sumOfTwo(input, 10));
    }

    private static int[] sumOfTwo(int[] input, int target) {
        Map<Integer,Integer> combinatios = new HashMap<>();
        for(int i= 0; i < input.length; i++){
            int complement = target - input[i];
            if(combinatios.containsKey(complement)){
                return new int[]{combinatios.get(complement),i};
            }
            combinatios.put(input[i],i);
        }
        throw new IllegalArgumentException("No combination found");
    }
}
