package com.day1;

public class StringContainsCheck {

	public static boolean checkString(String s) {

		// Constrains
		if (s.length() > 100 && s.length() < 1) {
			System.out.println("String cannot be more than 1 to 100 words");
			return false;
		}

		String target = "hello";

		int j = 0;

		for (int i = 0; i < s.length(); i++) {
			if (target.charAt(j) == s.charAt(i)) {
				
				j++;
				// here break Because if we don't break then it will be go out of bound
				// it will run length of original string
				if (j == target.length()) {
					break;
				}
			}
		}

		if (j == target.length()) {

			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String s = "ahhelllloupiiiii";

		boolean status = StringContainsCheck.checkString(s);
		System.out.println(status ? "True" : "False");

	}

}
