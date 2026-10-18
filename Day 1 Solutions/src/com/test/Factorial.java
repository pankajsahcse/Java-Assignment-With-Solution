package com.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");

		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Enter a valid number");
		} else if (num == 1) {
			System.out.println("Factorial of number :" + num + " is " + 1);
		} else {

			int fact = 1;

			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of number :" + num + " is " + fact);
		}
		sc.close();

	}

}
