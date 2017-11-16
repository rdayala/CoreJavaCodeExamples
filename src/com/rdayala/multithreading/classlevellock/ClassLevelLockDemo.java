package com.rdayala.multithreading.classlevellock;

public class ClassLevelLockDemo {

	public static void main(String[] args) {

		MyRunnable myRunnable1 = new MyRunnable();
		MyRunnable myRunnable2 = new MyRunnable();
		Thread t1 = new Thread(myRunnable1);
		Thread t2 = new Thread(myRunnable1);
		Thread t3 = new Thread(myRunnable2);
		Thread t4 = new Thread(myRunnable2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}