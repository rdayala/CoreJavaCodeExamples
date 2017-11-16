package com.rdayala.exceptions;

public class ExceptionHandlingArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		System.out.println("This statement will be executed"); 
		 
        try
        {
        	//This statement throws ArrayIndexOutOfBoundsException
            String s = args[1];
        }
        catch (Exception e)
        {
            System.out.println("Exception Caught");
            // java.lang.ArrayIndexOutOfBoundsException: 1
            System.out.println(e.toString());
        }
 
        System.out.println("Now, This statement will also be executed");
	}

}
