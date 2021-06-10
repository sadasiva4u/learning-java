package com.sada.java.collectionss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        int arr1[]={10,10,5,3,4,3,5,6,3,3,6,6,6,6,9};

        System.out.println(findRepeatWithIndexEfficient(arr1,arr1.length));
    }

    private static Map<Integer, ArrayList<Integer>> findRepeatWithIndexEfficient(int[] arr, int n) {
        HashMap<Integer, ArrayList<Integer>> temp = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            //Loop-1
            if(temp.containsKey(arr[i])) {
                ArrayList<Integer> listOfIndexes = temp.get(arr[i]);
                listOfIndexes.add(i);
                temp.put(arr[i], listOfIndexes);
            } else {

                ArrayList<Integer> listOfIndexes = new ArrayList<Integer>();
                listOfIndexes.add(i);
                temp.put(arr[i], listOfIndexes);
            }
        }
        return temp;
    }
}
