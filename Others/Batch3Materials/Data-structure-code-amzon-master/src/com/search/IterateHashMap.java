package com.search;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
public static void main(String[] args) {
	Map<String, Double> employeeSalary = new HashMap();
	employeeSalary.put("Preeti",4079977.90);
	employeeSalary.put("Siddhartha",4279977.90);
	employeeSalary.put("Rishabh",4479977.90);
	employeeSalary.put("Atul",4679977.90);
	//String a[] = {"PREETI","Deepak"};
	// for(int i:a)
	System.out.println(employeeSalary);
	employeeSalary.forEach((String employee, Double salary)-> {
		System.out.println(employee + "==>" +salary);
	})
	;
	
	
}
}
