package com.day3;

public class WordReverse {

	public static void reverseWord(String s) {
		String[] words = s.split("\\.+");

		StringBuffer sf = new StringBuffer();

		for (int i = words.length - 1; i >= 0; i--) {

			// To check our word is empty or not , if empty then Move i++
			if (words[i].isEmpty()) {
				continue;
			}

			if (sf.length() > 0) {
				sf.append(".");
			}

			sf.append(words[i]);

		}

		System.out.println(sf);
	}

	public static void main(String[] args) {

		String s = "i.like.this.program...very.much";

		WordReverse.reverseWord(s);

		String s1 = "..geeks.....for.geeks.";
		WordReverse.reverseWord(s1);

	}

}
