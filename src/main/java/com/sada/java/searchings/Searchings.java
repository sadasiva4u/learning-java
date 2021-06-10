package com.sada.java.searchings;

import java.text.MessageFormat;
import java.util.*;

public class Searchings {

    public static void main(String[] args) {
        int[] input = {2,5,8,12,33,7,21,16,11,1,18,26,38};
        Integer[] input2 = {2,5,8,12,33,7,21,16,11,1,18,26,38};
        int searchElement=16;
        System.out.println(MessageFormat.format("LinearSearch index of element {0} is {1}",searchElement,linearSearch(input,searchElement)));

        System.out.println(MessageFormat.format("LinearSearch Approach2 index of element {0} is {1}",searchElement,linearSearch2(input,searchElement)));

        searchInDataStrectures(input2);

        Arrays.sort(input);
        System.out.println(MessageFormat.format("BinarySearch element present={0} for searchElement={1}",binarySearch(input,searchElement,0,input.length-1),searchElement));
    }

    /*
    Search from beginning to ending of the array by vising each element

    O(n) complexity
     */
    static int linearSearch(int[] input,int searchElement){
        int position=-1;
        for (int i=0;i<input.length;i++) {
            if(input[i] == searchElement)
                return position=i;
        }
        /*
        ForEach can only tell if element is present or not, it won't give index
         */
        for (int element: input) {
            if(element==searchElement){
                System.out.println("Element found");
            }
        }
        return position;
    }

    /*
        O(n/2) complexity
     */
    static int linearSearch2(int[] input,int searchElement){
        int position=-1;
        int leftIndex=0;
        int rightIndex=input.length-1;

        while(leftIndex<=rightIndex){
            if(input[leftIndex] == searchElement){
                position=leftIndex;
            }
            if(input[rightIndex]==searchElement){
                position=rightIndex;
            }
            ++leftIndex;
            --rightIndex;
        }

        return position;
    }

    static void searchInDataStrectures(Integer[] ints) {
        List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(ints));
        System.out.println(integerList.contains(16));
        System.out.println(integerList.indexOf(16));

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

    }

      /*
        Search array by sorting it first & searching 1/2 everytime
        But it works only on sorted Array
      */
    static boolean binarySearch(int[] input,int searchElement,int beginIndex, int endIndex){
        int mid = (beginIndex+endIndex)/2;

        if(input[mid] == searchElement){
                return true;
        }else if(input[mid] > searchElement){
            return binarySearch(input,searchElement,beginIndex,mid-1);
        }else {
            return binarySearch(input,searchElement,mid+1,endIndex);
        }
    }
}