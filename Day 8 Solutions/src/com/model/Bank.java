package com.model;

public class Bank {

	private BankServicses[] accounts;

	public Bank() {

		accounts = new BankServicses[3];

		accounts[0] = new BankServicses(101, "xyz", 5000);
		accounts[1] = new BankServicses(102, "bbbb", 3000);
		accounts[2] = new BankServicses(103, "dfds", 10000);
	}

	public BankServicses findAccount(int id) throws InvalidAccountException {

		for (BankServicses account : accounts) {

			if (account.getId() == id) {
				return account;
			}
		}

		throw new InvalidAccountException("Account with ID " + id + " does not exist.");
	}

}