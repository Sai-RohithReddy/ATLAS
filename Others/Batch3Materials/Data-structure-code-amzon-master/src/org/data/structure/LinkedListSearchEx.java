package org.data.structure;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSearchEx {

	public static void main(String[] args) {
		List<String> langauage1 = new LinkedList<String>();
		langauage1.add("C++");
		langauage1.add("Python");
		langauage1.add("C");
		langauage1.add("C Sharp");
		langauage1.add("java");
		langauage1.add("OOPs");
		
		System.out.println(langauage1);
       String element =langauage1.removeAll("C");
	}

}
