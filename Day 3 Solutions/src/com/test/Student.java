package com.test;

public class Student {

    int id;
    String name;
    int age;
    Course course;  

    Student(int id, String name, int age, Course course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void displayStudent() {
        System.out.println("Student ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Course     : " + course.courseName);
        System.out.println();
    }
}