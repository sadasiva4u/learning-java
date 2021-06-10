package com.sada.java.inheritance;

public abstract class WildAnimal implements Animal {
    public abstract void getShelter();

    @Override
    public void getFood() {
        System.out.println("Getting Abstract food");
    }
}
