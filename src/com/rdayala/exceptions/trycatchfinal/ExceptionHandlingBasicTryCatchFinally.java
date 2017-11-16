package com.rdayala.exceptions.trycatchfinal;

public class ExceptionHandlingBasicTryCatchFinally {

	public static void main(String[] args) {

		// String Array containing valid and invalid numeric values
		String[] s = { "abc", "123", "xyz", "456" };

		for (int i = 0; i < s.length; i++) {
			try {
				System.out.println("Try block - this may or may not throw exception");
				// This statement may throw NumberFormatException
				int intValue = Integer.parseInt(s[i]);
				System.out.println("The parsed number : " + intValue);
			} catch (NumberFormatException ex) {
				System.out.println("Catch block - " + ex.toString());
			} finally {
				System.out.println("Finally block - This block is always executed");
			}
		}
	}

}

/*
 * Notes : When a statement throws an exception in the try block, the remaining
 * part of the try block will not be executed. Program control comes out of the
 * try block and enters directly into catch block.
 * 
 * If there is no catch block, the finally block gets executed and the program
 * controls goes to the calling method or the program terminates.
 * 
 * You can’t keep other statements in between try, catch and finally blocks.
 * 
 * ex.printStackTrace(); //This prints stack trace of exception
 * 
 */