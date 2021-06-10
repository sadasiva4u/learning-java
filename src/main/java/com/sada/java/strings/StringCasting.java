package com.sada.java.strings;

public class StringCasting {
    public static void main(String[] args) {
        Integer integer = 100;

        String abc = String.valueOf(integer);

        System.out.println(integer);
        System.out.println(abc);

        Double dd = Double.valueOf(integer);
        Double dd1 = (double)integer ;

        System.out.println(dd);
        System.out.println(dd1);

        double d = 12.34;
        int i = (int)d;

        System.out.println(i);

        Integer i1 = dd.intValue();

        System.out.println(i1);

    }
}
