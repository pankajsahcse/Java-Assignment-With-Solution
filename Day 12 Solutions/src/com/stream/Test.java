package com.stream;

import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "bob", "Charlie", "Anna", "David", "bob", "Edward");
		int[] numbers = { 12, -5, 8, 23, -1, 0, 15, 8, 4 };

		List<String> newName = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
		System.out.println("Starts With letter A = " + newName);

		names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
		
		
		System.err.println("no of character in this string");
		names.stream().distinct().sorted().collect(Collectors.toMap(name -> name, String::length)).entrySet()
				.forEach(System.out::println);

		System.err.println("Sum of given number array");
		System.out.println(Arrays.stream(numbers).filter(n -> n > 0).sum());

	}

}
