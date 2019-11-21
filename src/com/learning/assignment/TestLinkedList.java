package com.learning.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("A");
		linkedList.add(1,"B");
		linkedList.add(2,"C");
		//System.out.println(arrayList);
		linkedList.add(2,"D");
		//System.out.println(arrayList);
		linkedList.add(linkedList.size(),"J");
		System.out.println("LinkedList :: " +linkedList);
		String element = linkedList.get(0);
		//System.out.println(element);
		List newList = linkedList.subList(0,3);
		LinkedList<String> subList = new LinkedList<String>(newList);
		System.out.println("Second LinkedList : :" +subList);
		
		//Iteration 
		System.out.println("Iterating each Element of LinkedList");
		for(String eachElement: linkedList) {
			System.out.println(eachElement);
		}
		
		//contains
		System.out.println("Contain method Calling");
		boolean checkContents = linkedList.contains("D");
		if (checkContents) {
			System.out.println("Object Found!!");
		}
		
		//remove
		System.out.println("Removing D");
		linkedList.remove("D");
		System.out.println(linkedList);
		
		//removeAll
		System.out.println("Calling RemovalAll Method!!");
		linkedList.add(2,"D");
		System.out.println(linkedList);
		linkedList.removeAll(subList);
		System.out.println(linkedList);
		
		//retainAll
		System.out.println("Calling RetainAll Method!!");
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("D");
		linkedList.retainAll(subList);
		System.out.println(linkedList);
		
		//containsAll
		System.out.println("Calling ContainsAll Method!!");
		boolean checkElements = linkedList.containsAll(subList);
		if (checkElements){
			System.out.println("Contents Found");
		}
		
		

	}

}
