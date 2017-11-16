package com.rdayala.exceptions;

public class ExceptionHandlingNullPointerException {

	public static void main(String[] args) {

		System.out.println("This statement will be executed"); 
		 
        String s = null;
 
        try
        {
        	//This statement throws NullPointerException
            System.out.println(s.length());
        }
        catch (Exception e)
        {
            System.out.println("Exception Caught");
            // java.lang.NullPointerException
            System.out.println(e.toString());
        }
 
        System.out.println("Now, This statement will also be executed");
	}

}
