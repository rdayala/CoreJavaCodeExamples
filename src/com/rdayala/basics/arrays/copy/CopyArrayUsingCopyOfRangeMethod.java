package com.rdayala.basics.arrays.copy;

import java.util.Arrays;

// from - the initial index of the range to be copied, inclusive
// to - the final index of the range to be copied, exclusive.

public class CopyArrayUsingCopyOfRangeMethod {

	public static void main(String[] args) {

		int[] array = {23, 43, 55, 12, 65, 88, 92};
		 
		int[] copiedArray = Arrays.copyOfRange(array, 1, 4);
		
		System.out.println(Arrays.toString(copiedArray)); // [43, 55, 12]
	}
}
