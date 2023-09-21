package org.data.structure;


import java.util.LinkedList;
import java.util.List;

public class SearchArrayListEx {
public static void main(String[] args) {
	List<String> list = new LinkedList<>();
	list.add("Suraj");
	list.add("Dheerja");
	list.add("Neeraj");
	list.add("Rishab");
	list.add("Atul");
	list.add("Rubina");
	list.add("Nishanth");
	list.add("Zeeshan");
	list.add("Rubina");
	list.add("Subsreee");
	
	System.out.println(list.contains("Subsreee"));
	
	System.out.println(list.indexOf("Atul"));
	
	System.out.println(list.lastIndexOf("Rubina"));
	
	
	
}
}
