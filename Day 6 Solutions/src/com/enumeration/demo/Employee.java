package com.enumeration.demo;

public class Employee {
enum Department {HR, IT, FINANCE, SALES,MARKETING}
	int empId ;
	String name;
	Department depaartment ;
	
	
	public Employee(int empId , String name , Department depaartment) {
		this.depaartment = depaartment;
		this.empId = empId;
		this.name = name;
	}
	
	public void displayDetails() {
		System.out.println("Employee-Id :" + empId + "\n Name :" + name + "\n Department" + depaartment);
	}
	
	public Department getDepartment() {
		return depaartment;
	}
	
	public void printDepartmentInfo(Department dept) {
		switch(dept) {
		case HR -> System.out.println("Role: Focuses on talent acquisition and workplace culture.");
        case IT -> System.out.println("Role: Maintains systems, security, and software applications.");
        case FINANCE -> System.out.println("Role: Oversees financial planning and budget management.");
        case SALES -> System.out.println("Role: Manages client relationships and revenue expansion.");
        case MARKETING -> System.out.println("Role: Builds campaigns and grows market presence.");
        default -> System.out.println("No such role exixt!");
		}
	}

	public static void main(String[] args) {
	Employee e = new Employee(01 , "omkar kurade" , Department.IT);
	
	e.displayDetails();
	e.printDepartmentInfo(e.getDepartment());
}
}
