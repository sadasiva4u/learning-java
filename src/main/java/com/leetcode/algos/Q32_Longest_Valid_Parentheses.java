package com.leetcode.algos;

import java.util.List;
import java.util.Stack;

public class Q32_Longest_Valid_Parentheses {
    public static void main(String[] args) {
        //System.out.println(longestValidParentheses("(()"));
        //System.out.println(longestValidParentheses(")()())"));
        //System.out.println(longestValidParentheses(""));
        System.out.println(longestValidParentheses("()(()"));
    }
    static int longestValidParentheses(String s) {
        List<Character> openBrackets = List.of('(','{','[');
        List<Character> closingBrackets = List.of('(','{','[');

        int longest = 0;
        Stack<Character> characterStack = new Stack<>();
        int counter = 0;

        for(Character character : s.toCharArray()){
            if(openBrackets.contains(character)){
                characterStack.push(character);
            }else if(!characterStack.empty() && character == (getComplementChar(characterStack.peek()))) {
                characterStack.pop();
                counter +=2;
            }else {
                counter=0;
            }
            longest=Math.max(longest,counter);
        }

        return longest;
    }

    static Character getComplementChar(Character c){
        switch(c) {
            case '(':
                return ')';
            case '{':
                return '}';
            case '[':
                return ']';
//            case ')':
//                return '(';
//            case '}':
//                return '{';
//            case ']':
//                return '[';
        }
        return null;
    }
}
