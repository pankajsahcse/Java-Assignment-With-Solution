package com.test;

import java.util.Scanner;

public class ReverseNum {

	public static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}

	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int num = sc.nextInt();
		int rev = reverse(num);

		System.out.println("Reverse of the Number is "  + rev);
		sc.close();
	}

}