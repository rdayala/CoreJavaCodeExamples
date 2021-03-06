package com.rdayala.multithreading;

import java.util.concurrent.TimeUnit;

public class NamingThread {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread()); // thread getting access to its own object.
		
		Runnable task = new MyRunnable();
		Thread thread = new Thread(task); // state: NEW
		thread.setName("MyRunnable"); // giving NAME to a thread
		thread.start(); // state: RUNNABLE
		
		try {
		
			// Thread.sleep(3000); // sleep is static method of Thread class and throws checked exception, InterruptedException
			
			// For longer values, sleep method is not useful, so in Java 5, new things were added			
			TimeUnit.SECONDS.sleep(3); // alternative to Thread.sleep(3000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Inside main..");
		
		// once a thread run method is executed, thread will be in DEAD state.
		// you can't call start() method again on the thread after its run() is already executed
		// thread.start(); // this will throw exception  java.lang.IllegalThreadStateException
	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside run..");
		System.out.println(Thread.currentThread()); // get access to its own Thread object
		System.out.println("Thread name: " + Thread.currentThread().getName());
		go();
	}

	private void go() {
		System.out.println("Inside go...");
	}
}