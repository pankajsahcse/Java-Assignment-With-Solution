package com.day2;

public class StringPalindrome {

	// Check string Palindrome Method 1
	public static void checkPalindrome(String s) {
		
		String outputStr = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			outputStr += s.charAt(i);
		}

		if (outputStr.equals(s)) {
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}
	}

	// Check palindrome String method 2

	public static int isPalindrome(String s) {
		if (s.length() == 1) {
			System.out.println("Palindrome");
			return 1;
		}

		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return -1;
			}
			i++;
			j--;
		}
		return 1;
	}

	public static void main(String[] args) {

		String s = "iabbai";

		StringPalindrome.checkPalindrome(s);

		int status = StringPalindrome.isPalindrome(s);

		System.out.println(status);

	}

}
