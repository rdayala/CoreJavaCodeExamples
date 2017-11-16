package com.rdayala.basics.arrays.copy;

/*
 * The difference is that Arrays.copyOf does not only copy elements, it also creates a new array. 
 * System.arrayCopy copies into an existing array.
 * 
 * If we read the source code of Arrays.copyOf(), we can see that it uses System.arraycopy().
 * 
 */

public class CopyArrayUsingSystemClass {

	public static void main(String[] args) {

		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
		 
        //Creating an array object of same length as array 'a'
 
        int[] b = new int[a.length];
 
        //creating a copy of array 'a' using arraycopy() method of System class
 
        System.arraycopy(a, 0, b, 0, a.length);
 
        //Printing elements of array 'b'
 
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
 
        //Now changing values of one array will not reflect in other array
 
        a[2] = 56;       //Changing value of 3rd element in array 'a'
 
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
 
        b[4] = 100;     //Changing value of 5th element in array 'b'
 
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
	}

}
