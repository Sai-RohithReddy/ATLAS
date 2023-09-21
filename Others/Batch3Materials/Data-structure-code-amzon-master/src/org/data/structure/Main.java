package org.data.structure;

import java.util.Stack;

class Main {
	  public static void main(String[] args) {

	    // create an object of Stack class
	    Stack<String> animals= new Stack<>();

	    boolean result = animals.isEmpty();
	    System.out.println(result);
	    // push elements to top of stack
	    animals.push("Dog");
	    animals.push("Horse");
	    animals.push("Cat");
	    System.out.println("Stack: " + animals);
	    
	    boolean result1 = animals.empty();
	    System.out.println(result1);

	    // pop element from top of stack
	    animals.pop();
	    System.out.println("Stack after pop: " + animals);
	    }
	}