package com.service;

import java.util.ArrayList;
import com.exception.*;
import com.model.Product;

public class ShopingCart {

	ArrayList<Product> cart = new ArrayList<Product>();

	Product p;

	// Product Adding
	public void addProduct(Product product, int quantity) throws InvalidQuantityException, OutofStockException {
		int stock = product.getStock();
		if (quantity <= 0) {
			throw new InvalidQuantityException("Quantity must be greater than zero.");
		}

		if (product.getStock() < quantity) {
			throw new OutofStockException("Product is out of Stock");
		}
		stock -= quantity;

//		  Quantity ke saath product store karne ke liye

		Product cartProduct = new Product(product.getId(), product.getName(), product.getPrice(),  quantity);

		cart.add(cartProduct);
		System.out.println("Product added to cart successfully.");
	}

	// Calculating total price
	public double calculateTotal() throws EmptyOrderException {

		if (cart.isEmpty()) {
			throw new EmptyOrderException("\"Cannot place an empty order.\"");
		}

		double total = 0;

		for (Product product : cart) {
			 total += product.getPrice() * product.getStock();
		}

		return total;
	}

	// show cart

	public void showCart() {
		if (cart.isEmpty()) {
			System.out.println("Cart is empty.");
			return;
		}
		for (Product product : cart) {
			System.out.println(product.getId() + " | " + product.getName() + " | Quantity: " + product.getStock()
					+ " | Price: " + product.getPrice());
		}
	}

}
