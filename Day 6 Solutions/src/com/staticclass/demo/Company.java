package com.staticclass.demo;

public class Company {
	
	private  String comName ,location;
	
	// Static member (shared across all instances)
    private static String companyCode = "COMP-2026";
	
	public Company(String comName , String location) {
		this.comName = comName;
		this.location = location;
	}
	
	public String display() {
        return "Company Name : " + comName + "\nLocation : " + location;
    }
	
	static class Employee{
		int empId;
		String empName;
		
	public Employee(int empId , String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public void displayAll() {
		// 1. Direct Access to Outer Static Member (Allowed directly)
        System.out.println("Company Code (Static): " + companyCode);
        
        // 2. Access to Outer Non-Static Members 
        // CANNOT access comName or location directly (e.g., comName will throw a compiler error).
        // MUST instantiate Company first to access non-static members:
        Company c = new Company("ABC Tech", "Pune");
        System.out.println(c.display());
		
		System.out.println(  "\nEmployee Name : " + empName + "\nEmployee Id : " + empId);
	}
	
	}
	
	public static void main(String[] args) {
		Company.Employee e = new Company.Employee(1, "Omkar");
		e.displayAll();
	}

}
