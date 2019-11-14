package com.h2klearning;

public class Customer {
	//Instance variable
	public String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	//static variable
	private static String retailer = "Best Buy Inc";
	
	public Customer() {
		System.out.println("Default Constructor");
	}
	
	public Customer(String address,String phoneNumber) {
		//this();
		this.address = address;
		this.phoneNumber = phoneNumber;
		System.out.println("Constructor with arguments");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//local variables
		String firstName = "Ratheesh";
		String retailer = "Walmart Inc";
		
		Customer firstCustomer = new Customer("12108 Summerwood Lane", "6468527470");
		firstCustomer.firstName = "Neil";
		firstCustomer.lastName = "Armstrong";
		//firstCustomer.address = "3255 Sugar Hill Pkway";
		//firstCustomer.phoneNumber = "9496130510";
		
		System.out.println(firstCustomer.firstName);
		System.out.println(firstCustomer.lastName);
		System.out.println(firstCustomer.address);
		System.out.println(firstCustomer.phoneNumber);
		System.out.println(Customer.retailer);
		
		Customer secondCustomer = new Customer();
		secondCustomer.firstName = "Neethu";
		secondCustomer.lastName = "Ratheesh";
		secondCustomer.address = "12108 Summerwood Lane";
		secondCustomer.phoneNumber = "6468527470";
		System.out.println(secondCustomer.firstName);
		System.out.println(secondCustomer.lastName);
		System.out.println(secondCustomer.address);
		System.out.println(secondCustomer.phoneNumber);
		System.out.println(secondCustomer.retailer);
		System.out.println(retailer);
		Customer thirdCustomer = new Customer();
		System.out.println(firstName);
		
		

	}

}
