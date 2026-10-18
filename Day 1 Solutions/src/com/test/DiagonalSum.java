package com.test;
public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i][i];
			sum += arr[i][arr.length - 1 - i];
		}
		
		if(arr.length % 2 != 0) {
			int m = arr.length / 2  ;
			sum = sum - arr[m][m];
			System.out.println("Sum of Principal Diagonal is : " + sum);
		}else {
			System.out.println("Sum of Principal Diagonal is : " + sum);
		}
			

	}

}
