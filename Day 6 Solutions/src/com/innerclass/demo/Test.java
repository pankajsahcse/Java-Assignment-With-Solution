package com.innerclass.demo;

public class Test {

	public static void main(String[] args) {
		BankAccount e = new BankAccount(01 , "Omkar" , 1000000);
		
		BankAccount.AccountDetails  ad = e.new AccountDetails();
		ad.displayDetails();
	}

}
