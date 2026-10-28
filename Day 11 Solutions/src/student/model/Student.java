package student.model;

public class Student {
	
	private String name;
	private int rollN;
	private int marks;
	private String department;
	

	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int rollN, int marks, String department) {
		super();
		this.name = name;
		this.rollN = rollN;
		this.marks = marks;
		this.department = department;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollN() {
		return rollN;
	}


	public void setRollN(int rollN) {
		this.rollN = rollN;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollN=" + rollN + ", marks=" + marks + ", department=" + department + "]";
	}
	
}
