package com.thread;

public class MultiThreadUsingLembda {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 4; i++) {
				System.out.println("Thread 1 Running " + i);
			}
		});
		t1.start();

		Thread t2 = new Thread(() -> { // 
			for (int i = 0; i <= 3; i++) {
				System.err.println("Thread 2 running " + i);
			}
		});
		t2.start();
	}

}
