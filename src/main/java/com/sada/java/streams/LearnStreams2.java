package com.sada.java.streams;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class LearnStreams2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Abc","Sada","Neha");

        System.out.println(strings);

        System.out.println(strings.stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println(strings.stream()
                .sorted()
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList()));

        System.out.println(strings.stream()
                .filter(x -> {
                   return x.startsWith("N");
                }).collect(Collectors.toList()));
    }
}
