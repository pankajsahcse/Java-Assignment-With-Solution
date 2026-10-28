package student.test;

import student.model.*;
import student.service.StudentServices;

import java.util.List;

import student.dao.*;

public class TestStudent {

	public static void main(String[] args) {

		StudentDao sdao = new StudentDao();

		Student s1 = new Student("Paras", 101, 85, "cdac");
		Student s2 = new Student("Pankaj", 102, 95, "Ecs");
		Student s3 = new Student("Sahil", 103, 99, "Mech");
		Student s4 = new Student("Ram", 104, 48, "It");
		Student s5 = new Student("Sham", 105, 55, "civil");
		Student s6 = new Student("Om", 105, 15, "Cse");

		sdao.addStudentData(s1);
		sdao.addStudentData(s2);
		sdao.addStudentData(s3);
		sdao.addStudentData(s4);
		sdao.addStudentData(s5);
		sdao.addStudentData(s6);

	
		StudentServices service = new StudentServices(sdao);

		// Roll Number Ascending
		System.out.println("Roll Number Ascending");

		printStudents(service.sortByRollNumber());

		//  Name Ascending
		System.out.println("\nName Ascending");

		printStudents(service.sortByName());
		//  Merit List - Marks Descending
		System.out.println("\nMerit List - Marks Descending");

		printStudents(service.meritListByMarks());

		//  Department Ascending + Name Ascending
		System.out.println("\nDepartment Ascending + Name Ascending");

		printStudents(service.sortByDepartmentAndName());

		// Department Ascending + Marks Descending
		System.out.println("\nDepartment Ascending + Marks Descending");

		printStudents(service.sortByDepartmentAndMarks());

		//  Marks Descending + Roll Number Ascending
		System.out.println("\nMarks Descending + Roll Number Ascending");

		printStudents(service.sortByMarksAndRollNumber());

		//  Department Ascending + Marks Descending + Name Ascending
		System.out.println("\nDepartment Ascending + Marks Descending + Name Ascending");

		printStudents(service.sortByDepartmentMarksAndName());
	}

	public static void printStudents(List<Student> students) {

		for (Student student : students) {
			System.out.println(student);
		}

	}

}
