package com.learning.fourth;

public class ValidateException extends Exception {

	public ValidateException() {
		// TODO Auto-generated constructor stub
		System.out.println("Custom Exception : Validate Exception");
	}

	public ValidateException(String message) {
		super(message);
		System.out.println("Custom Exception : Validate Exception");
		// TODO Auto-generated constructor stub
	}

	public ValidateException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ValidateException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ValidateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
