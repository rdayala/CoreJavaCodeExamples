package com.rdayala.basics.loops;

public class WhileDemo {

	public static void main(String[] args) {

		int value = 0;

		while (value < 10) {
			System.out.println("Hello " + value);

			value = value + 1;
		}
		
		int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
	}

}
