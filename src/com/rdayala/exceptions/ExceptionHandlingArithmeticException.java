package com.rdayala.exceptions;

public class ExceptionHandlingArithmeticException {

	public static void main(String[] args) {

		System.out.println("This statement will be executed"); 
		 
        try
        {
        	//This statement throws ArithmaticException : / by zero
            int i = 1000/0;
        }
        catch (Exception e)
        {
            System.out.println("Exception Caught");
            // java.lang.ArithmeticException: / by zero
            System.out.println(e.toString());
        }
 
        System.out.println("Now, This statement will also be executed");
	}

}
