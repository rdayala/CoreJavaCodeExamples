package com.rdayala.exceptions.nestedtrycatch;

public class ExceptionHandlingPropagateExceptionToCallingMethod {

	public static void main(String[] args) {

		try {
			System.out.println("Inside main() try blcok - Calling  method");
			nestedTry();
		} 
		catch (Exception ex) {
			System.out.println("Main() Catch block - NumberFormatException will be caught here");
		}
	}

	static void nestedTry() {
		System.out.println("\tInside nestedTry() method");
		try {
			// This statement throws NumberFormatException
			System.out.println("\t\tTry block - executing code. Exception thrown");
			int i = Integer.parseInt("abc");
		} 
		catch (NullPointerException ex) {
			System.out.println("NumberFormatException will not be caught here");
		}
	}
}
