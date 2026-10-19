package com.test;

import java.util.Scanner;

public class Prime {

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check Prime or not");

		int n = sc.nextInt();

		if (isPrime(n)) {
			System.out.println("Is prime");
		} else {
			System.out.println("Is Not prime");
		}
		sc.close();

	}

}
