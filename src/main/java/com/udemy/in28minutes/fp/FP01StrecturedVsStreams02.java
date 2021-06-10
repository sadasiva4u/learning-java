package com.udemy.in28minutes.fp;

import java.util.List;

public class FP01StrecturedVsStreams02 {
    public static void main(String[] args) {
        printOnlyEvenInStrectured(List.of(1,2,3,4,5,6,7,8,9,10));

        System.out.println("---------");
        printOnlyEvenInFunctional1(List.of(1,2,3,4,5,6,7,8,9,10));

        System.out.println("---------");
        printOnlyEvenInFunctional2(List.of(1,2,3,4,5,6,7,8,9,10));

    }

    private static void printOnlyEvenInStrectured(List<Integer> integers) {
        for(Integer in : integers){
            if (in%2==0)
            System.out.println(in);
        }
    }

    private static boolean isEven(Integer number){
        return number%2==0;
    }

    private static void printOnlyEvenInFunctional1(List<Integer> integers) {
        // Add filters on Stream to allow only even numbers
        integers.stream()
                .filter(FP01StrecturedVsStreams02::isEven)
                .forEach(System.out::println);
    }

    private static void printOnlyEvenInFunctional2(List<Integer> integers) {
        // Add Lambda expression in filters on Stream to evaluate
        // Lambda takes (param1,param2) -> {code block to execute}
        // Lambda returns one output
        integers.stream()
                .filter(number -> number%2==0)
                .forEach(System.out::println);
    }
}
