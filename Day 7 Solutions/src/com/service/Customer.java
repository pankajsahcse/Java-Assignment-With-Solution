package com.service;

import com.exception.InsufficientBalanceException;

public class Customer {

	private String name;
	private double balance;

	public Customer() {

	}

	public Customer(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public void makePayment(double amount) throws InsufficientBalanceException{

		if (amount <= 0)
			throw new IllegalArgumentException("Amount must be greater than zero");

		if (amount > balance)
			throw new InsufficientBalanceException("Insufficient Amount");

		if (amount > balance)
			throw new InsufficientBalanceException("Insufficient Amount");
		balance -= amount;
		System.out.println("Payment successful.");
		System.out.println("Available Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
