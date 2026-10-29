package com.custominterface.test;

import java.util.Arrays;
import java.util.Set;

public class CollectionAndArray {

	public static void main(String[] args) {

		Set<String> set = Set.of("Java", "Python", "C++");

		set.stream().forEach(System.out::println);

		System.out.println("************");
		Integer[] arr = { 10, 20, 30, 40, 50, 5 };

		Arrays.stream(arr).forEach(System.out::println);
	}

}
