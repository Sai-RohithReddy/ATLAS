public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createCSLL(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
    }

    public void insertCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node current = head;
            int index = 0;
            while (index < location - 1) {
                current = current.next;
                index++;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public void println() {
        if (head == null) {
            System.out.println("CSLL does not exits");
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                System.out.print(current.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println();
        }
    }

    public int getIndexOf(int nodeValue) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.value == nodeValue) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("CSLL does not exits");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                head.next = null;
                head = null;
                tail = null;
            }
        } else if (location >= size) {
            Node current = head;
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            if (current == head) {
                head.next = null;
                head = tail = null;
                size--;
                return;
            }
            current.next = head;
            tail = current;
            size--;
        } else {
            Node current = head;
            for (int i = 0; i < location - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    public void deleteAll() {
        if (head == null) {
            System.out.println("CSLL does not exist");
        }
        head = null;
        tail.next = null;
        tail = null;
        size = 0;
        System.out.println("CSLL deleted successfully");
    }
}
