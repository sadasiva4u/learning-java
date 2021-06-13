package com.sada.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStreams {

    static boolean isEven(int x){
        return !(x%2==0);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        // Functional programming... Streams & Lambda's
        // :: is for method referrence
        numbers.stream()
                .filter(LearnStreams::isEven)
                .forEach(System.out::println);
        System.out.println("------");

        // Lambda syntax
        // (a,b) -> { }
        numbers.stream()
                .filter(x -> !(x%2==0))
                .forEach(System.out::println);
        System.out.println("------");

        numbers.stream()
                .filter((x) -> {
                    System.out.println(x);
                    return !(x%2==0);
                })
                .forEach(System.out::println);
        System.out.println("------");

        numbers.stream()
                .filter(x -> !(x%2==0))
                .map(x -> x*x)
                .forEach(y -> System.out.println(y));

        System.out.println("------");

        List<Integer> oddSquares= numbers.stream()
                .filter(x -> !(x%2==0))
                .map(x -> x*x)
                .collect(Collectors.toList());

        System.out.println("oddSquares=" +oddSquares);

        System.out.println("------");

        // Traditional or Strectured programming
        for(int input : numbers){
            if(! (input%2==0)){
                System.out.println(input);
            }
        }
    }

    static List<Integer> oddSqueres(List<Integer> numbers){

        /*
        List<Integer> oddSquares= numbers.stream()
                .filter(x -> !(x%2==0))
                .map(x -> x*x)
                .collect(Collectors.toList());
        */

        List<Integer> output = new ArrayList<>();

        for (int i:numbers) {
            if(! (i%2==0)){
                output.add(i*i);
            }
        }
        return output;
    }

}
