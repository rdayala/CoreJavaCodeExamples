package com.rdayala.multithreading;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());

		Thread t1 = new Thread(new MyTask());
		Thread t2 = new Thread(new MyTask());

		t1.setName("Thread1");
		t2.setName("Thread2");

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();

		System.out.println("Inside main ... ");
	}
}

class MyTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}