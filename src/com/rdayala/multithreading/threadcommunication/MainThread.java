package com.rdayala.multithreading.threadcommunication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		MyThread t = new MyThread();
		t.start();
		
		synchronized(t){
			System.out.println("Main thread waiting..");
			t.wait();
			System.out.println("Main thread is notified..");
			System.out.println("The sum is : " +  t.total);
		}
	}
}
