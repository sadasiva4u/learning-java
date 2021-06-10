package com.udemy.in28minutes.fp;

import java.util.List;

public class FP01HandsOn {
    public static void main(String[] args) {
        List integers = List.of(1,2,3,4,5,6,7,8,9,10,11,12);
        printOnlyAddNumbers(integers);
        System.out.println("-----------");

        List strings = List.of("java","c","c++","javascript","python","Spring");
        printListOfStrings(strings);
        System.out.println("-----------");
        printStringsWithLengthMorethan4(strings);

        System.out.println("-----------");
        printStringsWithLength(strings);

        System.out.println("-----------");
        printSquareOfAddNumbers(integers);
    }

    // We can use map() without filter()
    private static void printStringsWithLength(List<String> strings) {
        strings.stream()
                .map(str -> str + " length=" + str.length())
                .forEach(System.out::println);

        strings.stream()
                .map(str -> {return
                        str + " length=" + str.length();
                })
                .forEach(System.out::println);

    }

    // filter() map() of streams
    private static void printSquareOfAddNumbers(List<Integer> integers) {
        integers.stream()
                .filter(num -> num%2==1)
                .map(num -> num*num)
                .forEach(System.out::println);
    }

    private static void printStringsWithLengthMorethan4(List<String> strings) {
        strings.stream()
                .filter(str -> str.length() > 4)
                .forEach(System.out::println);

        strings.stream()
                .filter(str -> {
                    return str.length() > 4;
                })
                .forEach(System.out::println);
    }

    private static void printListOfStrings(List<String> strings) {
        strings.stream()
                .filter(str -> str.startsWith("j"))
                .forEach(System.out::println);
    }

    private static void printOnlyAddNumbers(List<Integer> integers) {
        integers.stream()
                .filter(number -> number%2==1)
                .forEach(System.out::println);
    }
}
