public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Questions q = new Questions();
        ll.insertNode(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.tarverseLL();
        System.out.println(q.nthToLast1(ll, 2));
        System.out.println(q.nthToLast2(ll, 3).value);
        LinkedList ll2 = new LinkedList();
        ll2.insertNode(1);
        ll2.insertNode(9);
        ll2.insertNode(5);
        ll2.insertNode(10);
        ll2.insertNode(2);
        ll2.tarverseLL();
        q.partition(ll2, 4);
        ll2.tarverseLL();
    }
}