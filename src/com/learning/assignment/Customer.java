package com.learning.assignment;

import java.util.Scanner;

public class Customer {
	
	private String firstName;
	private String lastName;
	private int zipCode;
	
	public Customer(int zipCode){
		this.zipCode = zipCode;
	}

	public void validateZipCode(int zipCode) {
		String stringZipCode = String.valueOf(zipCode);
		int length = stringZipCode.length();
		
		switch (length)
		{
		case 1:{
			stringZipCode = "0"+ "0" +"0"+ "0" +zipCode;
			System.out.println("ZipCode ::" +stringZipCode);
			break;
		       }
		case 2:{
			stringZipCode = "0" + "0" + "0" + zipCode;
			System.out.println("ZipCode ::" +stringZipCode);
			break;
		      }
		case 3:{
			stringZipCode = "0" + "0"  + zipCode;
			System.out.println("ZipCode ::" +stringZipCode);
			break;
		       }
		case 4:{
			stringZipCode = "0"  + zipCode;
			System.out.println("ZipCode ::" +stringZipCode);
			break;
		       }
		case 5:{
			System.out.println("ZipCode ::" +stringZipCode);
			break;
		       }
		default:{
			System.out.println("ZipCode Entered is not valid!!");
		}

		
		}
	}
	
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter zipCode :: ");
		Customer cust = new Customer(in.nextInt());
		cust.validateZipCode(cust.zipCode);
	}
}
