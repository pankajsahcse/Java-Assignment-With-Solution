package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.db.DBConnection;
import com.model.Student;

public class StudentDao {
	
	Connection con = DBConnection.getConnection();

	public StudentDao() {

	}

	ArrayList<Student> list = new ArrayList<>();

	public void addStudent(Student student) {

		String q = "INSERT INTO Student (name, roll_number, age) VALUES(?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(q);

			ps.setString(1, student.getName());
			ps.setInt(2, student.getRollNumber());
			ps.setInt(3, student.getAge());

			int i = ps.executeUpdate();

			if (i == 1) {
				System.out.println("Student add successfully in DB");
			} else {
				System.out.println("Something went wrong on server");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		return update;
	}

	public void displayStudent() {

		for (Student s : list) {
			System.out.println(s);
		}
	}

}
