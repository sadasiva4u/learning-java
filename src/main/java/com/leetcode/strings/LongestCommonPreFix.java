package com.leetcode.strings;

public class LongestCommonPreFix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));

        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"cir","car"}));
    }

    private static String longestCommonPrefix(String[] strs) {
        String commonString="";
        int lengthOfSmallestString = strs[0].length();
        String smallestString= strs[0];
        for (String str: strs ) {
            if(lengthOfSmallestString > str.length()) {
                lengthOfSmallestString = str.length();
                smallestString = str;
            }
        }
        for (int i = 0 ; i < lengthOfSmallestString; i++) {
            char charToCheck = smallestString.charAt(i);
            boolean isCommonCharacter = true;
            for (String str :strs) {
                if(charToCheck != str.charAt(i) ){
                    isCommonCharacter = false;
                    return commonString;
                }
            }
            if(isCommonCharacter){
                commonString = commonString + charToCheck;
            }
        }
        return commonString;
    }

}
