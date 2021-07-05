package com.leetcode.algos;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Q20_ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }

    private static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        List<Character> openBrackets = List.of('(','{','[');
        List<Character> closingBrackets = List.of('(','{','[');
        for(Character character : s.toCharArray()){
            if(openBrackets.contains(character)){
                characterStack.push(character);
            }else{
                if(characterStack.empty()){
                    return false;
                }
                if(character != getComplementChar(characterStack.peek())) {
                    return false;
                }else {
                    characterStack.pop();
                }
            }
        }
        if(!characterStack.empty()){
            return false;
        }
        return true;
    }


/*
    static boolean isValid(String s) {
        HashMap<Character,Integer> charMapCount = new HashMap<>();
        for (Character character:s.toCharArray()) {
            Character complementChar = getComplementChar(character);
            if(charMapCount.containsKey(complementChar)){
                int count = charMapCount.get(complementChar) -1;
                if(count == 0){
                    charMapCount.remove(complementChar);
                }
            }else {
                charMapCount.put(character,null == charMapCount.get(character) ? 1: charMapCount.get(character)+1);
            }
        }

        return charMapCount.isEmpty();
    }*/

    static Character getComplementChar(Character c){
        switch(c) {
            case '(':
                return ')';
            case '{':
                return '}';
            case '[':
                return ']';
        }
        return null;
    }

}
