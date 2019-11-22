package com.learning.fourth;

public class FinancialValidationException extends Exception {

	public FinancialValidationException() {
		// TODO Auto-generated constructor stub
		System.out.println("Invalid Credit Card");
	}

	public FinancialValidationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		System.out.println("Invalid Credit Card");
	}

	public FinancialValidationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public FinancialValidationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public FinancialValidationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
