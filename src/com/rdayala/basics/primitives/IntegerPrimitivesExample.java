package com.rdayala.basics.primitives;

public class IntegerPrimitivesExample {

	public static void main(String[] args) {
		
		int intHex = 0x0041;
		System.out.println("intHex : " + intHex);
		
		int intBinary = 0b01000001; // binary integer literal (Java 7)
		System.out.println("intBinary : " + intBinary);
		
		int intOctal = 0101;
		System.out.println("intOctal : " + intOctal);
		
		int intChar = 'A'; // hold decimal equivalent of char 'A', which is 65
		System.out.println("intChar : " + intChar);
		
		int intUnderscore = 1_23_456; // underscore is for readability (Java 7)
		System.out.println("intUnderscore :" + intUnderscore);
		
		char ra = '\u0C30';
		System.out.print(ra); // à°°
		char gha = '\u0C18'; // à°˜
		char ghu = '\u0C41'; // à±�
		System.out.print(gha);
		System.out.println(ghu); // à°°à°˜à±�
	}

}
