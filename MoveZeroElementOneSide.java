package com.day2;

import java.util.Arrays;

public class MoveZeroElementOneSide {

	// Move zero at end
	public static void moveZeroEnd(int[] arr) {
       // { 2, 4, 0, 7, 2, 5, 0, 8, 0 }
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	// Move zero at starting without maintain order
	public static void moveZeroStart(int[] arr) {
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	// Move Zero at stating with maintain order

	public static void moveZeroAtStarting(int[] arr) {

		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {

				int temp = arr[i];

				for (int k = i; k > j; k--) {
					arr[k] = arr[k - 1];
				}

				arr[j] = temp;
				j++;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int[] arr = { 0, 2, 4, 0, 7, 2, 5, 0, 8, 0 };

//		int[] a = { 3, 0, 0, 4, 0 };
		MoveZeroElementOneSide.moveZeroEnd(arr);

//		MoveZeroElementOneSide.moveZeroStart(arr);

		// after reflecting original array this will work

		MoveZeroElementOneSide.moveZeroAtStarting(arr);

	}

}
