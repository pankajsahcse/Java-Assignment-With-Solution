package com.test;
import java.util.Scanner;

public class LargestAndSmallest {
	public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of Array");
		 int l = sc.nextInt();
		 int[] arr = new int[l];
		 
		 System.out.println("Enter the Array Elements");
		 for(int i = 0 ; i < l ; i++) {
			 arr[i] = sc.nextInt(); 
		 }
		 int max = arr[0];
		 int min = arr[0];
		 for(int i = 0 ; i < l ; i++) {
			 if(arr[i] > max) {
				 max = arr[i];
			 }
			 
			 if(arr[i] < min) {
				 min = arr[i];
			 }
		 }
		 
		 System.out.println(max + " is max number");
		 System.out.println(min + " is min number");
		
		 sc.close();
	}

}
