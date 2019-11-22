package com.learning.fourth;

public class Walgreens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Walgreens wgreens = new Walgreens();
		try {
			wgreens.validCustomerAge(12);
		} catch (ValidateException e) {
			// TODO Auto-generated catch block
			System.out.println("Age Not accepted");
		}
		//Handling checkCustomerCreditCard Exception
		try {
			wgreens.checkCustomerCreditCard("010023564267865");
		} catch (FinancialValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void validCustomerAge(int age) throws ValidateException {
		if (age>=21) {
			System.out.println("Customer walks out");
		}
		else {
			ValidateException e = new ValidateException("Customer Age is Inappropriate");
			throw e;
		}
			
	}
	//Checking Credit Card is Valid
	public void checkCustomerCreditCard(String creditCardDetail) throws FinancialValidationException {
		int length = creditCardDetail.length();
		if (length==16) {
			System.out.println("Valid Credit Card");
		}
		else if ((length==15) && (creditCardDetail.startsWith("1100"))){
			System.out.println("Customer id having Amex Credit Card");
		}
		else {
			FinancialValidationException fex = new FinancialValidationException("Credit Card is Inavlid");
			throw fex;
		}
			
	}

}
