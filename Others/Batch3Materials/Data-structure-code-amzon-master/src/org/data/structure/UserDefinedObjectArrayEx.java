package org.data.structure;

import java.util.ArrayList;

class Employee
{
   int age;
   String name;
public Employee(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Employee [age=" + age + ", name=" + name + "]";
}
   
  // Employee emp = new Employee(); 
}
public class UserDefinedObjectArrayEx {
public static void main(String[] args) {
	
	ArrayList<Employee> employee = new ArrayList<>();
	 employee.add(new Employee(20,"Suraj"));
	 System.out.println(employee);
}
	 
	 
}
