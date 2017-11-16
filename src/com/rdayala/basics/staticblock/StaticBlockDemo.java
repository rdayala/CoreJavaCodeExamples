package com.rdayala.basics.staticblock;

// static blocks are executed even before main method
// static blocks are executed in the order they are seen
// static methods can be called from static block
public class StaticBlockDemo {
	
	static {
		System.out.println("Static block1");
	}

	public static void main(String[] args) {

		// there is no executable code in main method
		System.out.println("main method");
	}	
	
	static {
		System.out.println("Static block2");
		StaticBlockDemo.method();
	}
	
	public static void method(){
		System.out.println("static method");
	}

}

// Static block is executed only once when the class is loaded by the JVM.

// Static block is where you can do or have some initialization code
// like database connection or http connection to a webservice, etc.
