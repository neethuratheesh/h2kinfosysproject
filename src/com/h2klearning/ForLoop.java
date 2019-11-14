package com.h2klearning;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenSum = 0;
		int oddSum  = 0 ;
		//Finding sum of even numbers from 1 to 20
		for (int i=0;i<=20;i=i+2) {
			evenSum = evenSum + i;
		}
		////Finding sum of odd numbers from 1 to 20
		for (int i=1;i<=20;i=i+2) {
			oddSum = oddSum + i;
		}
		System.out.println("Sum of even numbers from 1 to 20:: " +evenSum);
		System.out.println("Sum of odd numbers from 1 to 20:: " +oddSum);
		

	}

}
