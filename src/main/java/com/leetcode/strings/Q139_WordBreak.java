package com.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class Q139_WordBreak {
    public static void main(String[] args) {
        ArrayList<String> wordDict = new ArrayList<>();
        wordDict.add("car");
        wordDict.add("ca");
        wordDict.add("rs");
        System.out.println(wordBreak("cars",wordDict ));
    }


    static boolean wordBreak(String s, List<String> wordDict) {
        //String original = s;
        //List<String> originalWordDirectory =  wordDict;
        //boolean isWordBreak= false;
        //for(String str:wordDict){
//            if(s.contains(str)){
//                s=s.replaceAll(str,"");
//            }
            //wordBreak2(s,wordDict.get(0),wordDict);
        //}

        ArrayList<String> abc = new ArrayList<>();
        abc.addAll(wordDict);
        return wordBreak2(s,abc);
    }

    static boolean wordBreak2(String s, ArrayList<String> wordDict) {
        String temp = s;
        for (String str:wordDict) {
            if(temp.contains(str)){
                temp=temp.replaceAll(str,"");
            }
        }

        wordDict.remove(wordDict.get(0));
        if(wordDict.isEmpty()){
            return (temp.isEmpty() || temp.isBlank())? true:false;
        }

        return (temp.isEmpty() || temp.isBlank() || wordBreak2(s, wordDict))? true:false;
    }
}
