package com.model;

public class BankServicses {

	private int id;
	private String name;
	private double balance;

	public BankServicses(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) throws InvalidAmountException {

		if (amount <= 0) {
			throw new InvalidAmountException("Deposit amount must be greater than 0");
		}

		balance += amount;

		System.out.println("Amount deposited: " + amount);
		System.out.println("New balance: " + balance);
	}

	public void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException {

		if (amount <= 0) {
			throw new InvalidAmountException("Withdrawal amount must be greater than 0");
		}

		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance. Current balance: " + balance);
		}

		balance -= amount;

		System.out.println("Amount withdrawn: " + amount);
		System.out.println("New balance: " + balance);
	}

}