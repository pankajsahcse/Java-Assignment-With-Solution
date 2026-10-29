package com.custominterface.test;

import java.util.function.Predicate;

public class PredicateFunctionalUse {

	public static void main(String[] args) {

		Predicate<String> pred = (str) -> (str.toLowerCase().startsWith("edu"));

		boolean ans = pred.test("Education");
		System.out.println(ans ? "Correct " : "Incorrect ");
	}

}
