package LinkedList;

public class ImplementingSinglyLinkedList {
	
	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display(ListNode head) {
		ListNode current = head;
		
		while (current != null) {
			System.out.print(current.data + "--> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println("");
	}
	
	public void printLinkedList() {
		if (head == null) {
			System.out.println("null");
		}
		
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println("");
	}

	public int length() {
		
		if (head == null) return 0;
		
		int count = 0;
		
		ListNode current = head;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		
		return count;
	}
	
	public void insertFirst(int value) {
		
		ListNode newNode = new ListNode(value);
		
		newNode.next = head;
		head = newNode;
	}
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		
		if (head == null) {
			head = newNode;
			return;
		}
		
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void insertAt(int value, int posetion) {
		ListNode node = new ListNode(value);
		
		if (posetion == 1) {
			node.next = head;
			head = node;
		} else {
			
			ListNode previous = head;
			int count = 1;
			
			while (count < posetion - 1) {
				previous = previous.next;
				count++;
			}
			
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
		}
		
		
		
	}
	
	public ListNode deleteFirst() {
		if(head == null) return null;
		
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	public ListNode deleteLast() {
		
		if (head == null || head.next == null) return head;
		
		ListNode current = head;
		ListNode previous = null;
		
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	public void deleteAt(int posetion) {
		if (posetion == 1) {
			head = head.next;
		}
		else {
		ListNode previous = head;
		int count = 1;
		
		while (count < posetion - 1) {
			previous = previous.next;
			count++;
		}
		ListNode current = previous.next;
		previous.next = current.next;
		}
		
	}
	
	public boolean find(ListNode head, int SearchKey) {
		
		if (head == null) {
			return false;
		}
		
		ListNode current = head;
		
		while (current != null) {
			if (current.data == SearchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public ListNode reverse(ListNode head) {
		if (head == null) {
			return head;
		}
		
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public ListNode getMiddleNode() {
		if (head == null) {
			return null;
		}
		
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
		
	}
	
	public ListNode getNthNodeFromEnd(int n) {
		if (head == null) {
			return null;
		}
		if (n <= 0) {
			throw new IllegalArgumentException("Invalid value: n = " + n);
		}
		
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		
		while(count < n) {
			
			if (refPtr == null) {
				throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
			}
			
			refPtr = refPtr.next;
			count++;
		}
		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
	
	public void removeDupInList() {
		if (head == null) {
			return;
		}
		
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
	}
	
	public ListNode insertInSortedList(int value) {
		ListNode newNode = new ListNode(value);
		
		if (head == null) {
			return newNode;
		}
		ListNode current = head;
		ListNode temp = null;
		
		while (current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	
	public void deleteNode(int key) {
		ListNode current = head;
		ListNode temp = null;
		
		if (current != null && current.data == key) {
			head = current.next;
		}
		
		while (current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		
		if(current == null) return;
		
		temp.next = current.next;
	}
	
	public boolean containsLoop() {
		
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if (fastPtr == slowPtr) {
				return true;
			}
		}
		return false;
	}
	
	public void createALoopInLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode forth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}
	
	public ListNode startNodeInLoop() {
		
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if (fastPtr == slowPtr) {
				return getStartNode(slowPtr);
			}
		}
		return null;
	}

	private ListNode getStartNode(ListNode slowPtr) {
		ListNode temp = head;
		
		while(temp != slowPtr) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp;
	}
	
	public void removeLoop() {
		
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if (fastPtr == slowPtr) {
				removeLoop(slowPtr);
				return;
			}
		}
	}
	
	private void removeLoop(ListNode slowPtr) {
		ListNode temp = head;
		
		while(temp.next != slowPtr.next) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
	slowPtr.next = null;
}

	public static ListNode merge(ListNode a, ListNode b) {
	
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		
		while (a != null && b != null) {
			if (a.data <= b.data) {
				tail.next = a;
				a = a.next;
			}else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		if (a == null) {
			tail.next = b;
		}else {
			tail.next = a;
		}
		
		return dummy.next;
	}
	
	public static ListNode add(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		int carry = 0;
		
		while (a != null || b != null) {
			int x = (a != null) ? a.data : 0;
			int y = (b != null) ? b.data : 0;
			
			int sum = carry + x + y;
			
			carry = sum / 10;
			
			tail.next = new ListNode(sum % 10);
			tail = tail.next;
			
			if (a != null) a = a.next;
			if (b != null) b = b.next;
		}
		
		if (carry > 0) {
			tail.next = new ListNode(carry);
		}
		
		return dummy.next;
	}
	
	public static void main(String[] args) {
		
		ImplementingSinglyLinkedList sll = new ImplementingSinglyLinkedList();
		
		sll.head = new ListNode(10);
		
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode forth = new ListNode(11);
		
		sll.head.next = second;
		second.next = third;
		third.next = forth;
		
		sll.display(sll.head);
		
		System.out.println("Length of Singly Linked List: " + sll.length());
		
		System.out.println("***********************************************************************");
		
		ImplementingSinglyLinkedList sll2 = new ImplementingSinglyLinkedList();
		sll2.display(sll.head);
		System.out.println("Length of Singly Linked List: " + sll2.length());
		
		System.out.println("***********************************************************************");
		
		sll.insertFirst(9);
		sll.display(sll.head);
		
		sll.insertFirst(89);
		sll.display(sll.head);

		System.out.println("***********************************************************************");
		
		sll.insertLast(84);
		sll.display(sll.head);
		
		sll.insertLast(99);
		sll.display(sll.head);
		
		System.out.println("***********************************************************************");
		
		sll.insertAt(99, 1); // first index
		sll.display(sll.head);
		
		sll.insertAt(84, 3); // middle index
		sll.display(sll.head);
		
		sll.insertAt(55, 11); // last index
		sll.display(sll.head);
		
		
		System.out.println("***********************************************************************");
		
		sll2.insertFirst(1);
		sll2.insertFirst(2);
		sll2.insertFirst(3);
		sll2.insertFirst(4);
		sll2.insertFirst(5);
		sll2.insertFirst(6);
		sll2.display(sll.head);
		
		System.out.println("Deleted node: " + sll2.deleteFirst().data);
		sll2.display(sll.head);
		
		System.out.println("***********************************************************************");
		
		sll2.display(sll.head);
		System.out.println("Deleted node: " + sll2.deleteLast().data);
		sll2.display(sll.head);
		
		System.out.println("***********************************************************************");
		
		sll2.display(sll.head);
		sll2.deleteAt(3);
		sll2.display(sll.head);
		
		System.out.println("***********************************************************************");
		
		ImplementingSinglyLinkedList sll3 = new ImplementingSinglyLinkedList();
		
		if (sll2.find(sll2.head, 4)) {
			System.out.println("Search Key found");
		} else {
			System.out.println("Search Key not found");
		}
		
		if (sll2.find(sll2.head, 1)) {
			System.out.println("Search Key found");
		} else {
			System.out.println("Search Key not found");
		}
		
		if (sll3.find(sll3.head, 4)) {
			System.out.println("Search Key found");
		} else {
			System.out.println("Search Key not found");
			
		System.out.println("***********************************************************************");
		
		sll.display(sll.head);
		
		ListNode reverseListHead = sll.reverse(sll.head);
		sll.display(reverseListHead);
		
		System.out.println("***********************************************************************");
		
		sll2.display(sll2.head);
		sll2.insertFirst(6);
		sll2.printLinkedList();
		
		ListNode middleNode1 = sll2.getMiddleNode();
		System.out.println("Middle Node is: " + middleNode1.data);
		
		sll2.insertFirst(66);
		sll2.printLinkedList();
		
		ListNode middleNode2 = sll2.getMiddleNode();
		System.out.println("Middle Node is: " + middleNode2.data);
		
		System.out.println("***********************************************************************");
		
		sll2.printLinkedList();
		
		ListNode nthNodeFromEnd = sll2.getNthNodeFromEnd(2);
		System.out.println("Nth node from end is - " + nthNodeFromEnd.data);
		
		System.out.println("***********************************************************************");
		
		ImplementingSinglyLinkedList sll4 = new ImplementingSinglyLinkedList();
		
		sll4.insertFirst(3);
		sll4.insertFirst(3);
		sll4.insertFirst(2);
		sll4.insertFirst(1);
		sll4.insertFirst(1);
		sll4.insertFirst(1);
		sll4.printLinkedList();
		
		sll4.removeDupInList();
		sll4.printLinkedList();
		
		System.out.println("***********************************************************************");
		
		sll4.insertLast(7);
		sll4.insertLast(17);
		sll4.printLinkedList();
		
		sll4.insertInSortedList(9);
		sll4.printLinkedList();
		
		System.out.println("***********************************************************************");
		
		sll4.printLinkedList();
		sll4.deleteNode(7);
		sll4.printLinkedList();
		
		System.out.println("***********************************************************************");

		ImplementingSinglyLinkedList sll5 = new ImplementingSinglyLinkedList();
		sll5.createALoopInLinkedList();
		System.out.println(sll5.containsLoop());
		
		System.out.println(sll4.containsLoop());
		
	    System.out.println("Loot started at - " + sll5.startNodeInLoop().data);
	    
	    sll5.removeLoop();
	    
	    System.out.println("\nAfter removing loop..");
	    sll5.printLinkedList();
	    
		System.out.println("***********************************************************************");

		ImplementingSinglyLinkedList sll6 = new ImplementingSinglyLinkedList();
		sll6.insertLast(1);
		sll6.insertLast(4);
		sll6.insertLast(8);
		
		ImplementingSinglyLinkedList sll7 = new ImplementingSinglyLinkedList();
		sll7.insertLast(3);
		sll7.insertLast(5);
		sll7.insertLast(8);
		sll7.insertLast(9);
		sll7.insertLast(14);
		sll7.insertLast(18);
		
		sll6.printLinkedList();
		sll7.printLinkedList();
		
		System.out.println();
		
		ImplementingSinglyLinkedList result = new ImplementingSinglyLinkedList();
		result.head = merge(sll6.head, sll7.head);
		result.printLinkedList();
		
		System.out.println("***********************************************************************");
		
		ImplementingSinglyLinkedList sll8 = new ImplementingSinglyLinkedList();
		sll8.insertLast(7);
		sll8.insertLast(4);
		sll8.insertLast(9);
		
		ImplementingSinglyLinkedList sll9 = new ImplementingSinglyLinkedList();
		sll9.insertLast(5);
		sll9.insertLast(6);
		
		sll8.printLinkedList();
		sll9.printLinkedList();
		
		ImplementingSinglyLinkedList addResult = new ImplementingSinglyLinkedList();
		addResult.head = add(sll8.head, sll9.head);
		addResult.printLinkedList();
		}
	}
}
