package com.test;

import com.thread.MyRunnable;

public class RunableTest {

	public static void main(String[] args) {
		;
		MyRunnable mr1 = new MyRunnable("Run 2");
		MyRunnable mr2 = new MyRunnable("Run 3");
		MyRunnable mr3 = new MyRunnable("Run 4");

		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		Thread t3 = new Thread(mr3);

		t1.start();
		t2.start();
		t3.start();

	}

}
