package com.sada.java.inheritance;

public class LionClass extends WildAnimal{

    @Override
    public void makeNoise() {
        System.out.println("ROOORREEEE");
    }

    @Override
    public void getShelter() {
        System.out.println("Lion Shelter");
    }

    @Override
    public void getFood() {
        System.out.println("Lion Food");
    }
}
