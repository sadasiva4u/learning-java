package com.sada.java.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearnStreams3 {
    public static void main(String[] args) {

List<Student> students = List.of(
        new Student("Neha" , 21, "cse" , 100000.00),
        new Student("Sada" , 35, "ece" , 110000.00),
        new Student("Bill" , 28, "cse" , 120000.00),
        new Student("Trump" , 30, "IT" , 150000.00) );

        Predicate<Student> dept = stu -> stu.getDeparment().equalsIgnoreCase("cse");

        students.stream()
            .filter(dept)
            .forEach(System.out::println);

    }
}


class Student{
    String name;
    int age;
    String deparment;
    double fee;

    public Student(String name, int age, String deparment, double fee) {
        this.name = name;
        this.age = age;
        this.deparment = deparment;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", deparment='" + deparment + '\'' +
                ", fee=" + fee +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}