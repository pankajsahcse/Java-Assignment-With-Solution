package com.test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		System.out.print(a);
		System.out.print(b);
		for (int i = 2; i < n; i++) {
			int t = a;
			a = b;
			b = a + t;
			System.out.print(b);
		}
		sc.close();
	}

}
