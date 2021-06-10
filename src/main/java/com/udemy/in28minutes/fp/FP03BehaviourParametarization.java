package com.udemy.in28minutes.fp;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03BehaviourParametarization {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10);

        // We will be passing behaviour / method as parameter to the another method

        //We can assign behaviour to a variable Predicate<Integer> integerPredicate =  x -> x % 2 == 0;
        // extracted(integers, integerPredicate);


        // We can pass the behaviour as argument to another method
        extracted(integers, x -> x % 2 == 0);
        System.out.println("------");
        extracted(integers, x -> x % 2!= 0);
        System.out.println("------");
        extracted(integers, x -> x%3==0);
        System.out.println("------");

        /*
        Collect the output to a List
         */

        //Function<Integer, Integer> integerIntegerFunction = x -> x * x;
        //List<Integer> collectedIntegers = getCollect(integers, x -> x * x);

        System.out.println(getCollect(integers, x -> x * x));
        System.out.println("------");
        System.out.println(getCollect(integers, x -> x * x*x));
        System.out.println("------");
        System.out.println(getCollect(integers, x -> x * 2));

    }

    private static List<Integer> getCollect(List<Integer> integers, Function<Integer, Integer> integerIntegerFunction) {
        return integers.stream()
                .map(integerIntegerFunction)
                .collect(Collectors.toList());
    }


    private static void extracted(List<Integer> integers, Predicate<Integer> integerPredicate) {
        integers.stream()
                .filter(integerPredicate)
                .forEach(System.out::println);
    }
}
