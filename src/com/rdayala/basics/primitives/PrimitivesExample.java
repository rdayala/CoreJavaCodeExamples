package com.rdayala.basics.primitives;

// http://www.geeksforgeeks.org/data-types-in-java/
// Java program to demonstrate primitive data types in Java

public class PrimitivesExample {

	public static void main(String[] args) {

		// declaring character
        char a = 'G';
         
       // Integer data type is generally 
       // used for numeric values
       int i=89;
        
       // use byte and short if memory is a constraint 
       byte b = 4;
        
       // this will give error as number is 
       // larger than byte range
       // byte b1 = 7888888955;
        
       short s = 56;
        
       // this will give error as number is 
       // larger than short range
       // short s1 = 87878787878;
        
        
       // by default fraction value is double in java
       double d = 4.355453532;
        
       // for float use 'f' as suffix
       float f = 4.7333434f;
       
       System.out.println("char: " + a); 
       System.out.println("integer: " + i); 
       System.out.println("byte: " + b); 
       System.out.println("short: " + s); 
       System.out.println("float: " + f); 
       System.out.println("double: " + d); 
       
       // byte value wraparound
       byte bValue = 126;
       
       // byte is 8 bit value
       System.out.println(bValue);
       
       bValue++;
       System.out.println(bValue);
        
       // It overflows here because
       // byte can hold values from -128 to 127
       bValue++;
       System.out.println(bValue);
        
       // Looping back within the range
       bValue++;
       System.out.println(bValue);
	}

}
