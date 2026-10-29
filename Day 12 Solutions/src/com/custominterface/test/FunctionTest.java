package com.custominterface.test;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {

		Function<Integer, Integer> fi = (a) -> (a / 2);

		Integer ans = fi.apply(4);
		System.out.println("Ans :" + ans);

	}

}
