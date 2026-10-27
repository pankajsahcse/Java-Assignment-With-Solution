package dao;

import java.util.ArrayList;
import java.util.Scanner;

import model.Student;

public class StudentDao {

	public StudentDao() {
		// TODO Auto-generated constructor stub
	}

	ArrayList<Student> list = new ArrayList<>();

	public void addStudent(Student student) {
		list.add(student);
		System.out.println("Student Added Successfully");
	}

	public Student searchStudentByRollNo(int n) {

		for (Student st : list) {
			if (st.getRollNumber() == n) {
				return st;
			}
		}
		return null;
	}

	public boolean deleteStudentByRollNo(int n) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getRollNumber() == n) {
				list.remove(i);
				return true;
			}
		}

		return false;
	}

	public boolean updateStudentByRollNo(int n) {
		Scanner sc = new Scanner(System.in);
		boolean update = false;

		for (Student st : list) {
			if (st.getRollNumber() == n) {
				System.out.println("Enter Updated Name");
				st.setName(sc.next());
				System.out.println("Enter Updated Age");
				st.setAge(sc.nextInt());
				update = true;
			}
		}
		sc.close();
		return update;

	}

	public void displayStudent() {

		for (Student s : list) {
			System.out.println(s);
		}
	}

}
