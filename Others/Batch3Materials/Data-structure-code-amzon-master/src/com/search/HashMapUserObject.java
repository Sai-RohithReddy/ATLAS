package com.search;

import java.util.HashMap;
import java.util.Map;

class Employee
{
  private int id;
  private String name;
  private String city;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
}
  
  
}
public class HashMapUserObject {
	
	public static void main(String[] args) {
		Map<Integer,Employee> empMapping = new HashMap();
		empMapping.put(1001, new Employee(1001,"Deepak","Mumbai"));
		empMapping.put(1002, new Employee(1002,"Rishabh","ABC"));
		
		System.out.println(empMapping);
	}

}
