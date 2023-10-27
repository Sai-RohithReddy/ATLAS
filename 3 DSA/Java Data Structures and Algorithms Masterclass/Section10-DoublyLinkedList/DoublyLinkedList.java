public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    int size = 0;
    
    public void createDLL(int nodeValue) {
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size++;
    }

    public void inertDll(int nodeValue, int location) {
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            node.prev = tail;
            tail = node;
        } else {
            DoublyNode current = head;
            for (int i = 0; i < location - 1; i++) {
                current = current.next;
            }
            node.prev = current;
            node.next = current.next;
            current.next = node;
            node.next.prev = node;
        }
        size++;
    }

    public void traverseDLL() {
        if (head == null) {
            System.out.println("The DLL does not exist");
            return;
        }
        DoublyNode current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.value); 
            current = current.next;
            if (i != size - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public void reverseTraverseDLL() {
        if (head == null) {
            System.out.println("The DLL does not exist");
            return;
        }
        DoublyNode curretn = tail;
        for (int i = 0; i < size; i++) {
            System.out.print(curretn.value);
            curretn = curretn.prev;
            if (i != size - 1) {
                System.out.print(" <- ");
            }
        }
        System.out.println();
    }

    public int getNodeIndex(int nodeValue) {
        DoublyNode current = head;
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
            System.out.println("CLL does not exist");
            return;
        } else if (location == 0){
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (location >= size) {
            DoublyNode current = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                current.next = null;
                tail = current;
                size--;
            }
        } else {
            DoublyNode curretn = head;
            for (int i = 0; i < location - 1; i++) {
                curretn = curretn.next;
            }
            curretn.next = curretn.next.next;
            curretn.next.prev = curretn;
            size--;
        }
    }

    public void deleteDLL() {
        DoublyNode current = head;
        for (int i = 0; i < size; i++) {
            current.prev = null;
            current = current.next;
        }
        head = null;
        tail = null;
        size = 0;
        System.out.println("The DLL has been deleted");
    }
}
