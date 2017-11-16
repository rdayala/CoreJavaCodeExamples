package com.rdayala.basics.arrays;

import java.awt.List;
import java.util.Arrays;

public class ArrayMethodPassing {

	void changeArrayElementInMethod(int[] myArrayParameter){
		System.out.println(Arrays.toString(myArrayParameter));
		myArrayParameter[3] = 9;
	}
	
	public static void main(String[] args) {
		
		// array is an object in Java
		int[] myArray = new int[]{3, 4, 5, 6, 7, 8};
		System.out.println(Arrays.toString(myArray));
		
		ArrayMethodPassing obj = new ArrayMethodPassing();
		// passing an array to a method
		// argument and method parameter point to same memory location
		obj.changeArrayElementInMethod(myArray);
		
		// any changes done in called method are reflected in calling method
		System.out.println(myArray[3]);
		System.out.println(Arrays.toString(myArray));

	}

}
