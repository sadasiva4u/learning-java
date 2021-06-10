package com.sada.java;

public class LearnToString {
    public static void main(String[] args) {
        Person neha = new Person();
        neha.setName("Neha");
        neha.setAge(20);
        neha.setStatus("Active");

        System.out.println(neha.toString());
    }
}


//POJO --> Plain Old Java Object
class Person{
    String name;
    int age;
    String status;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                '}';
    }
}