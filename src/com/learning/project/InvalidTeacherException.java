package com.learning.project;

public class InvalidTeacherException extends Exception{

	public InvalidTeacherException() {
		System.out.println("Teacher Invalid!!");
	}
	
	
	public  InvalidTeacherException(String message){
		super(message);
		System.out.println("Teacher Invalid :");
	}
	

}
