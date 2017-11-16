package com.rdayala.exceptions.nestedtrycatch;

/* 
 * In Java, try-catch blocks can be nested. i.e one try block can contain another try-catch block. 
 * Nested try blocks are useful when different statements of try block throw different types of exceptions.
 * try blocks can be nested at any level.
 * 
 * If the exception thrown by the inner try block can not be caught by it’s catch block, 
 * then this exception is propagated to outer try blocks. 
 * Any one of the outer catch block should handle this exception otherwise program will terminate abruptly.
 * 
 */

public class ExceptionHandlingNestedTryCatch {

	public static void main(String[] args) {

		// String array containing one null object
		String[] s = { "abc", "123", null, "xyz" };

		for (int i = 0; i < s.length; i++) {
			// First Level try-catch block
			try {
				System.out.println("First Level Try block - processing data : " + s[i]);
				// This statement may throw NullPointerException
				int a = s[i].length();

				// second level try-catch block
				try {
					System.out.println("Second Level Try block - printing next data item");
					// This statement may throw ArrayIndexOutOfBoundsException
					System.out.println(s[i + 1]);

					// third level try-catch block
					try {
						System.out.println("Third Level Try block - parsing the original data item");
						// This statement may throw NumberFormatException
						a = Integer.parseInt(s[i]);
					} catch (NumberFormatException e) {
						System.out.println("NumberFormatException will be caught here");
					}
				} catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println("ArrayIndexOutOfBoundsException will be caught here");
				}
			} catch (NullPointerException ex) {
				System.out.println("NullPointerException will be caught here");
			}
		}
	}
}
