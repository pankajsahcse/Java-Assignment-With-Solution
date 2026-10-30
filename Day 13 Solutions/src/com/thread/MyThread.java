package com.thread;

public class MyThread extends Thread {

	private String s;

	public MyThread(String s) {
		this.s = s;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Thread is running " + i +" " + s);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
