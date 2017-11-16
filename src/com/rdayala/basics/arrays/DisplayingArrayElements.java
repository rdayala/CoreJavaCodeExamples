package com.rdayala.basics.arrays;

import java.util.Arrays;

public class DisplayingArrayElements {

	public static void main(String[] args) {

		// array is an object in Java
		int[] myArray = new int[] { 3, 4, 5, 6, 7, 8 };
		System.out.println(myArray); // this prints memory address
		
		// to print array elements using for loop
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		// to print array elements using enhanced for loop
		for(int i : myArray){
			System.out.println(i);
		}
	
		// printing elements using Arrays util methods
		System.out.println(Arrays.toString(myArray));
	}

}
