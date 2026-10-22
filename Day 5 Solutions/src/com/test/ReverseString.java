package com.test;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();

		StringBuffer sb = new StringBuffer();
		for (int i = (s.length() - 1); i >= 0; i--) {

			sb.append(s.charAt(i));
		}

		System.out.println(sb);
sc.close();
	}
}
