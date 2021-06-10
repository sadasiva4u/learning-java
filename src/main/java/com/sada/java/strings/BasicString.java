package com.sada.java.strings;

public class BasicString {
    public static void main(String[] args) {
        String abc = "Neha4324675409843090123";
        String xyz = new String ("Sada3474732");

        System.out.println(xyz.substring(2));
        System.out.println(xyz.substring(2,5));

        String[] strings = abc.split("43");

        for(String temp: strings){
            System.out.println(temp);
        }

        // Count number of 2's in a String
        char[] chars = abc.toCharArray();
        int count=0;
        for(char c:chars){
            if(c == '2'){
                ++count;
            }
        }
        System.out.println(count);

        String str = "abc";
        String str1 = "abc";
        str = str.concat(str1);
        System.out.println(str1);
        System.out.println(str);

    }
}
