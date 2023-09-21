package com.search;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
	// create the hashmap
		Map<String,Integer> mapping = new HashMap();
	//Adding key-value pairs to hashmap
		mapping.put("One", 1);
		mapping.put("Two",2);
		mapping.put("Three", 3);
		
		System.out.println(mapping);
		
		
		mapping.putIfAbsent("Four", 4);
		mapping.putIfAbsent("Five", 4);
		System.out.println(mapping);
	}

}
