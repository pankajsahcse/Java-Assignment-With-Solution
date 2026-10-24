package com.service;

import com.model.StudentInvalidMarkException;

public class StudentSerive {

	public void validateMarks(int marks) throws StudentInvalidMarkException {

		if (marks < 0 || marks > 100) {

			throw new StudentInvalidMarkException("Marks must be between 0 and 100");
		}
	}

	public int calculateTotal(int[] marks) throws StudentInvalidMarkException {

		int total = 0;

		for (int mark : marks) {

			validateMarks(mark);

			total = total + mark;
		}

		return total;
	}

	public double calculateAverage(int total, int subjects) {

		if (subjects == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}

		return (double) total / subjects;
	}

	public char calculateGrade(double average) {

		if (average >= 90) {
			return 'A';

		} else if (average >= 75) {
			return 'B';

		} else if (average >= 60) {
			return 'C';

		} else if (average >= 50) {
			return 'D';

		} else {
			return 'F';
		}
	}

}
