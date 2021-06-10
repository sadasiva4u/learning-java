package com.sada.java.inheritance;

public class MainClass {

    public static void main(String[] args) {
        WildAnimal wildAnimal1 = new LionClass();
        wildAnimal1.getFood();

        WildAnimal wildAnimal2 = new LeopardClass();
        wildAnimal2.getFood();

    }
}
