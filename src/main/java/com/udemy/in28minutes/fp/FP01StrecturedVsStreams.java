package com.udemy.in28minutes.fp;

import java.util.List;

public class FP01StrecturedVsStreams {
    public static void main(String[] args) {
        printListInStrectured(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println("---------");
        printListInFunctional1(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println("---------");
        printListInFunctional2(List.of(1,2,3,4,5,6,7,8,9,10));

    }


    // How to iterate...
    private static void printListInStrectured(List<Integer> integers) {
        for(Integer in : integers){
            System.out.println(in);
        }
    }

    //What to do
    /*
    Convert List into Stream
     */
    private static void printListInFunctional1(List<Integer> integers) {
        // We are using method referrence to process the Stream
        integers.stream().forEach(FP01StrecturedVsStreams::myPrint);
    }

    private static void myPrint(Integer number){
        System.out.println(number);
    }

    /*
    System.out have static method println. we can directly use it using Method-Referrence
     */
    private static void printListInFunctional2(List<Integer> integers) {
        integers.stream()
                .forEach(System.out::println);
    }
}
