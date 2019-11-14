package com.h2klearning;

public class DataBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8 primitive data types and their corresponding wrapper class in JAVA
		
		byte bytedata = 99;
		Byte byteObj = 99;
		System.out.println("ByteObj:: " +byteObj);
		System.out.println("Byte Range :: " +Byte.MIN_VALUE +" " + "And" +" "+Byte.MAX_VALUE);
		
		short shortdata = 9999;
		Short shortObj = 9999;
		System.out.println("ShortObj:: " +shortObj);
		System.out.println("Short Range :: " +Short.MIN_VALUE +" " + "And" +" "+Short.MAX_VALUE);
		
		int intdata = 999999999;
		Integer intObj = 999999999;
		System.out.println("IntegerObj:: " +intObj);
		System.out.println("Integer Range :: " +Integer.MIN_VALUE +" " + "And" +" "+Integer.MAX_VALUE);
		
		long longdata = 999999999999L;
		Long longObj = 9999999999L;
		System.out.println("LongObj:: " +longObj);
		System.out.println("Long Range :: " +Long.MIN_VALUE +" " + "And" +" "+Long.MAX_VALUE);
		
		float floatdata = 99.9f;
		Float floatObj = 99.9f;
		System.out.println("FloatObj:: " +floatObj);
		System.out.println("Float Range :: " +Float.MIN_VALUE +" " + "And" +" "+Float.MAX_VALUE);
		
		double doubledata = 9999.999999;
		Double doubleObj = 9999.9999;
		System.out.println("DoubleObj:: " +doubleObj);
		System.out.println("Double Range :: " +Double.MIN_VALUE +" " + "And" +" "+Double.MAX_VALUE);
		
		char chardata = 'C';
		Character charObj = 'D';
		System.out.println("CharacterObj:: " +charObj);
		System.out.println("Character Range :: " +(int)Character.MIN_VALUE +" " + "And" +" "+(int)Character.MAX_VALUE);
		
		boolean booleandata = true;
		Boolean booleanObj = true;
		System.out.println("BooleanObj:: " +booleanObj);
		
		//Non primitive data type
		String name = "Neethu Ratheesh";
		System.out.println("Name:: " +name);
		
		

	}

}
