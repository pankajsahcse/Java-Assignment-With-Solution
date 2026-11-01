package com.test;

import java.sql.Connection;
import java.util.Scanner;

import com.db.DBConnection;
import com.model.Student;
import com.service.*;

public class StudentManagement {

	public static void main(String[] args) {

//		Connection conn = DBConnection.getConnection();
//		System.out.println(conn);

		Scanner sc = new Scanner(System.in);

		System.err.println("Only Add functionity is avalibale to store in DB");

		System.err.println("*************************");
		StudentService ss = new StudentService();
		System.out.println("Enter your Choice");
		int ch;

		do {
			System.out.println("1.Add Student" + "\n2.Search Student by rollNo" + "\n3.Update Student Details"
					+ "\n4.Delete Student" + "\n5.Display Student Details" + "\n6. Exit");
			System.out.println("Enter your Choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1: {
				ss.addStudent();
			}

				break;
			case 2: {
				System.out.println("Enter Your Roll Number :");
				int rollN = sc.nextInt();
				Student student = ss.searchStudent(rollN);
				System.out.println(student);
			}

				break;
			case 3: {
				System.out.println("Enter Your Roll Number for update :");
				int rollN = sc.nextInt();
				if (ss.updateStudent(rollN)) {
					System.out.println("Update Successfully !");
				}
			}

				break;
			case 4: {
				System.out.println("Enter Your Roll Number for Delete :");
				int rollN = sc.nextInt();
				if (ss.deleteStudent(rollN)) {
					System.out.println("Delete Successfully !");
				}
			}

				break;
			case 5: {
				ss.displayStudent();
			}

				break;

			default:
				break;
			}
		} while (ch != 6);
		sc.close();
	}

}
