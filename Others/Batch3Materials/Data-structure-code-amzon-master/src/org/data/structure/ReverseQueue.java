package org.data.structure;

//Java implementation of the above approach
import java.util.*;
class ReverseQueue
{

//Function to return the reversed queue
static Queue<Integer> reverse(Queue<Integer> q)
{
	// Size of queue
	int s = q.size();

	// Second queue
	Queue<Integer> ans = new LinkedList<>();

	for (int i = 0; i < s; i++)
	{

		// Get the last element to the
		// front of queue
		for (int j = 0; j < q.size() - 1; j++)
		{
			int x = q.peek();
			q.remove();
			q.add(x);
		}

		// Get the last element and
		// add it to the new queue
		ans.add(q.peek());
		q.remove();
	}
	return ans;
}

//Driver Code
public static void main(String[] args)
{
	Queue<Integer> q = new LinkedList<>();

	// Insert elements
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	q.add(5);

	q = reverse(q);

	// Print the queue
	while (!q.isEmpty())
	{
		System.out.print(q.peek() + " ");
		q.remove();
	}
	}
}


