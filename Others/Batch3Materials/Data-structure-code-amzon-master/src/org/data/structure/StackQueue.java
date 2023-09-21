package org.data.structure;

/* Java Program to implement a stack using
two queue */
// Collection interface 
// list in java -> collection 
//list of data structure in java 
import java.util.*;

class StackQueue {

	static class Stack {
		// Two inbuilt queues
		static Test<Integer> q1 = new LinkedList<Integer>();
		static Test<Integer> q2 = new LinkedList<Integer>();

		// To maintain current number of
		// elements
		static int curr_size;

		static void push1(int x)
		{
			// Push x first in empty q2
			q2.add(x);

			// Push all the remaining
			// elements in q1 to q2.
		while (!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
			}

			// swap the names of two queues
			Test<Integer> q = q1;
			q1 = q2;
			q2 = q;
			
				}

		static void pop1()
		{

			// if no elements are there in q1
			if (q1.isEmpty())
				return;
			q1.remove();
		}

		static int top1()
		{
			if (q1.isEmpty())
				return -1;
			return q1.peek();
		}

		static int size1() 
		{ return q1.size(); }
	}
	List-> [Kotlin c++ java python] 
		queue -> python java c++ kotlin	
	
	Kotlin
	C++
	java
	python
	
	
//Queue+stack
	// driver code
	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push1(1);
		s.push1(2);
		s.push1(3);

		System.out.println("current size: " + s.size1());
		System.out.println(s.top1());
		s.pop1();
		System.out.println(s.top1());
		s.pop1();
		System.out.println(s.top1());

		System.out.println("current size: " + s.size1());
	}
}

