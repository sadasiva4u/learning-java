package com.leetcode.strings;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class RomanToNumber {

    public static void main(String[] args) {
        System.out.println(romanToNumber("IV"));
        System.out.println(romanToNumber("IX"));
        System.out.println(romanToNumber("XIV"));
        System.out.println(romanToNumber("LVIII"));
        System.out.println(romanToNumber("MCMXCIV"));
    }

    private static Integer romanToNumber(String s) {
        Map<Character,Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I',1);
        romanNumbers.put('V',5);
        romanNumbers.put('X',10);
        romanNumbers.put('L',50);
        romanNumbers.put('C',100);
        romanNumbers.put('D',500);
        romanNumbers.put('M',1000);

        Integer finalResult=0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length;i++) {
            if(i+1 < chars.length){
                if(romanNumbers.get(chars[i]) < romanNumbers.get(chars[i+1])){
                    finalResult = finalResult + (romanNumbers.get(chars[i+1]) - romanNumbers.get(chars[i]));
                    i++;
                }else {
                    finalResult = finalResult + romanNumbers.get(chars[i]);
                }
            } else {
                finalResult = finalResult + romanNumbers.get(chars[i]);
            }
        }
        return finalResult;
    }


}
