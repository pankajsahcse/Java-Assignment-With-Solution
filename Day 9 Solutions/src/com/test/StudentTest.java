package com.test;

import com.model.Student;
import com.service.StudentService;

public class StudentTest {

	public static void main(String[] args) {

		StudentService ss = new StudentService();

		// Integer Type Student
		Student<Integer> s1 = new Student<Integer>("Pankaj");

		ss.addMarks(s1, 98);
		ss.addMarks(s1, 65);
		ss.addMarks(s1, 65);
		ss.addMarks(s1, 43);
		ss.addMarks(s1, 67);

		ss.studentDetails(s1);

		// Double Type Student

		Student<Double> ss1 = new Student<Double>("Shyam");

		ss.addMarks(ss1, 90.07);
		ss.addMarks(ss1, 69.04);
		ss.addMarks(ss1, 78.04);
		ss.addMarks(ss1, 61.02);
		ss.addMarks(ss1, 81.07);

		ss.studentDetails(ss1);

		System.out.println("-----------------------------------");

		
		 // Calculate Total
        // Upper bound

        System.out.print("Integer Total = ");
        ss.calculateTotal(s1.getMarks());  // calculate in service , of Integer Student

        System.out.print("Double Total =");
        ss.calculateTotal(ss1.getMarks()); // calculate in service , of Double Student
        
     

	}

}
