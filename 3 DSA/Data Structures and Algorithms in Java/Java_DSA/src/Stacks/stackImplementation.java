package Stacks;

import java.util.EmptyStackException;

public class stackImplementation {
	
	private ListNode top;
	private int length;
	
	private class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public stackImplementation() {
		top = null;
		length = 0;
	}
	
	public int length () {
		return length;
	}
	
	public boolean isEmpth() {
		return length == 0;
	}
	
	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public int pop() {
		if (isEmpth()) {
			throw new EmptyStackException();
		}
		
		int res = top.data;
		top = top.next;
		length--;
		
		return res;
	}
	
	public int peek() {
		
		if (isEmpth()) {
			throw new EmptyStackException();
		}
		
		return top.data;
	}
	
	public static void main(String[] args) {
		
		stackImplementation s1 = new stackImplementation();
		System.out.println("length - " + s1.length);
		
		s1.push(10);
		s1.push(20);
		s1.push(15);
		System.out.println("length - " + s1.length);
		System.out.println(s1.peek());
		
		s1.pop();
		System.out.println("length - " + s1.length);
		System.out.println(s1.peek());
		
	}

}
