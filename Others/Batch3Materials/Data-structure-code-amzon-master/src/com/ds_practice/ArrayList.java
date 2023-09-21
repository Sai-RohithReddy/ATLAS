package com.ds_practice;

import java.util.*;
import java.util.List;

//Array-> static (it cant be modified)
// int arr[10] = {} , more than 10 elements, Exception ArrayOutOfIndex
// arr[10] -> 0 to 9
// Account, Marketing, 2 persons Training, 1 = 16 = 13
// String Polymath[5] = {}
//2024 -> 2 more clients added -> 10 more batches are starting 
// HR-> trainers recruitment 
// 10 Trainer 
// 3 trainers 

// App -> pubG
// 100 ppl -> installed 
// Server -> 1 server 
// 1 month -> 1000
// 2 more server 
// rent the small shop to stack the server
// 2000,3000,4000 -> 10 servers
//Atul -> PubD (additional features + less memory)
// 1000 -> review 


//Food Delivery App
//list 
// Food list -> added to cart -> list
// Burger -> 1000 
//search -> pizza  -> 700
//Order the pizza -> cart list -. data has been removed


class Employee
{
   int id;
   String name ;
   int salary;
}

public class ArrayList {
	public static void main(String[] args) {
		
		 List<Integer> companyEmp =new ArrayList<>();
		 companyEmp.add(101);
		  
		 
		 List<String> Empname =new ArrayList<>();
		 Empname.add(101);
		 
		 
		 List<Integer> Empsalary =new ArrayList<>();
		 Empsalary.add(101);
		 
		 List<Employee> emp = new ArrayList<>();
		 emp.add(new Employee(101,"Atul",2356325));
	}

	 
	  
	  
	  
	  
}
