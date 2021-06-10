package com.udemy.in28minutes.fp;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03ImplementFunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10);

        // Abstract method in FunctionalInterface is called function-descriptor

        Predicate<Integer> integerPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };

        Function<Integer, Integer>  integerIntegerFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };

        Consumer<Integer> println = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        /*
        integers.stream()
                .filter(x -> x%2==0)
                .map(x -> x*x)
                .forEach(System.out::println);
         */
        integers.stream()
                .filter(integerPredicate)
                .map(integerIntegerFunction)
                .forEach(println);

        System.out.println("-----------------");

        BinaryOperator<Integer> sum = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };

        Integer output2 = integers.stream()
                .reduce(0, sum);

        System.out.println(output2);

    }
}
