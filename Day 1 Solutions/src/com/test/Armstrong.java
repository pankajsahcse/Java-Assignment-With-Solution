package com.test;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num;
		int original = num;

		int sum = 0;

		int digit = 0;

		while (temp > 0) {
			digit++;
			temp = temp / 10;
		}

		while (num > 0) {
			int rem = num % 10;
			sum = sum + (int) Math.pow(rem, digit);
			num = num / 10;
		}

		if (sum == original) {
			System.out.println("Its a Armstrong");
		} else {
			System.out.println("Its not Armstrong");
		}
		sc.close();
	}

}
