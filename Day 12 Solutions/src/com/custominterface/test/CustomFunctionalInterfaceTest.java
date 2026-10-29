package com.custominterface.test;

import com.custominterface.CustomFunctionalInterface;

public class CustomFunctionalInterfaceTest {

	public static void main(String[] args) {

		CustomFunctionalInterface cfi = (msg) -> {
			System.out.println("Custom  Functional" + msg);
		};
		cfi.customMethod(" -> Interface is running with lembda function");
	}

}
