package com.service;

import java.util.List;
import java.util.Scanner;

import com.Dao.EmployeeDao;
import com.model.Employee;

public class EmployeeService {

	Scanner sc = new Scanner(System.in);

	EmployeeDao dao;

	public EmployeeService(EmployeeDao dao) {
		this.dao = dao;
	}

	// add Employee

	public void addEmployee() {
		System.out.println("Enter Your Name: ");
		String name = sc.next();

		System.out.println("Enter your dept: ");
		String dept = sc.next();

		System.out.println("Enter your Salary: ");
		double sal = sc.nextDouble();

		Employee e = new Employee(name, dept, sal);

		dao.addEmployee(e);

	}

	// display all employee
	public void showEmpData() {
		List<Employee> elist = dao.displayEmployeeData();

		for (Employee employee : elist) {
			System.out.println(employee);
		}
	}

	// search by id

	public void searchEmpById() {
		System.out.println("Enter id");
		int id = sc.nextInt();

		Employee e = dao.searchEmpById(id);

		if (e != null) {
			System.out.println(e);
		}
	}

	// delete by id

	public void deleteEmpById() {
		System.out.println("Enter id");
		int id = sc.nextInt();

		boolean ans = dao.deleteEmpById(id);

		System.out.println(ans ? " Deleted " : " Not deleted");
	}

//	update by id 

	public void updateEmp() {
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		boolean u = dao.updateEmpById(id);

		System.out.println(u ? "Updated " : " Not Updated");
	}

}
