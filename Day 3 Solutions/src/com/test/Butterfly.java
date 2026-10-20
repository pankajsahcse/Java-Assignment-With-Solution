package com.test;

import java.util.Scanner;

public class Butterfly{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows:");
		int n = sc.nextInt();

		// upper
		for (int i = 1; i <= n; i++) {

			// star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// lower
		for (int i = n - 1; i >= 1; i--) {

			// star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

//        space
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		sc.close();
	}
}