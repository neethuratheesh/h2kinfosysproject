package com.learning.assignment;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList and its methods
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add(1,"B");
		arrayList.add(2,"C");
		//System.out.println(arrayList);
		arrayList.add(2,"D");
		//System.out.println(arrayList);
		arrayList.add(arrayList.size(),"J");
		System.out.println("ArrayList :: " +arrayList);
		String element = arrayList.get(0);
		//System.out.println(element);
		List newList = arrayList.subList(0,3);
		ArrayList<String> subList = new ArrayList<String>(newList);
		System.out.println("Second ArrayList : :" +subList);
		
		//Iteration 
		System.out.println("Iterating each Element of ArrayList");
		for(String eachElement: arrayList) {
			System.out.println(eachElement);
		}
		
		//contains
		System.out.println("Contain method Calling");
		boolean checkContents = arrayList.contains("D");
		if (checkContents) {
			System.out.println("Object Found!!");
		}
		
		//remove
		System.out.println("Removing D");
		arrayList.remove("D");
		System.out.println(arrayList);
		
		//removeAll
		System.out.println("Calling RemovalAll Method!!");
		arrayList.add(2,"D");
		System.out.println(arrayList);
		arrayList.removeAll(subList);
		System.out.println(arrayList);
		
		//retainAll
		System.out.println("Calling RetainAll Method!!");
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.retainAll(subList);
		System.out.println(arrayList);
		
		//containsAll
		System.out.println("Calling ContainsAll Method!!");
		boolean checkElements = arrayList.containsAll(subList);
		if (checkElements){
			System.out.println("Contents Found");
		}
		
		
 
	}

}
