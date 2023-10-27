public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        sll.insertInLinkedList(6, 1);
        sll.insertInLinkedList(7, 3);
        sll.insertInLinkedList(8, 4);
        sll.insertInLinkedList(9, 5);
        System.out.println(sll.head.next);
        System.out.println(sll.tail.next);
        sll.print();

        System.out.println(sll.searchNode(5));
        System.out.println(sll.searchNode(9));
        System.out.println(sll.searchNode(10));

        sll.deletionOfNode(2);
        sll.print();

        sll.delete();
        sll.print();
    } 
}