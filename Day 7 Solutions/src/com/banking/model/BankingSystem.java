package com.banking.model;

//Develop a Java program for an Online Banking System that allows users to 
//withdraw and transfer money. 
//The program should handle the following exceptions: 
// Attempting to withdraw an amount greater than the available balance. 
// Entering a negative or zero amount. 
// Entering an invalid account number. 
// Attempting to transfer money when the account has insufficient funds. 
//Create and use custom exceptions where appropriate. 
public class BankingSystem {

	private double balance = 10000;
	private double limitBal = 1000;
	private double userAmt;
	private int accountNo = 1234;

	public BankingSystem() {
		// TODO Auto-generated constructor stub
	}

	public BankingSystem(double userAmt) {
		this.userAmt = userAmt;
	}

	public BankingSystem(double balance, double limitBal, double userAmt, int accountNo) {
		super();
		this.balance = balance;
		this.limitBal = limitBal;
		this.userAmt = userAmt;
		this.accountNo = accountNo;
	}

	public void withdrow() {
		try {

			if (userAmt > balance || userAmt < 0) {
				throw new Exception();
			}

			if (balance - userAmt >= limitBal) {
				balance -= userAmt;
				System.out.println("Successfullly Withdrow");
			}
		} catch (Exception e) {
			System.out.println("Balance Insufficient ");
		}

	}

	public void displayBalance() {

		System.out.println("Your Balance is " + balance);
	}

	public void transferMoney(int trAmt) {
		try {
			if (trAmt > balance) {
				throw new Exception();
			}
			if (balance - trAmt >= limitBal) {
				balance -= trAmt;
				System.out.println("Successfullly Transfer");
			}

		} catch (Exception e) {
			System.out.println("Enter Valid Amount ");
			displayBalance();
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLimitBal() {
		return limitBal;
	}

	public void setLimitBal(double limitBal) {
		this.limitBal = limitBal;
	}

	public double getUserAmt() {
		return userAmt;
	}

	public void setUserAmt(double userAmt) {
		this.userAmt = userAmt;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	

}
