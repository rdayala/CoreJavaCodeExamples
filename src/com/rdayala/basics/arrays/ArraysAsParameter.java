package com.rdayala.basics.arrays;

// Arrays are Passed-By-Reference. That means, When an array is passed to a method, 
// reference of an array object is passed not the copy of the object. 
// So, Any changes made to object in the method will be reflected in the actual object.

public class ArraysAsParameter {

	public static void main(String[] args) {
		
		// declaring and creating An array object of double type containing 8
		// elements

		double[] d = new double[8];

		d[2] = 10.25; // Changing the value of element at index 2

		d[5] = 15.35; // Changing the value of element at index 5
		
		System.out.println("Before calling method : values are : ");
		
		System.out.println(d[2]); // Output : 10.25

		System.out.println(d[5]); // Output : 15.35

		methodOne(d); // Passing array to methodOne()
		
		System.out.println("After calling method : values are : ");

		// Changes made to array object in the method are reflected in the
		// actual object

		System.out.println(d[2]); // Output : 25.32

		System.out.println(d[5]); // Output : 45.89
	}

	static void methodOne(double[] d) {
		d[2] = 25.32; // Changing the value of element at index 2

		d[5] = 45.89; // Changing the value of element at index 5
	}
}