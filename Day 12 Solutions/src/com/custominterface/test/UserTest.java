package com.custominterface.test;

import java.util.function.Function;
import java.util.function.Supplier;

public class UserTest {
	
	private String name;
	
	public UserTest() {
		this.name = "Default";
	}
	
    @Override
	public String toString() {
		return "User [name=" + name + "]";
	}

	public UserTest(String name) {
		this.name = name;
	}
    

	public static void main(String[] args) {
		
		Supplier<UserTest> u = ()-> new UserTest();
		UserTest u1 = u.get();
		
		Function<String , UserTest> u2 = (name)->(new UserTest(name));
		UserTest u3 = u2.apply("Helsinki");
		
		System.out.println(u1);
		System.out.println(u3);
		
	}

}
