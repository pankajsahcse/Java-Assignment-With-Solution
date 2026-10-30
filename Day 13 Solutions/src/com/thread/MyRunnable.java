package com.thread;

public class MyRunnable implements Runnable {

	String s;

	public MyRunnable(String s) {
		this.s = s;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println("Thread is running " + i + " " + s);
			
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}

	}

}
