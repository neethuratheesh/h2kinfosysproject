package com.learning.assignment;

public class PreferredCustomer {
	private String ssnNumber;
	
	public PreferredCustomer() {
		
		System.out.println("Parent Class Constructor");
	}
	
	protected void creditCardEligible(String ssnNumber) {
		System.out.println("Preferred Customer Eligible");
	}

	public String getSsnNumber() {
		return ssnNumber;
	}

	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

}
