package com.model;

import java.util.ArrayList;
import java.util.List;

public class Student<T> {

	private int studentId;
	private String studentName;
	private List<T> marks;
	static int count = 1;
	
	public Student() {
		
	}

	public Student( String studentName) {
		super();
		this.studentId = count;
		this.studentName = studentName;
		this.marks = new ArrayList<T>();
		count++;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<T> getMarks() {
		return marks;
	}

	public void setMarks(List<T> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	
	

}
