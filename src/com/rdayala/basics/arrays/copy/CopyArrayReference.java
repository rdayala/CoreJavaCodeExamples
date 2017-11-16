package com.rdayala.basics.arrays.copy;

public class CopyArrayReference {

	public static void main(String[] args) {

		int[] a = { 12, 21, 0, 5, 7 }; // Declaring and initializing an array of
										// ints

		int[] b = a; // copying array 'a' to array 'b'

		// Printing elements of array 'b'

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		a[2] = 56; // Changing value of 3rd element of array 'a'

		System.out.println(b[2]); // value of 3rd element of array 'b' also
									// changes

		b[4] = 100; // Changing value of 5th element of array 'b'

		System.out.println(a[4]); // value of 5th element of array 'a' also
									// changes
	}
}

/*
 * both the array variables(a and b) are pointing to same object in the memory.
 *
 * If you copy an array using above method, changes made in one array will be
 * reflected in other. Normally, you don’t want such behavior in real time. You
 * may need two different array objects with same set of elements.
 * 
 */