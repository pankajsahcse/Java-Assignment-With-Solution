package com.thread;

public class MultipleThread {

	public static void main(String[] args) {

		Thread t1 = new Thread() {

			public void run() {
				System.out.println("Running");
			}

		};

		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				System.out.println("Second Thread Running by Annonyms Class");
			}
		};
		t2.start();

	}

}
