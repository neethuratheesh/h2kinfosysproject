package com.h2klearning;

public class Loops {
	//sum of even and odd numbers starting from 1 to 20

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int evensum = 0;
		int oddsum=0;
		while (i<=20) {
			if (i%2==0) {
				//sum of even numbers
				evensum = evensum + i;
				
			}
			else
			{   //sum of odd numbers
				oddsum = oddsum + i;
			}
			i++;
			
		}
		System.out.println("Sum of even numbers :: " +evensum);
		System.out.println("Sum of odd numbers :: " +oddsum);

	}

}
