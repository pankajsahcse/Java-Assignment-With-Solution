package com.innerclass.demo;

public class BankAccount {
	private int accountNumber;
	private String name;
	private double balance;

	public BankAccount(int accountNumber , String name , double balance ) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		
	}
	
	class AccountDetails{
		public AccountDetails() {
			
		}
		
		public void displayDetails() {
			System.out.println("AccountNumber : " + accountNumber + "\n Name : " + name + "\n Balance :" + balance);
		}
	}
	

}
