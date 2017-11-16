package com.rdayala.exceptions.trycatchfinal;

public class ExceptionHandlingOrderingCatchBlocks {

	public static void main(String[] args) {

		try
        {
			// This statement throws NumberFormatException
            int i = Integer.parseInt("abc");
            
            // This statement throws ArrayIndexOutOfBoundsException
            // String arg1 = args[0];            
        }
//        catch(Exception ex)
//        {
//            System.out.println("This block handles all exception types");
//        }
        catch(NumberFormatException ex)
        {
        	//Uncomment above code
            //Compile time error
            //This block becomes unreachable as
            //exception is already handled by above catch block        	
        	System.out.println("This block handles NumberFormatException");
        }
		catch(Exception ex)
        {
            System.out.println("This block handles all exception types");
            System.out.println(ex.toString());
        }
        catch (Throwable ex)
        {
            System.out.println("Throwable is super class of Exception");
        }
	}
}
