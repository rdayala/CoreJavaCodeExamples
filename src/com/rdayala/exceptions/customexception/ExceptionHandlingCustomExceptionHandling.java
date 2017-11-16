package com.rdayala.exceptions.customexception;

public class ExceptionHandlingCustomExceptionHandling {

	public static void main(String[] args) {

		StudentManager manager = new StudentManager();
		 
        try {
 
        	Student student = manager.find("0000001");
 
        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }
	}

}

class StudentManager {
	 
    public Student find(String studentID) throws StudentNotFoundException {
        if (studentID.equals("123456")) {
            return new Student();
        } else {
            throw new StudentNotFoundException(
                "Could not find student with ID " + studentID);
        }
    }
}
