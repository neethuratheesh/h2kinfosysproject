package com.h2klearning;

public class AccessModifiers {
	public String publicVariable = "Public Variable";
	private String privateVariable = "Private Variable";
	String defaultVariable = "Default Variable";
	protected String protectedVariable = "Protected Variable";
	
	public  void printfun() {
		System.out.println(publicVariable);
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers Obj = new AccessModifiers();
		Obj.printfun();
		

	}

}
