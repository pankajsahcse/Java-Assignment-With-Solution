package com.banking.test;

import java.util.Scanner;

import com.banking.model.BankingSystem;

public class BankingSystemTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BankingSystem bs = new BankingSystem();

		System.out.println("Enter Your Account Number :");
		int acNo = sc.nextInt();

		try {
			if (bs.getAccountNo() != acNo) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Enter Valid Account Number");
			return;
		}
		System.out.println("What do you want \n1. Display Balance " + "\n2. Withdrow \n3. Transfer");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			bs.displayBalance();
			break;
		}
		case 2: {
			System.out.println("Enter Withdrow Amount :");
			int amt = sc.nextInt();

			bs = new BankingSystem(amt);
			bs.withdrow();
			bs.displayBalance();
			break;
		}
		case 3: {
			System.out.println("Enter Transfer Amount :");
			int tramt = sc.nextInt();

			bs.transferMoney(tramt);
			bs.displayBalance();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

}
