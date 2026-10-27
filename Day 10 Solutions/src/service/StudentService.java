package service;

import java.util.Scanner;

import dao.StudentDao;
import model.Student;


public class StudentService {

	public StudentService() {
		// TODO Auto-generated constructor stub
	}

	Scanner sc = new Scanner(System.in);

	StudentDao dao = new StudentDao();

	public void addStudent() {
		System.out.println("Enter Your Name: ");
		String name = sc.next();

		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		System.out.println("Enter your Roll Number: ");
		int rollNumber = sc.nextInt();

		Student s1 = new Student(name, rollNumber, age);
		dao.addStudent(s1);

	}

	public Student searchStudent(int rollN) {
		return dao.searchStudentByRollNo(rollN);

	}
	
	public boolean updateStudent(int rollN) {
		return dao.updateStudentByRollNo(rollN);

	}
	
	public boolean deleteStudent(int rollN) {
		return dao.deleteStudentByRollNo(rollN);

	}
	
	

	public void displayStudent() {
		dao.displayStudent();
	}

}
