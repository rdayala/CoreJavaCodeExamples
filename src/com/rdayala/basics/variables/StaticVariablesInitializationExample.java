package com.rdayala.basics.variables;

public class StaticVariablesInitializationExample {
	
	// declaration of static variable, gets default value
	static int count;
	
	static int id;
	
	static int initializeInMethod;
	
	// static variable can be initialized within static block
	static {
		id =25;
	}
	
	// id = 100; // invalid, reinitialize directly within class is not allowed
	
	private static void initializeStaticVariableMethod() {
		initializeInMethod = 26;
	}
	
	public static void main(String[] args){
	
		System.out.println(StaticVariablesInitializationExample.count);
		System.out.println(StaticVariablesInitializationExample.id);
		StaticVariablesInitializationExample.initializeStaticVariableMethod();
		System.out.println(StaticVariablesInitializationExample.initializeInMethod);
		
		
	}

}
