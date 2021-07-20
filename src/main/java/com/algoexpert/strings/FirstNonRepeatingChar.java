package com.algoexpert.strings;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("faadabcbbebdf"));
    }

    public static int firstNonRepeatingCharacter(String string) {
        for(int i = 0; i < string.length()-1 ; i++){
            char ch = string.charAt(i);
            if(! (string.substring(0, i) + string.substring(i+1, string.length()) ).contains(""+ch)){
                return i ;
            }
        }
        return -1;
    }
}
