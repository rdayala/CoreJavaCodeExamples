package com.rdayala.basics.primitives;

// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
// instance variables(or called fields) - these get default values
// local variables never get default values, they must be initialized explicitly.
public class PrimitivesDemo {

	public static void main(String[] args) {

		// 32-bit signed two's complement integer
		// Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer
		// Use the Integer class to use int data type as an unsigned integer
		int myNumber = 88;
		
		// Java 8
	    int vInt = Integer.parseUnsignedInt("4294967295");
	    System.out.println(vInt); // -1
	    String sInt = Integer.toUnsignedString(vInt);
	    System.out.println(sInt); // 4294967295
		
		// The number 26, in decimal
		int decVal = 26;
		//  The number 26, in hexadecimal
		int hexVal = 0x1a;
		// The number 26, in binary
		int binVal = 0b11010;
		
		// 16-bit signed two's complement integer
		short myShort = 847;
		
		// 64-bit signed two's complement integer
		long myLong = 9797;

		// For decimal values, this data type is generally the default choice
		// 64-bit double precision
		double myDouble = 7.3243;
				
		float myFloat = 324.3f;

		// single 16-bit Unicode character
		// minimum value of '\u0000' (or 0) and a maximum value of '\uffff'
		char myChar = 'y';
		char unicodeChar = '\u00ED';
		
		// only two possible values: true and false
		boolean myBoolean = false;

		// minimum value of -128 and a maximum value of 127(inclusive)
		byte myByte = 127; // 8-bit signed two's complement integer
		
		// The String class is not technically a primitive data type, 
		// but considering the special support given to it by the language, 
		// you'll probably tend to think of it as such.
		String unicodeStr = "S\u00ED Se\u00F1or";

		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(unicodeChar);
		System.out.println(myBoolean);
		System.out.println(myByte);
		System.out.println(unicodeStr);
	}

}
