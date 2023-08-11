package Queues;

import java.util.NoSuchElementException;

public class queueImplementation {
	private ListNode front;
	private ListNode rear;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public queueImplementation(){
		front = null;
		rear = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int first() { // peek()
		
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is already empty");
		}
		
		return front.data;
	}
	
	public int last() { // peek()
			
			if (isEmpty()) {
				throw new NoSuchElementException("Queue is already empty");
			}
			
			return rear.data;
		}

	public void print() {
		if (isEmpty()) {
			return;
		}
		
		ListNode current = front;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void enqueue(int data) {
		
		ListNode temp = new ListNode(data);
		
		if (isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	
	public int dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is already empty");
		}
		int res = front.data;
		
		front = front.next;
		if (front == null) {
			rear = null;
		}
		
		length--;
		return res;
 	}
	
	public static void main(String[] args) {
		
		queueImplementation q1 = new queueImplementation();
		System.out.println("Length - " + q1.length);
		
		q1.enqueue(10);
		q1.enqueue(5);
		q1.enqueue(99);
		System.out.println(q1.first());
		System.out.println("Length - " + q1.length);
		
		q1.print();
		
		System.out.println();
		
		System.out.println("Peek element - " + q1.first());
		System.out.println("Rear element - " + q1.last());
		
		System.out.println("Removed element - " + q1.dequeue());
		System.out.println("Length - " + q1.length);
		q1.print();
		
		System.out.println("Removed element - " + q1.dequeue());
		System.out.println("Length - " + q1.length);
		q1.print();		

	}

}
