package com.leetcode.algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubStringWithoutRepeating {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("au"));
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println("---------");
        System.out.println(lengthOfLongestSubstringMap("abcabcbb"));
        System.out.println(lengthOfLongestSubstringMap("bbbb"));
        System.out.println(lengthOfLongestSubstringMap("pwwkew"));
        System.out.println(lengthOfLongestSubstringMap(" "));
        System.out.println(lengthOfLongestSubstringMap("au"));
        System.out.println(lengthOfLongestSubstringMap("aab"));
        System.out.println(lengthOfLongestSubstringMap("dvdf"));
    }


    static int lengthOfLongestSubstring(String s) {
        int length=0;
        if(s.isEmpty()){
            return length;
        }
        List<Character> charList = new ArrayList<Character>();
        for(int i=0; i<s.length();i++){
            char temp = s.charAt(i);
            if(!charList.contains(temp)){
                charList.add(temp);
            }else {
                if(charList.size() > length){
                    length = charList.size();
                }
                charList.clear();
                charList.add(temp);
            }
        }

        return Math.max(charList.size() , length);
    }

    static int lengthOfLongestSubstringMap(String s){
        int out = 0;
        int lastOccurance = 0;
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        for(int i = 0; i < s.length();i++){
            if(characterIntegerMap.containsKey(s.charAt(i))){
                lastOccurance = Math.max(characterIntegerMap.get(s.charAt(i)) , lastOccurance);
            }
            out = Math.max(out, i - lastOccurance + 1);
            characterIntegerMap.put(s.charAt(i),i+1);
        }

        return out;
    }
}
