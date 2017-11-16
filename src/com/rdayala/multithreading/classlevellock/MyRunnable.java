package com.rdayala.multithreading.classlevellock;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		display();
	}

	public static synchronized void display() {
		System.out.println(Thread.currentThread().getName() + " is acquired class lock in display() method.");
		for (int i = 1; i <= 2; i++) {
			System.out.println(Thread.currentThread().getName() + " is executing. Value of i=" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " is completed in display() method.");
	}
}