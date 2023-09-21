package com.ds_practice;
// Hashing function,colission
// Internal LinkedList is set up inside the hash table 
// 5 index -> mango -> apple
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        // Creating a map using the HashMap
        Map<String, Integer> numbers = new TreeMap<>();

        // Insert elements to the map
        
        numbers.put("One", 1);
        numbers.put("Eleven", 11);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);
        
        System.out.println("Map: " + numbers);
    
     // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());
    }
}
