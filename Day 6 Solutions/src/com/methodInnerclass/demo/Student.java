package com.methodInnerclass.demo;

public class Student {
	int rollNo, marks;
	String name;

	public Student(int rollNo, String name, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;

	}

	public void displayDetail() {
		System.out.println("Roll-No : " + rollNo + "\nName : " + name + "\nMarks : " + marks);
	}

	public String calculateGrade() {
		class Grade {

			public Grade() {
			}

			public String gradDisplay(int marks) {

				if (marks <= 100 && marks >= 90) {
					return "A";
				} else if (marks >= 75) {
					return "B";
				} else if (marks >= 60) {
					return "C";
				} else if (marks >= 40) {
					return "D";
				} else
					return "F";
			}
		}
		Grade g = new Grade();
		return g.gradDisplay(this.marks);
	}

}
