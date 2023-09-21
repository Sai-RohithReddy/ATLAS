package com.search;

import java.util.HashMap;
import java.util.Map;

//Remove keys from hashMap
public class RemoveKeys {
public static void main(String[] args) {
	Map<String, String > husbWifeMapping = new HashMap();
	husbWifeMapping.put("Ranveer", "Alia");
	husbWifeMapping.put("Veerat", "Anushka");
	husbWifeMapping.put("Vicky", "Katreena");
	husbWifeMapping.put("Jack", "Marie");
	
	System.out.println(husbWifeMapping);
	
	//Remove a key from HashMap
	String husband= "Jack";
	String wife = husbWifeMapping.remove(husband);
	
	System.out.println("Couple (" +husband+ "==>" +wife+ ")got divorced");
	
	System.out.println("new HashMap" +husbWifeMapping);
	
	
}
}
