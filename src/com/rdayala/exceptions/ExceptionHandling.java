package com.rdayala.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("This statement will be executed"); 
		
		//This statement throws NumberFormatException
		// java.lang.NumberFormatException: For input string: "abc"
		// not able to parse "abc" as Integer
		
        Integer number = new Integer("abc");
 
        System.out.println("This statement will not be executed");
	}

}
