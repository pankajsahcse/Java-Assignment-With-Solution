package com.test;

import java.util.Scanner;

public class PrimeInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int start = sc.nextInt();
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			if (Prime.isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		sc.close();

	}

}
