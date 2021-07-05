package com.leetcode.weekly;

import java.util.HashMap;
import java.util.List;

public class CountVowelPermutation {
    public static void main(String[] args) {
        System.out.println(countVowelPermutation(1));
    }
/*
Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
Each vowel 'a' may only be followed by an 'e'.
Each vowel 'e' may only be followed by an 'a' or an 'i'.
Each vowel 'i' may not be followed by another 'i'.
Each vowel 'o' may only be followed by an 'i' or a 'u'.
Each vowel 'u' may only be followed by an 'a'.
 */
    private static int countVowelPermutation(int number) {
        int numberOfCombinations=0;
        String[] vowels = {"a","e","i","o","u"};
        List<String> combinations = List.of("ae","ea","ei","oi","ou","ua");

        return numberOfCombinations;
    }
}
