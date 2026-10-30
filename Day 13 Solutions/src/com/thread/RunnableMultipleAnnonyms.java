package com.thread;

public class RunnableMultipleAnnonyms {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 5; i++) {
					System.out.println("Thread 1 Running");
				}
			}
		});

		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread 2 Running");
				}

			}
		});

		t2.start();

	}

}
