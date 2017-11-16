package com.rdayala.basics.objects;

// this is an example of a simple class with few fields and methods
// this class will have default constructor as we haven't defined any.
class Student {
	
	// the fields have default(package) access specifier, so they can be accessed
	// within the same package.
	int id;
	String name;
	String gender;
	
	public void updateProfile(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
}

public class ClassAndObjectExample {
	
	public static void main(String[] args) {
		
		// creating an object of class Student
		// new operator, first allocates memory and creates an object in memory
		// then calls constructor to initialize the object. Here, the object is
		// initialized with default values;
		
		Student s = new Student();
		
		// the object will have default values
		System.out.println(s); // Student [id=0, name=null, gender=null]
		
		s.id = 100;
		s.name = "Joan";
		s.gender = "male";
		
		s.updateProfile("John");
		
		System.out.println(s); // Student [id=100, name=John, gender=male]
	}
}
