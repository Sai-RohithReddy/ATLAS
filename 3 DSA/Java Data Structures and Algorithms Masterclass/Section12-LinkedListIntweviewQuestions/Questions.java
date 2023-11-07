import java.util.HashSet;

public class Questions {
    public void deleteDups(LinkedList ll) {
        HashSet<Integer> hs = new HashSet<>();
        Node current = ll.head;
        Node prev = null;
        while (current != null) {
            if (hs.contains(current.value)) {
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(current.value);
                prev = current;
            }
            current = current.next;
        }
    }

    public int nthToLast1(LinkedList ll, int n) {
        Node current = ll.head;
        for (int i = 0; i < ll.size - n; i++) {
            current = current.next;
        }
        return current.value;
    }

    public Node nthToLast2(LinkedList ll, int n) {
        Node p1 = ll.head;
        Node p2 = ll.head;
        for (int i = 0; i < n; i++) {
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public LinkedList partition(LinkedList ll, int x) {
        // TODO
        Node current = ll.head;
        while (current != null) {
            if (current.next.value < x) {
                Node nxt = current.next;
                current.next = nxt.next;
                nxt.next = ll.head;
                ll.head = nxt;
            }
            current = current.next;
        }
        return ll;
      }
}
