package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.model.Bank;
import com.model.BankServicses;
import com.model.InsufficientBalanceException;
import com.model.InvalidAccountException;
import com.model.InvalidAmountException;

public class BankTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();

		try {

			System.out.print("\nEnter Account ID: ");
			int id = scanner.nextInt();

			BankServicses account = bank.findAccount(id);

			System.out.println("\nWelcome, ");

			System.out.println("\n1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter deposit amount: ");
				double deposit = scanner.nextDouble();

				account.deposit(deposit);
				break;

			case 2:
				System.out.print("Enter withdrawal amount: ");
				double amt = scanner.nextDouble();
				account.withdraw(amt);
				;
				break;

			case 3:
				System.out.println("Current balance: " + account.getBalance());
				break;

			default:
				throw new InvalidAmountException("Invalid operation selected.");
			}

		} catch (InputMismatchException e) {

			System.out.println("Please enter numbers only.");

		} catch (InvalidAccountException | InvalidAmountException e) {

			// Multi-catch
			System.out.println("Error: " + e.getMessage());

		} catch (InsufficientBalanceException e) {

			System.out.println("Transaction failed: " + e.getMessage());

		} finally {

			System.out.println("\nThank you for using the banking application.");
			scanner.close();
		}
	}

}