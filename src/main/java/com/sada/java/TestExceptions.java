package com.sada.java;

import java.sql.SQLException;

public class TestExceptions {

    /*Compile time exceptions
            Checked Exceptions

    Run time exceptions
            Unchecked Exceptions

     */
    public static void main(String[] args) {
test1();

    }

    static void test1(){
test3();
    }

    static void test3(){
        test2();
    }

    static void test2(){
        try{
            String abc = null;
            abc.length();
        }catch (NullPointerException ex){
            Object[] exception =ex.getStackTrace();
            for (Object obj: exception
            ) {
                System.out.println(obj.toString());
            }
        }
        System.out.println("After Try-Catch -1");

        try {
            String abc = null;
            abc.length();
        }catch (ArrayIndexOutOfBoundsException ex){
            Object[] exception =ex.getStackTrace();
            for (Object obj: exception
            ) {
                System.out.println(obj.toString());
            }
        }catch (NullPointerException npe){
            Object[] exception =npe.getStackTrace();
            for (Object obj: exception
            ) {
                System.out.println(obj.toString());
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        System.out.println("After Try-Catch -2");

        throw new Error();
    }
}
