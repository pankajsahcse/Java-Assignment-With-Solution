package com.test;

public class StudentTest {

	public static void main(String[] args) {

		Course c1 = new Course(101, "Java");
		Course c2 = new Course(102, "Python");

		Student s1 = new Student(1, "Pankaj", 24, c1);
		Student s2 = new Student(2, "ABC", 21, c2);

		s1.displayStudent();
		s2.displayStudent();
	}
}