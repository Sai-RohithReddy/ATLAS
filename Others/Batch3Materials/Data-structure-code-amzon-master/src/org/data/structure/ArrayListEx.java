package org.data.structure;

import java.util.ArrayList;
import java.util.Collections;
class Person
{
   private String name;
   private int age;
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	System.out.println(age);
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}
   
   
}


public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList();
		list.add(new Person("Preeti",37));
		list.add(new Person("Rajeev",34));
		list.add(new Person("Priya",39));
		list.add(new Person("Suraj",34));
		list.add(new Person("Dheeraj",17));
		list.add(new Person("Prashil",7));
		
		System.out.println("Persons list" +list);
		
		//sort peaple by their Age
		list.sort((A,B)-> {
			return A.getAge() - B.getAge();
			
		});
	
		Collections.sort(list);
		
	}

}
//Integer -> int
//Double -> double
//Long -> long
//String 
