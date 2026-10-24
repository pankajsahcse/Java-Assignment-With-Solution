package com.model;

public class Student{

	private String name;
	private int subjects;
	
	public Student(String name, int subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getSubjects() {
        return subjects;
    }
}
