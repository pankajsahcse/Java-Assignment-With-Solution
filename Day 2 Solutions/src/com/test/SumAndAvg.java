package com.test;

import java.util.Scanner;

public class SumAndAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int length = sc.nextInt();
		int[] arr = new int[length];

		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / length;

		System.out.println("Avg: " + avg + " Sum : " + sum);

		sc.close();
	}

}
