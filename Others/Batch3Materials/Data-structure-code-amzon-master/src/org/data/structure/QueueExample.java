package org.data.structure;

import java.util.Arrays;

class Emp
{
	// global variables
		int front, rear, size;
		int capacity;
		int array[];
		public Emp(int capacity) {
			this.capacity = capacity;
			front = this.size = 0;
			rear = capacity - 1;
			array = new int[this.capacity];
		}
		boolean isFull(Emp queue)
		{
			return (queue.size == queue.capacity);
		}
		boolean isEmpty(Emp queue)
		{
			return (queue.size == 0);
		}
		void endqueue(int item)
		{
			if (isFull(this))
				return;
			this.rear = (this.rear + 1)
					% this.capacity;
			this.array[this.rear] = item;
			this.size = this.size + 1;
		}
		int dequeue()
		{
			if (isEmpty(this))
				return Integer.MIN_VALUE;

			int item = this.array[this.front];
			this.front = (this.front + 1)
						% this.capacity;
			this.size = this.size - 1;
			return item;
		}
		int front()
		{
			if (isEmpty(this))
				return Integer.MIN_VALUE;

			return this.array[this.front];
		}
		int rear()
		{
			if (isEmpty(this))
				return Integer.MIN_VALUE;

			return this.array[this.rear];
		}
		@Override
		public String toString() {
			return "Emp [front=" + front + ", rear=" + rear + ", size=" + size + ", capacity=" + capacity + ", array="
					+ Arrays.toString(array) + "]";
		}
		
}
public class QueueExample {
public static void main(String[] args) {
	Emp q = new Emp(40);
	q.endqueue(20);
	q.endqueue(30);
	q.endqueue(29);
	q.endqueue(34);
	q.endqueue(23);
	System.out.println(q);
	System.out.println("Front item is "
			+ q.front());
	
	System.out.println(q.dequeue()
			+ " dequeued from queue\n");
	
	System.out.println("Front item is "
			+ q.front());
	
	
	System.out.println("Front item is "
			+ q.rear());
	
	

}
}
