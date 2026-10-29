package com.custominterface.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AggregateFunction {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		// Reduce
		int ans = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum by Reduce Method " + ans);

		// count

		int c = (int) list.stream().count(); // output will be long so typeCast
		System.out.println("Count :" + c);

		Optional<Integer> min = list.stream().min(Integer::compare);

		System.out.println("Minimun is (Optional Requied) " + min);
		System.out.println("Minimun is (Optional Requied) " + min.get());

		Optional<Integer> max = list.stream().max(Integer::compare);

		System.out.println("Maxium is (Optional Requied)  " + max.get());

	}
}
