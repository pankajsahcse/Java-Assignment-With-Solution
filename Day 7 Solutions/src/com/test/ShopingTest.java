package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.exception.EmptyOrderException;
import com.exception.InsufficientBalanceException;
import com.exception.InvaliProductException;
import com.exception.InvalidQuantityException;
import com.exception.OutofStockException;
import com.model.Product;
import com.service.Customer;
import com.service.ShopingCart;

public class ShopingTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Products
		Product[] products = { new Product(101, "Laptop", 50000, 5),
				new Product(102, "Mobile", 20000, 10),
				new Product(103, "Headphones", 2000, 3), 
				new Product(104, "Keyboard", 1500, 7) };

		Customer c = new Customer("Pankaj", 10000);

		ShopingCart cart = new ShopingCart();

		try {
			System.out.println("----- Our Available Products -----");

			for (Product product : products) {
				System.out.println(
						product.getId() + " | " +
				        product.getName() + 	" | RS - " + 
						product.getPrice() + " | Stock - " +
						product.getStock()
				);
			}

			System.out.print("Enter Product ID: ");
			int productId = sc.nextInt();

			Product selectedProduct = null;

			// Product ID search
			for (Product p : products) {
				if (p.getId() == productId) {
					selectedProduct = p;
					break;
				}
			}

			// Validate product ID
			if (selectedProduct == null) {
				throw new InvaliProductException("Invalid Product Id");
			}

			System.out.print("Enter Quantity: ");
			int quantity = sc.nextInt();

			cart.addProduct(selectedProduct, quantity);

			// Show cart
			cart.showCart();

			// Place order
			double total = cart.calculateTotal();

			System.out.println("Total Amount: -" + total);

			int balance = (int) c.getBalance();
			System.out.println("Customer Balance: -" + balance);

			// Payment
			c.makePayment(total);

			System.out.println("Order placed successfully!");

		} catch (InvaliProductException e) {
			System.out.println("Error: " + e.getMessage());

		}

		catch (InvalidQuantityException e) {
			System.out.println("Error: " + e.getMessage());

		}

		catch (OutofStockException e) {
			System.out.println("Error: " + e.getMessage());

		} catch (EmptyOrderException e) {
			System.out.println("Error: " + e.getMessage());

		}

		catch (InsufficientBalanceException e) {
			System.out.println("Error: " + e.getMessage());

		}

		catch (InputMismatchException e) {
			System.out.println("Error: Please enter numeric values only.");
		} finally {
			sc.close();
		}

	}

}
