package com.test;

import java.util.Scanner;

public class Trangel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
