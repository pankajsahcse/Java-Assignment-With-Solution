package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.model.Student;
import com.model.StudentInvalidMarkException;
import com.service.StudentSerive;

public class StudentTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Enter student name: ");
			String name = sc.nextLine();

			if (name == null) {
				throw new IllegalArgumentException("Student name cannot be null");
			}

			System.out.println("Enter number of subjects: ");
			int subjects = sc.nextInt();

			Student s1 = new Student(name, subjects);

			int[] marks = new int[subjects];

			for (int i = 0; i < marks.length; i++) {
				System.out.print("Enter marks for subject " + (i + 1) + ": ");
				marks[i] = sc.nextInt();
			}

			StudentSerive ss = new StudentSerive();
			int total = ss.calculateTotal(marks);
			double avg = ss.calculateAverage(total, subjects);
			char ch = ss.calculateGrade(total);

			System.err.println("********Student Details***********");
			System.out.println("Name    : " + s1.getName());
			System.out.println("Total   : " + total);
			System.out.println("Average : " + avg);
			System.out.println("Grade   : " + ch);

		} catch (StudentInvalidMarkException e) { // custom exception calling

			System.out.println("Invalid Marks: " + e.getMessage());

		} catch (InputMismatchException e) { // java util 

			System.out.println("Please enter numbers only.");

		} catch (ArithmeticException e) {   // Calculate average

			System.out.println("Arithmetic Error: " + e.getMessage()); // 

		} catch (IllegalArgumentException e) {

			System.out.println("Invalid Information: " + e.getMessage()); // Student Name

		} finally {

			System.out.println("Program completed.");
			sc.close();
		}

	}

}
