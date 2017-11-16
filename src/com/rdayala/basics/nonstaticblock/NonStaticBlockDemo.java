package com.rdayala.basics.nonstaticblock;

// non static blocks are executed in the order they are seen
// non static blocks get executed every time we try to create an object, where as static block is executed only once when JVM loads the class.
// when we are creating an object, before constructor gets called, non static blocks get executed.

public class NonStaticBlockDemo {
	
	NonStaticBlockDemo(){
		System.out.println("constructor");
	}
	
	{
		System.out.println("non static block 1");
	}

	public static void main(String[] args) {

		System.out.println("main  method");
		
		NonStaticBlockDemo obj1 = new NonStaticBlockDemo();
		NonStaticBlockDemo obj2 = new NonStaticBlockDemo();
	}

	{
		System.out.println("non static block 2");
	}
}

/* OUTPUT
main  method
non static block 1
non static block 2
constructor
non static block 1
non static block 2
constructor
*/