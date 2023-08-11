class LinkedList {
    private ListNode head = null;
    private int length = 0;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void len() {
        System.out.println(length);
    }
    
    public void insert(int data) {
        ListNode temp = new ListNode(data);
        if(head != null) {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
            length++;
        } else {
            head = temp;
        }
    }

    public void display() {
        
        if (!isEmpty()) {
            ListNode current = head;

        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }

        System.out.print("null");
        System.out.println();
        } else {
            System.out.println("head --> null");
        }
    }
    public void findMid() {
        ListNode sPtr = head;
        ListNode fPtr = head;
        while (fPtr.next != null && fPtr.next.next != null) {
            sPtr = sPtr.next;
            fPtr = fPtr.next.next;
        }
        System.out.println(sPtr.data);
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
    
        l.display();
        l.findMid();
    }

  
}
