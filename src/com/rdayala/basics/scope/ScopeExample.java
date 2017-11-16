package com.rdayala.basics.scope;

// http://www.geeksforgeeks.org/variable-scope-in-java/
public class ScopeExample {

	public static void main(String[] args) {

		int x;
		for (x = 0; x < 4; x++) {
			System.out.println(x);
		}
		
		System.out.println(x);

	}

}
