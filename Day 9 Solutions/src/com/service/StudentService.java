package com.service;

import java.util.List;

import com.model.Student;

public class StudentService {

	// Marks Add

	public <T> void addMarks(Student<T> student, T marks) {
		student.getMarks().add(marks); // add is the method of ArrayList
	}

	// Display Details of Student
	public <T> void studentDetails(Student<T> s) {
		System.out.println("Studnet Id is - " + s.getStudentId());
		System.out.println("Studnet Name is - " + s.getStudentName());
		System.out.println("Studnet Marks is - " + s.getMarks());
		System.err.println("******************");
	}

	// Display All Students
	public void displayAllStudents(List<Student<?>> students) {
		for (Student<?> student : students) {
			studentDetails(student);
		}
	}

	// Displaying Marks

	public <T> void displayMarks(List<T> marks) {

		for (T mark : marks) {

			System.out.println(mark);
		}
	}

	// Upper Bound
	public void calculateTotal(List<? extends Number> marks) {
		double total = 0;
		for (Number mark : marks) {
			total = total + mark.doubleValue();
		}
		System.out.println("Total = " + total);
	}
	


}
