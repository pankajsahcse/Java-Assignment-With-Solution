package com.custominterface.test;

import java.util.Arrays;
import java.util.List;

public class UseLambdaFunction {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 10, 4, 3, 16);

		System.out.println("Sorted Mannner");
		list.stream().sorted().forEach(System.out::println);

		System.out.println("Search Element");
		boolean result = list.stream().anyMatch(a -> a == 11);
		System.out.println(result?"Found":"NotFound");
		
		
	}
}
