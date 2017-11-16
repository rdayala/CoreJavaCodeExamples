package com.rdayala.exceptions.trycatchfinal;

public class ExceptionHandlingCatchMultipleExceptions {

	public static void main(String[] args) {

		//String array containing one null object and only 4 elements in it.
		String[] s = {"abc", "123", null, "xyz"};
		 
        for (int i = 0; i < 6; i++)
        {
            try
            {
            	//This statement may throw NumberFormatException, 
            	// NullPointerException and ArrayIndexOutOfBoundsException
                int a = s[i].length() + Integer.parseInt(s[i]); 
            }
 
            catch(NumberFormatException ex)
            {
                System.out.println("Catch block - " + ex.toString());
            }
 
            catch (ArrayIndexOutOfBoundsException ex)
            {
            	System.out.println("Catch block - " + ex.toString());
            }
 
            catch (NullPointerException ex)
            {
            	System.out.println("Catch block - " + ex.toString());
            }
 
            System.out.println("Rest of Try block..");
        }
	}
}
