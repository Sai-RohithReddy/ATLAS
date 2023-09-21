package com.search;

import java.util.HashMap;
import java.util.Map;

public class AccessHashMap {
  public static void main(String[] args) {
	
	  Map<String,String> userCityMapping =new HashMap();
	  //check hashmap is empty or not
	  System.out.println("userCityMapping :" +userCityMapping.isEmpty());
	  
	  userCityMapping.put("Preeti", "Mumbai");
	  System.out.println("userCityMapping :" +userCityMapping.size() + "users");
	  userCityMapping.put("Subsree", "Banglore");
	  String userName="Preeti";
	  //check if a key exists in the hashmap
	  if(userCityMapping.containsKey(userName))
	  {
		  String city = userCityMapping.get(userName);
		  System.out.println(userName+ "lives in" +city);
	  }
	  else
	  {
		  System.out.println("city not found"  +userName);
	  }
	  //check if a key exists in the hashmap
	  if(userCityMapping.containsValue("Mumbai"))
	  {
		  //String city = userCityMapping.get(userName);
		  System.out.println("There is a user who lives in Mumbai");
	  }
	  else
	  {
		  System.out.println("There is no user stays in Mumbsi");
	  }
	  //modify the value assigned to an existing key
	  userCityMapping.put(userName, "London");
	  System.out.println(userName+ "moved to a new city" +userCityMapping.get(userName)+ "new userCityMapping:" +userCityMapping);
}
}
