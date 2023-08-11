import java.util.LinkedList;

public class Assignment3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.push(10);
        ll.push(9);
        ll.push(8);
        ll.push(7);
        ll.push(6);
        ll.push(4);
        ll.push(1);
        ll.push(5);
        ll.push(2);
        ll.push(3);
        
        System.out.println("Before Sorted: " + ll.toString());
        sortLinkedList(ll);
        System.out.println("After Sorted: " + ll.toString());
    }
    public static void sortLinkedList(LinkedList<Integer> ll) {
        for (int i = 0; i < ll.size() - 1; i++) {
            boolean isSorted = false;
            for (int j = 0; j < ll.size() - 1 - i; j++) {
                if (ll.get(j) > ll.get(j + 1)) {
                    Integer temp = ll.get(j);
                    ll.set(j, ll.get(j + 1));
                    ll.set(j + 1, temp);
                    isSorted = true;
                }
            }
            if (!isSorted) break;
        }
    }
}
