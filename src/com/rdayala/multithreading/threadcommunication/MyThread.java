package com.rdayala.multithreading.threadcommunication;

public class MyThread extends Thread {
	
	int total = 0;
	@Override
	public void run() {

		System.out.println("Child thread calculating sum..");
		synchronized(this){
			for(int i = 1; i <= 5; i++) {
				total += i;
			}
			this.notify();
		}
	}
}
