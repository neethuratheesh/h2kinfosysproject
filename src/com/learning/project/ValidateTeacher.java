package com.learning.project;

import java.util.Scanner;

public class ValidateTeacher{
	
	public ValidateTeacher() {
		
	}
	
	public void validName(String firstName,String lastName) throws InvalidTeacherException {
		for (int i=0;i<firstName.length();i++) {
			char c =firstName.charAt(i);
			if (!Character.isLetter(c)) {
				InvalidTeacherException ex = new InvalidTeacherException("Name cannot be Alphanumeric");
				throw ex;
			}
				
		}
	
	
	for (int i=0;i<lastName.length();i++) {
		char c =lastName.charAt(i);
		if (!Character.isLetter(c)) {
			
			InvalidTeacherException ex = new InvalidTeacherException("Name cannot be Alphanumeric");
			throw ex;
		}
			
	}
}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = in.next();
		System.out.println("Enter Last Name:");
		String lastName = in.next();
		ValidateTeacher validateTeacher = new ValidateTeacher();
		try {
		validateTeacher.validName(firstName, lastName);
		}
		
			
		catch(InvalidTeacherException ex) {
			ex.printStackTrace();
			
		}
			
		

	
	
	

}
}
