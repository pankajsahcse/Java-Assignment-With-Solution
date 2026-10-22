package com.test;

import java.util.Scanner;

public class Dulicatecharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();

		char s1[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (s1[i] == s1[j]) {
					System.out.println("Duplicate char is " + s1[i]);
				}
			}
		}
		sc.close();
	}

}
