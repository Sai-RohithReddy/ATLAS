public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        // head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node current = head;
            int index = 0;
            while (index < location - 1) {
                current = current.next;
                index++;
            }
            Node nextNode = current.next;
            current.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void print() {
        if (head == null) {
            System.out.println("List does not exist");
        } else {
            Node current = head;
            // while (current != null) {
            // System.out.print(current.value + " --> ");
            // current = current.next;
            // }
            // System.out.println("null");

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

    public int searchNode(int nodeValue) {
        if (head != null) {
            Node current = head;
            for (int i = 0; i < size; i++) {
                if (current.value == nodeValue) {
                    return i;
                }
                current = current.next;
            }
        }
        return -1;
    }

    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("List does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node current = head;
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            if (current == head) {
                tail = head = null;
                size--;
            }
            current.next = null;
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

    public void delete() {
        head = null;
        tail = null;
        System.out.println("The SLL deleted successfully");
    }
}
