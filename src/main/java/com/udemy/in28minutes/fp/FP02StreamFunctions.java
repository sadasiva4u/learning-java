package com.udemy.in28minutes.fp;

import java.util.List;

public class FP02StreamFunctions {
    public static void main(String[] args) {
        List integers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(sumOfListElements(integers));

        System.out.println(sumOfListElementsUsingLambda(integers));

        System.out.println(sumOfListElementsUsingInbuiltMethodReferrence(integers));

        System.out.println(largestElement(integers));

        System.out.println(largestElement2(integers));
        System.out.println(smallestElement2(integers));
    }

    private static Integer smallestElement2(List<Integer> integers) {
        return integers.stream()
                .reduce(Integer.MAX_VALUE,(x,y) -> x>y?y:x);
    }

    private static Integer largestElement2(List<Integer> integers) {
        return integers.stream()
                .reduce(Integer.MIN_VALUE,(x,y) -> x>y?x:y);
    }

    private static Integer largestElement(List<Integer> integers) {
        return integers.stream()
                .reduce(0, (x,y) -> x>y?x:y);
    }

    private static Integer sumOfListElementsUsingInbuiltMethodReferrence(List<Integer> integers) {
        return integers.stream()
                .reduce(0, Integer::sum);
    }


    private static Integer sumOfListElementsUsingLambda(List<Integer> integers) {
        return integers.stream()
                .reduce(0, (aggregate,netElement) -> (aggregate+netElement));
    }


    private static Integer add(Integer a, Integer b){
        return a+b;
    }
    private static Integer sumOfListElements(List<Integer> integers) {
        return integers.stream()
                .reduce(0, FP02StreamFunctions::add);
    }
}
