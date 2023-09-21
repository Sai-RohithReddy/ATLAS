package com.queue.ds;

import java.util.ArrayList;
import java.util.List;

class Emp
{
    String name;
    int salary;
	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
//	@Override
//	public String toString() {
//		return "Emp [name=" + name + ", salary=" + salary + "]";
//	}
    
    
}
public class Employee {
	public static void main(String[] args) {
		
		List<Emp> emp = new ArrayList();
		emp.add(new Emp("Deepak",20000));
		emp.add(new Emp("Sachin",20000));
		//it is assigning the hash to our values 
		//
		System.out.println(emp);
	}
	

}
