package com.rdayala.basics.variables;

// http://www.geeksforgeeks.org/variables-in-java/

public class StaticVariablesDemo {
	
	public static double salary;
	public static String company = "ABC";
	public static String name;

	public static void main(String[] args) {
		StaticVariablesDemo.salary = 10000;
		StaticVariablesDemo.name = "John";
		
		System.out.println("Name : " + StaticVariablesDemo.name + " works in " + StaticVariablesDemo.company);

	}

}
