package com.rdayala.basics.variables;

public class InstanceVariablesInitializationExample {

	// instance variable declaration
	int id;

	// instance variable initialization, can't be reinitialized other than
	// through constructor or within methods.
	String name = "Raghu";
	
	// id = 200; // invalid, cannot be reinitialized
	// name = "John"; // invalid

	// constructors
	// default constructor
	public InstanceVariablesInitializationExample() {
	
	}

	// argument constructor
	// we can re-initialize instance variables here
	public InstanceVariablesInitializationExample(int id) {
		this.id = id; // re initializing instance variable
	}

	public void reinitializeInstanceVariablesMethod() {
		id = 200; // this is legal. instance variables can be re-initialized within methods
		name = "John";
	}

	@Override
	public String toString() {
		return "InstanceVariablesInitializationExample [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		InstanceVariablesInitializationExample obj1 = new InstanceVariablesInitializationExample();
		System.out.println(obj1); // InstanceVariablesInitializationExample [id=0, name=Raghu]

		obj1 = new InstanceVariablesInitializationExample(150);
		System.out.println(obj1); // InstanceVariablesInitializationExample [id=150, name=Raghu]

		obj1.reinitializeInstanceVariablesMethod();

		System.out.println(obj1); // InstanceVariablesInitializationExample [id=200, name=John]

	}

}
