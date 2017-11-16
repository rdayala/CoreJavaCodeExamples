package com.rdayala.exceptions.trycatchfinal;

//Java 7 way. Multiple exceptions thrown by the try block 
// can be handled by a single catch block using pipe (|) operator.

public class ExceptionHandlingCatchMultipleExceptionsJava7way {

	public static void main(String[] args) {

		//String array containing one null object and has 4 elements in it.
		String[] s = {"abc", "123", null, "xyz"};
		 
        for (int i = 0; i < 6; i++)
        {
            try
            {
            	System.out.println("Try block - executing code");
            	//This statement may throw NumberFormatException, 
            	// NullPointerException and ArrayIndexOutOfBoundsException
                int a = s[i].length() + Integer.parseInt(s[i]);       
            }            
            catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Catch block - " + ex.toString());
            }            
//            catch(Exception ex)
//            {
//            	System.out.println("Catch block - " + ex.toString());
//            }
            
            System.out.println("Rest of try block..");
        }
	}
}

/* 
 * java.lang.Exception is super class of all types of exception. 
 * It handles all types of exceptions. In the above example, 
 * all catch blocks can be replaced by one catch block which handles 
 * all types of exceptions. This type of exception handling comes very handy 
 * when you are not sure about the types of exceptions your code may throw.
 * [Check commented code above]
 * 
 */

