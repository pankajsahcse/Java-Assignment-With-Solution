package com.model;

public class Employee {

	private int id;
	private String empName;
	private String dept;
	private double salary;

	public Employee() {

	}

	public Employee(String empName, String dept, double salary) {

		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.empName = name;
		this.dept = dept;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
