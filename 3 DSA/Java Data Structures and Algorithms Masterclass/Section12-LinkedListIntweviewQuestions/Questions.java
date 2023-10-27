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
}
