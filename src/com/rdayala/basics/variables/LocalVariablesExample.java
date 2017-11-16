package com.rdayala.basics.variables;

public class LocalVariablesExample {
	
	public int add(int a, int b){
		// this is local variable
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {
		LocalVariablesExample obj = new LocalVariablesExample();
		int result = obj.add(2,  3);
		System.out.println(result);
	}
}
