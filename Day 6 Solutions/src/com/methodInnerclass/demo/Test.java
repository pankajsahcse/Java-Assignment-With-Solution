package com.methodInnerclass.demo;

public class Test {

	public static void main(String[] args) {
		Student s = new Student(01 , "Omkar" , 95);
		Student s1 = new Student(02,"Gheek",85);
		
	 
	    s.displayDetail();
	    System.out.println("Grade : \t"+ s.calculateGrade());
	    
	
	    s1.displayDetail();
	    System.out.println("Grade : \t"+ s1.calculateGrade());
	}

}
