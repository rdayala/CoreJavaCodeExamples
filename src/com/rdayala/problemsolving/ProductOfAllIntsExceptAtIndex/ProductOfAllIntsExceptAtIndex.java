package com.rdayala.problemsolving.ProductOfAllIntsExceptAtIndex;

/*
 * The product of all the integers except the integer at each index can be broken down into:
 * a. the product of all the integers before each index
 * b. the product of all the integers after each index.
 * 
 */
public class ProductOfAllIntsExceptAtIndex {

	public static void main(String[] args) {

		int[] numArray = new int[]{2, 4, 3, 5};
		
		int[] outArray = getProductsOfAllIntsExceptAtIndex(numArray);
		
		for (int i : outArray) {
			System.out.println(i);
		}
	}
	
	// To find the products of all the integers except the integer at each index, 
	// we'll go through our array greedily twice. 
	// First we get the products of all the integers before each index, and 
	// then we go backwards to get the products of all the integers after each index.
	
	public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

	    if (intArray.length < 2) {
	        throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers");
	    }

	    // we make an array with the length of the input array to
	    // hold our products
	    int[] productsOfAllIntsExceptAtIndex = new int[intArray.length];

	    // for each integer, we find the product of all the integers
	    // before it, storing the total product so far each time
	    int productSoFar = 1;
	    for (int i = 0; i < intArray.length; i++) {
	        productsOfAllIntsExceptAtIndex[i] = productSoFar;
	        productSoFar *= intArray[i];
	    }

	    // for each integer, we find the product of all the integers
	    // after it. since each index in products already has the
	    // product of all the integers before it, now we're storing
	    // the total product of all other integers
	    productSoFar = 1;
	    for (int i = intArray.length - 1; i >= 0; i--) {
	        productsOfAllIntsExceptAtIndex[i] *= productSoFar;
	        productSoFar *= intArray[i];
	    }

	    return productsOfAllIntsExceptAtIndex;
	}
	
}

/*
 * Are there any edge cases we should test?
 * 
 * What if the input array contains zeroes? What if the input array only has one integer?
 * We'll be fine with zeroes.
 * 
 * But what if the input array has fewer than two integers?
 * Well, there won't be any products to return because at any index there are no “other” integers. So let's throw an exception.
 * 
 */
