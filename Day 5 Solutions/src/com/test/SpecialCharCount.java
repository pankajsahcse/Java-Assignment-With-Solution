package com.test;

import java.util.*;

public class SpecialCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String special = "`~!@#$%^&*";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();

		char ch[] = s.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {

			if (special.indexOf(ch[i]) != -1) {
				count++;
			}
		}
		System.out.println(" Special Characte is " + count + " times");
		sc.close();
	}

}
