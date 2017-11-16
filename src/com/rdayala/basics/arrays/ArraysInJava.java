package com.rdayala.basics.arrays;

public class ArraysInJava {

	public static void main(String[] args) {

		// Declaring

		int[] arrayOfInts; // Declaring an array of ints

		char[] arrayOfChars; // Declaring an array of characters

		boolean arrayOfBooleans[];

		// **** Instantiating

		arrayOfInts = new int[10];

		// **** Initializing

		arrayOfInts[2] = 12; // Initializing 3rd element

		arrayOfInts[5] = 56; // Initializing 6th element

		
		// *** Declaring, instantiating and Initializing an array in one statement

		double[] arrayOfDoubles = new double[] { 12.56, 45.87, 14.85 };

		// This is also ok.

		int[] arrayOfInts1 = { 12, 21, 0, 5, 7 };
		
		// **** Accessing array elements
		
		System.out.println(arrayOfInts[0]);   //accessing 1st element
		 
        System.out.println(arrayOfInts[3]);
        
        
		
	}

}
