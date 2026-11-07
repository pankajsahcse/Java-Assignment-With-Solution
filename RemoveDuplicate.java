package com.day3;

public class RemoveDuplicate {

	public static void removeDuplicate(int[] arr) {

		int[] result = new int[arr.length];
		int k = 0;

		for (int i = 0; i < arr.length; i++) {

			boolean duplicate = false;

			for (int j = 0; j < k; j++) {
				if (arr[i] == result[j]) {
					duplicate = true;
					break;
				}
			}

			if (!duplicate) {
				result[k] = arr[i];
				k++;
			}

		}

		for (int i = 0; i < k; i++) {
			System.out.print(result[i] + " ");
		}
	}

	// Remove duplicate from sorted array method 2

	public static int removeDup(int[] arr) {
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}
		return j + 1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

//		RemoveDuplicate.removeDuplicate(arr);

// Remove Duplicate by other method 

		int resultOfRemoveDup = removeDup(arr);

		for (int i = 0; i < resultOfRemoveDup; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
