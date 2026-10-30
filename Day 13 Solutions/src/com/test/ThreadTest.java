package com.test;

import com.thread.MyThread;

public class ThreadTest {

	public static void main(String[] args) {

		MyThread mt1 = new MyThread("Task1");
		MyThread mt2 = new MyThread("Task2");
		MyThread mt3 = new MyThread("Task3");
		MyThread mt4 = new MyThread("Task4");

		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();

	}

}
