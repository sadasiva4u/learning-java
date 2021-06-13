package com.udemy.in28minutes.fp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FP01StreamsOnArrays {
    public static void main(String[] args) {
        int[] input = {5,8,1,3,9,3,6,4,2};

        System.out.println(Arrays.stream(input)
                .average());

        System.out.println(Arrays.stream(input)
                .sum());

        Arrays.stream(input)
                .filter(x -> x%2==0)
                .forEach(System.out::println );

        Arrays.stream(input)
                .sorted()
                .forEach(System.out::println);
    }
}
