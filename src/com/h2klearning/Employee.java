package com.h2klearning;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String empId;
	private static String compName = "H2kInfosys Inc";

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating first Employee
		Employee emp1 = new Employee();
		emp1.firstName="Neethu";
		emp1.lastName="Ratheesh";
		emp1.empId="12108";
		
		//Creating second Enployee
		Employee emp2 = new Employee();
		emp2.firstName="Neethu";
		emp2.lastName="Ratheesh";
		emp2.empId="12108";
		
		
			
		//Comparing two employees
		if (emp1.firstName.equals(emp2.firstName) && emp1.lastName.equals(emp2.lastName) && emp1.empId.equals(emp2.empId)  ) {
			System.out.println("Employees are same");
		}
		else
		{
			System.out.println("Employees are different");
		}

	}
	}
	
	