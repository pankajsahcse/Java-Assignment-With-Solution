package com.custominterface.test;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<Integer> consumer = (ans) -> {
			System.out.println("Addition " + (10 + ans));

		};
		consumer.accept(12);
	}
}
