package com.sada.java.collectionss;

import java.util.*;

public class LearnMap {

    public static void main(String[] args) {
        List<String> listOne = new ArrayList<String>();
        listOne.add("1");
        listOne.add("One");
        List<String> listTwo = new ArrayList<String>();
        listTwo.add("2");
        listTwo.add("Two");

        Map<Integer,List<String>> myMap = new HashMap<Integer,List<String>>();
        /*
        Extends --> Extend another class / abstract class
            Implemented Method , variables are inherited
            Can extend only 1 class anytime

        Implements --> Interface
            Has to implement methods from Implement
            Can implement multiple interfaces
         */


        myMap.put(1,listOne);
        myMap.put(2,listTwo);
        myMap.put(3,listOne);

        System.out.println(myMap);

        // Kay, Value
        // Will generate Hash for each key

        System.out.println(myMap.entrySet());
        for (Map.Entry<Integer,List<String>> entry
                : myMap.entrySet() ) {
            System.out.println("Key="+entry.getKey() +",Value="+entry.getValue());
        }

        Set<Integer> keySet = myMap.keySet();
        System.out.println(myMap.keySet());
        for (Integer i:keySet) {
            System.out.println(i);
            //System.out.println(myMap.get(i));
        }

        myMap.remove(3);
    }
}
