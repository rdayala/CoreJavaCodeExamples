package com.rdayala.multithreading;

// Thread class internally implements Runnable interface
// so, we have this run() method available.
// This approach is not recommended. In Java, we can't extend from multiple classes.
public class CreateThreadWithoutRunnable extends Thread {
	
	public void run(){
		System.out.println("Inside run..");
		go();
	}

	private void go() {
		System.out.println("Inside go..");
		more();
	}
	

	private void more() {
		System.out.println("Inside more..");
	}

	public static void main(String[] args) {

		Thread thread = new CreateThreadWithoutRunnable();
		thread.start();
		System.out.println("Inside main..");
	}

}
