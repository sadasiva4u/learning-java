package com.udemy.in28minutes.fp;

import java.util.List;

public class FP04StreamsMatchCases {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Java" , "Functional",4.3,100),
                new Course("Java1" , "Functional1",4.6,300),
                new Course("Java2" , "Functional2",5.0,200),
                new Course("Java3" , "Functional3",4.1,150)
        );

        System.out.println(courses.stream()
                .allMatch(course -> course.rating>4));

        System.out.println(courses.stream()
                .noneMatch(course -> course.rating>5));

        System.out.println(courses.stream()
                .anyMatch(course -> course.rating==5.0));

    }
}

class Course{
    String name;
    String category;
    double rating;
    int numberOfStudents;

    public Course(String name, String category, double rating, int numberOfStudents) {
        this.name = name;
        this.category = category;
        this.rating = rating;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}