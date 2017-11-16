package com.rdayala.exceptions;

public class ExceptionHandlingTryCatch {

	public static void main(String[] args) {
		System.out.println("This statement will be executed"); 
		 
        try
        {
        	//This statement throws NumberFormatException
            Integer number = new Integer("abc");
        }
        catch (Exception e)
        {
            System.out.println("exception caught");
            // java.lang.NumberFormatException: For input string: "abc"
            System.out.println(e.toString());
        }
 
        System.out.println("Now, This statement will also be executed");
	}

}
