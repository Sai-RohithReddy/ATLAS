package LinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0; // head == null
	}
	
	public int length() {
		return length;
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		
		if (isEmpty()) {
			tail = newNode;
		}else {
			head.previous = newNode;
			newNode.next = head;
		}
		head = newNode;
		length++;
	}

	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			head = newNode;
		}else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}
	
	public void print(boolean reverse) {
		if (!reverse) {
			
			if (head == null) return;
			
			ListNode temp = head;
			
			while(temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}
			System.out.print("null");
			System.out.println();
		}else {
			
			if (tail == null) return;
 			
			ListNode temp = tail;
			
			while (temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.previous;
			}
			System.out.print("null");
			System.out.println();
		}
	}
	
	public void displayForward() {
		if (head == null) return;
		
		ListNode temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
			System.out.println("null");
	}
	
	public void displayBackward() {
		if (tail == null) return;
		
		ListNode temp = tail;
		
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.previous;
		}
			System.out.println("null");
	}
	
	public ListNode deleteFirst() {
		
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode temp = head;
		
		if (head == tail) {
			tail = null;
		}else {
			head.next.previous = null;
		}
		
		head = head.next;
		temp.next = null;
		length--;
		
		return temp;
		
	}
	
	public ListNode deleteLast() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode temp = tail;
		
		if (head == tail) {
			head = null;
		}else {
			temp.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		length--;
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		DoublyLinkedList dll1 = new DoublyLinkedList();
		
		System.out.println(dll1.length());
		System.out.println(dll1.isEmpty());

		
		dll1.insertLast(1);
		dll1.insertLast(10);
		dll1.insertLast(15);
		dll1.insertLast(25);
		
		System.out.println(dll1.length());
		System.out.println(dll1.isEmpty());

		System.out.println("************************************************************************");
		
		dll1.print(false);
		dll1.print(true);
		
		dll1.displayForward();
		dll1.displayBackward();
		
		System.out.println("************************************************************************");
		
		dll1.insertFirst(0);
		dll1.displayForward();
		
		System.out.println("************************************************************************");
		
		dll1.insertLast(40);
		dll1.displayForward();
		
		System.out.println("************************************************************************");

		dll1.displayForward();
		dll1.deleteFirst();
		dll1.displayForward();
		
		System.out.println("************************************************************************");

		dll1.displayForward();
		dll1.deleteLast();
		dll1.displayForward();

		dll1.deleteLast();
		dll1.displayForward();
	
		dll1.deleteLast();
		dll1.displayForward();

		dll1.deleteLast();
		dll1.displayForward();

		dll1.deleteLast();
		dll1.displayForward();
		
		dll1.deleteLast();
		dll1.displayForward();
		
		System.out.println("************************************************************************");

	}

}
