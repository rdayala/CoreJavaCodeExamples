package com.rdayala.exceptions.returnvaluefromtrycatchfinally;

/* 
 * If method returns a value and also has try, catch and finally blocks in it, then following two rules need to follow.
 * 		1) If finally block returns a value then try and catch blocks may or may not return a value.
 * 		2) If finally block does not return a value then both try and catch blocks must return a value.
 * 
 * finally block overrides any return values from try and catch blocks.
 * 
 * finally block will be always executed even though try and catch blocks are returning the control.
 * 
 */

public class ExceptionHandlingReturnValueFromMethod {

	public static void main(String[] args) {
		System.out.println(methodReturningValue()); // Output : 50
		System.out.println(methodReturningValueFromTryCatch()); // Output : 10
		System.out.println(methodReturningStringValue()); // Output : return value from try block
	}

	static int methodReturningValue() {
		try {
			return 10;
		} catch (Exception e) {
			return 20;
		} finally {
			// finally block overrides any return values from try and catch blocks.
			// This method returns 50 not 10 or 20
			return 50;
		}
	}
	
	static int methodReturningValueFromTryCatch()
    {
        try
        {
            return 10;    //control will not be passed to main() method here
        }
        catch (Exception e)
        {
            return 20;    //Control will not be passed to main() method here
        }
        finally
        {
            System.out.println("finally block is always executed");
 
            //Control will be passed to main() method after executing this block
        }
    }
	
	static String methodReturningStringValue()
    {
        String s = null;
        try
        {
            s = "return value from try block";
            return s; // though it got updated in finally block, finally is not returning any value. so returns value from try back.
        }
        catch (Exception e)
        {
            s = "return value from catch block";
            return s;
        }
        finally
        {
            s = "return value from finally block";
        }
    }
}
