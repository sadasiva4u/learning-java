package com.udemy.in28minutes.fp;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP04StreamsSorting {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Java2" , "Functional2",5.0,200),
                new Course("Java" , "Functional",4.3,100),
                new Course("Java1" , "Functional1",4.6,300),
                new Course("Java4" , "Functional1",4.6,250),
                new Course("Java3" , "Functional3",4.1,150)
        );

        // Using primitive Compare is much more effecient
        Comparator courseComparatorIncreasing = Comparator.comparingDouble(Course::getRating);

        // We can compare using generic comparing() as well
        Comparator courseComparatorDecreasing = Comparator.comparing(Course::getRating).reversed();

        System.out.println(courses.stream() .sorted(courseComparatorIncreasing).collect(Collectors.toList()));
        System.out.println(courses.stream() .sorted(courseComparatorDecreasing).collect(Collectors.toList()));


        Comparator comparatorWithMultipleFields =
                Comparator.comparingDouble(Course::getRating).thenComparingInt(Course::getNumberOfStudents);

        System.out.println(courses.stream() .sorted(comparatorWithMultipleFields).collect(Collectors.toList()));


    }
}