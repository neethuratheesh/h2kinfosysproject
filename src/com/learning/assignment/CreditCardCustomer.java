package com.learning.assignment;

public class CreditCardCustomer extends PreferredCustomer {
	
	public CreditCardCustomer() {
		
		System.out.println("Child Class Constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void creditCardEligible(String ssnNumber) {
		// TODO Auto-generated method stub
		System.out.println("CreditCard Customer Eligible");
	}

}
