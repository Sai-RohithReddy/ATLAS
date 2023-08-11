package LinkedList;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {

	private ListNode last;
	private int length;
	
	private class ListNode {
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public CircularSinglyLinkedList() {
		last = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void createCircularLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(10);
		ListNode forth = new ListNode(15);
		
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = first;
		
		last = forth;
	}
	
	public void print() {
		
		if (last == null) return;
		
		ListNode start = last.next;
		
		while(start != last) {
			System.out.print(start.data + " --> ");
			start = start.next;
		}
		System.out.println(start.data + " --> Start");
	}
	
	public void insertFirst(int value) {
		
		ListNode newNode = new ListNode(value);
		
		if (last == null) {
			last = newNode;
		} else {
			newNode.next = last.next;
		}
		
		last.next = newNode;
		length++;
	}
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		
		if (last == null) {
			last = newNode;
			last.next = last;
		} else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
		length++;
	}
	
	public ListNode removeFirst() {
		if (last == null) {
			throw new NoSuchElementException("Circular Singly Linked List is already empyt.");
		}
		
		ListNode temp = last.next;
		
		if (last.next == last) {
			last = null;
		} else {
			last.next = temp.next;
		}
		temp.next = null;
		length--;
		return temp;
	}
	
	public int removeFirstReturn() {
		if (last == null) {
			throw new NoSuchElementException("Circular Singly Linked List is already empyt.");
		}
		
		ListNode temp = last.next;
		int result = temp.data;
		
		if (last.next == last) {
			last = null;
		} else {
			last.next = temp.next;
		}
		length--;
		return result;
	}
	
	public void removeLast() {
		if (last == null) {
			throw new NoSuchElementException();
		}
		
		ListNode temp = last.next;
		
		if (last.next == last) {
			last = null;
		} else {
			while (temp.next != last) {
				temp = temp.next;
			}
			temp.next = last.next;
		}
		last.next = null;
		last = temp;
		length--;
	}
	
	public static void main(String[] args) {
		
		CircularSinglyLinkedList csll1 = new CircularSinglyLinkedList();
		
		csll1.createCircularLinkedList();
		
		csll1.print();
		
		System.out.println("******************************************************");
		
		csll1.insertFirst(9);
		csll1.print();
		
		System.out.println("******************************************************");

		csll1.insertLast(20);
		csll1.print();

		System.out.println("******************************************************");
		
		csll1.print();
		ListNode res1 = csll1.removeFirst();
		System.out.println("deleted node- " + res1.data);
		csll1.print();
		
		System.out.println();
		
		csll1.print();
		System.out.println("deleted node- " + csll1.removeFirstReturn());
		csll1.print();
		
		System.out.println("******************************************************");
		
		csll1.print();
		csll1.removeLast();
		csll1.print();
		
		csll1.removeLast();
		csll1.print();

	}

}
