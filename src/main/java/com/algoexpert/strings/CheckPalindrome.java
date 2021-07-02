package com.algoexpert.strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "a";
        System.out.println(isPalindrome_ConstructStringReverse_Bad(str));
        System.out.println(isPalindrome_ConstructStringReverse(str));
        System.out.println(isPalindrome_using2indexes(str));
        System.out.println(isPalindrome_usingRecurssion(str));

    }
    public static boolean isPalindrome_ConstructStringReverse_Bad(String str) {
        char[] chars = str.toCharArray();
        char[] reversedChar = new char[chars.length];
        int length = chars.length-1;
        for(int i = 0; i < chars.length ; i++){
            reversedChar[i]=chars[length];
            length--;
        }

        String reversedStr = String.copyValueOf(reversedChar);
        return str.equals(reversedStr);
    }
    public static boolean isPalindrome_ConstructStringReverse(String str) {
        String reversedStr = "";
        for(int i = str.length()-1 ; i >=0 ; i--){
            reversedStr +=str.charAt(i);
        }
        return str.equals(reversedStr);
    }

    private static boolean isPalindrome_usingRecurssion(String str){
        return palindromeUsingRecurssion(str,0);
    }

    private static boolean palindromeUsingRecurssion(String str,int startIndex) {
        int lastIndex=str.length()-1-startIndex;
        return startIndex >=lastIndex ? true : (str.charAt(startIndex) == str.charAt(lastIndex) && palindromeUsingRecurssion(str,startIndex+1));
    }

    private static boolean isPalindrome_using2indexes(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right) ){
                 return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
