package com.custominterface.test;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<String> supplier = () -> "Hello Java";

        System.out.println(supplier.get());

	}

}
