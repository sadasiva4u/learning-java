package com.udemy.in28minutes.fp;

import java.util.List;

public class FP02HandsOn {
    public static void main(String[] args) {
        List integers = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println(sumOfSquares1(integers));

        System.out.println(sumOfSquares2(integers));

        System.out.println(sumOfOddNumbers(integers));
    }

    private static Integer sumOfOddNumbers(List<Integer> integers) {
        return integers.stream()
                .filter(x -> x%2==1)
                .reduce(0,Integer::sum);
    }


    private static Integer sumOfSquares1(List<Integer> integers) {
        return integers.stream()
                .reduce(0,(x,y) -> (x+   y*y));
    }

    private static Integer sumOfSquares2(List<Integer> integers) {
        return integers.stream()
                .map(x -> x*x)
                .reduce(0, Integer::sum);
                //.reduce(0, (x,y) -> x+y);
    }
}
