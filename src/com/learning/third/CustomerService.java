package com.learning.third;

public class CustomerService {
	
	public CustomerService() {
		
		
	}
	
	public void getCustomerList() {
		System.out.println("No arguments passed");
	}
	
	public void getCustomerList(String city) {
		System.out.println("Customer list based on city :: " +city);
		//return city;
	}
	
	public void getCustomerList(int zipcode) {
		System.out.println("Customer list based on zipcode :: " +zipcode);
	}
	
	public void getCustomerList(String city,int zipcode) {
		System.out.println("Customer list based on city and zipcode :: " +city +"," +zipcode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService customerservice = new CustomerService();
		customerservice.getCustomerList();
		customerservice.getCustomerList("Alpharetta");
		customerservice.getCustomerList(30005);
		customerservice.getCustomerList("Alpharetta", 30005);

	}

}
