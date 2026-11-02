package com.test;

import java.util.Scanner;

import com.Dao.EmployeeDao;
import com.service.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) {

		EmployeeDao edao = new EmployeeDao();
		EmployeeService es = new EmployeeService(edao);

		Scanner sc = new Scanner(System.in);

		int ch;

		do {
			System.out.println("1. Add Employee" + "\n2. Search Employee by id" + "\n3. Update Employee Details"
					+ "\n4. Delete Employee" + "\n5. Display Employee Data" + "\n6. Exit");

			System.out.println("Enter your Choice");
			ch = sc.nextInt();

			switch (ch) {

			case 1: {
				es.addEmployee();
				break;
			}

			case 2: {
				es.searchEmpById();
				break;
			}

			case 3: {
				es.updateEmp();
				break;
			}

			case 4: {
				es.deleteEmpById();
				break;
			}

			case 5: {
				es.showEmpData();
				break;
			}

			case 6: {
				System.out.println("Exiting...");
				break;
			}

			default: {
				System.out.println("Invalid Choice");
				break;
			}
			}

		} while (ch != 6);

		sc.close();
	}
}
