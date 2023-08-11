import java.util.LinkedList;

class LinkedListImp {
    private int size;
    ListNode head;

    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int val) {
        ListNode temp = new ListNode(val);
        
        if (head == null) {
            head = temp;
        } else {
            ListNode current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = temp;
            size++;
        }
    }
    public int size() {
        return this.size;
    }

    public void display() {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println(" null");
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(5);
        l1.add(3);
        l1.add(1);

        for (int i : l1) {
            System.out.println(i);
        }

        LinkedListImp l2 = new LinkedListImp();

        l2.add(1);
        l2.add(2);
        l2.add(3);

        l2.display();
    }
}