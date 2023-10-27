public class LinkedList {
    public Node head;
    public Node tail;
    public int size = 0;

    public void createLL(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size++;
    }

    public void insertNode(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void tarverseLL() {
        Node current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.value);
            if(i != size - 1) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}