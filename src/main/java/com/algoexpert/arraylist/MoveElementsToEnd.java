package com.algoexpert.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementsToEnd {

    public static void main(String[] args) {
        System.out.println(moveElementToEnd(List.of(-1, 3, 2, 4, 1, 2,2 ) , 2) );
    }
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.

        int left = 0;
        int right = array.size()-1;
        while(left < right){
            while(array.get(right) == toMove){
                right--;
            }
            if(array.get(left) == toMove ){
                swap(array, left, right);
            }

            left++;
        }
        return array;
    }

    private static void swap(List<Integer> array, int left, int right) {
        int temp = array.get(right);
        array.set(right,  array.get(left));
        array.set(left, temp);
    }
}
