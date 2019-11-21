package com.learning.assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> linkedhmap = new LinkedHashMap();
		linkedhmap.put("A",0);
		linkedhmap.put("B",2);
		linkedhmap.put("C",4);
		linkedhmap.put("D",6);
		
		System.out.println("Linked Hash Map :: " +linkedhmap);
		//get()
		System.out.println("Value of B ::" +linkedhmap.get("B"));
		//remove()
		linkedhmap.remove("B",2);
		System.out.println(linkedhmap);
		//containsKey
		if (linkedhmap.containsKey("C")) {
			System.out.println("Key Exist");
		}
		//containsValue
		if (linkedhmap.containsValue(4)) {
			System.out.println("Value Exist");
		}
		//Adding null as key 
		String something = null;
		linkedhmap.put(something,8);
		System.out.println(linkedhmap);
		//keySet
		Set<String> keySet = linkedhmap.keySet();
		for (String eachKey: keySet) {
			System.out.println(eachKey);
		}
		//valueSet
		Collection<Integer> valueSet = linkedhmap.values();
		for (Integer eachValue : valueSet) {
			System.out.println(eachValue);
		}
		//size
		System.out.println(linkedhmap.size());
		

	}

}
