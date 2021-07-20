package com.leetcode.strings;

import java.util.Stack;

public class BackspaceComparison {
    public static void main(String[] args) {
//        System.out.println(backspaceCompare("ab#c","ad#c"));
//        System.out.println(backspaceCompare("ab##","a#b#"));
//        System.out.println(backspaceCompare("a##c","#a#c"));
//        System.out.println(backspaceCompare("a#c","b"));
//        System.out.println(backspaceCompare("a","a"));
//        System.out.println(backspaceCompare("",""));
        System.out.println(backspaceCompare("xywrrmp","xywrrmu#p"));
    }

    private static boolean backspaceCompare(String s, String t) {

        Stack<Character> stack1 = extracted(s);
        Stack<Character> stack2 = extracted(t);

        String str1 = extracted(stack1, "");
        String str2 = extracted(stack2, "");

        return str1.equals(str2);
    }

    private static Stack<Character> extracted(String s1) {
        Stack<Character> stack1= new Stack<>();
        for(Character ch : s1.toCharArray()){
            if(ch == '#'){
                if(!stack1.isEmpty()){
                    stack1.pop();
                }else{
                    stack1.push(ch);
                }
            }
        }
        return stack1;
    }

    private static String extracted(Stack<Character> stack1, String str1) {
        for(int i = 0; i < stack1.size(); i++){
            str1 = str1 + stack1.pop();
        }
        return str1;
    }
}
