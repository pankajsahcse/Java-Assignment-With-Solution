package com.annonymousclass;

import java.util.Scanner;

public class TestAnnonymous {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and Breadth");
		int le = sc.nextInt();
		int br = sc.nextInt();

		Shape r;
		r = new Shape() {
			public void calculateArea() {
				System.out.println("Area of Rectangle :" + le * br);
			}
		};
		r.calculateArea();
		sc.close();
	}
}
