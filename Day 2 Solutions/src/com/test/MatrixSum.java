package com.test;
import java.util.Scanner;

public class MatrixSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

  
        for (int i = 0; i < rows; i++) {

            int sum = 0;

            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }

            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }

   
        for (int j = 0; j < cols; j++) {

            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum = sum + arr[i][j];
            }

            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }

        sc.close();
    }
}