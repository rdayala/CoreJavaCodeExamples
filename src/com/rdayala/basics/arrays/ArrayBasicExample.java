package com.rdayala.basics.arrays;

public class ArrayBasicExample {

	public static void main(String[] args) {
		// simple array declaration
		int[] myArray;
		
		// creating array object, created on Heap memory
		int[] myArrayObject = new int[7]; // array elements get default value		
		System.out.println(myArrayObject[1]); // result : 0
		
		// array initialization, don't specify array size
		int[] myArrayInitialization = new int[]{9, 11, 2, 4, 4, 7};		
		System.out.println(myArrayInitialization[4]);
		
		// invalid, we should not specify array dimension while initializing
		// int[] myArrayInitialization2 = new int[7]{9, 11, 2, 4, 4, 7}; // compiler error
		
		// array initialization simple way
		int[] myArraySimpleInitilization = {9, 11, 2, 4, 4, 6};
		System.out.println(myArraySimpleInitilization[2]);
		
		int[] myArrayInitializeLater;
		myArrayInitializeLater = new int[]{2, 4, 6, 3};
		System.out.println(myArrayInitializeLater[3]);
		
		int[] myArrayDeclared;	
		// myArrayDeclared = {2, 4, 5}; // invalid, initialization should be at time of declaration
		// it should be like this : 
		// 		int[] myArrayDeclared = {2, 4, 5};
		// or it can be like this also
		// 		int[] myArrayDeclared;
		// 		myArrayDeclared = new int[]{2, 4, 5};
		
		// length is a field of array
		System.out.println("Length of array : " + myArrayInitializeLater.length);
	}

}
