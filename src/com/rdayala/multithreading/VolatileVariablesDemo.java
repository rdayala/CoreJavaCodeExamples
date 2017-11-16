package com.rdayala.multithreading;

import java.util.concurrent.TimeUnit;

public class VolatileVariablesDemo {

	private static volatile boolean stop;

	public static void main(String[] args) throws InterruptedException {
		
		new Thread(new Runnable() {
			public void run() {
				while (!stop) {
					System.out.println("In while ...");
				}
				System.out.println("Thread stopped..");
			}
		}).start();

		TimeUnit.SECONDS.sleep(1);
		stop = true;
	}
}
