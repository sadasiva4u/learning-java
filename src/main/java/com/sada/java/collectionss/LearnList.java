package com.sada.java.collectionss;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {

        ArrayList myList = new ArrayList<>();
        myList.add(123);
        myList.add("Sada");
        myList.add("90");
        myList.add(5465.9);

        System.out.println(myList);

        myList.add(2,456);

        System.out.println(myList);

        myList.add(5,10);
        System.out.println(myList);

        myList.remove("90");
        System.out.println(myList);

        myList.remove((Object) 123);
        System.out.println(myList);

        List<Integer> myList2 = new ArrayList<Integer>();
        myList2.add(456);
        myList2.remove((Integer) 456);

        List<String> strings = new ArrayList<String>();
        strings.add("abc");
        strings.add("zyx");
        strings.add("xyz");

        strings.size();

        for (String temp: strings){
            System.out.println(temp);
        }

        for(int i=0; i<strings.size();i++){
            System.out.println(strings.get(i));
        }

        List<String> strings2 = new ArrayList<String>();
        strings2.addAll(strings);
        strings2.add("ddd");

        System.out.println(strings2);

        System.out.println(strings2.toString());

        Object[] strings3 = strings2.toArray();

        System.out.println(strings3);

        for (Object temp:strings3) {
            System.out.println(temp);
        }

        //Strings, Arrays, ArrayList, HashMap
        //Trees, Graphs, Stacks, Queues, Set

    }
}
