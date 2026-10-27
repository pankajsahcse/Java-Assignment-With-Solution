package model;

public class Student {

	private String name;
	private int rollNumber;
	private int age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollNumber, int age) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Studentservices [name=" + name + ", rollNumber=" + rollNumber + ", age=" + age + "]";
	}

}
