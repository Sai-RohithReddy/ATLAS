public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        System.out.println(csll.head.value);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(6, 2);
        csll.insertCSLL(7, 22);
        csll.insertCSLL(8, 4);
        csll.println();
        System.out.println(csll.getIndexOf(8));
        csll.deleteNode(2);
        csll.println();
        csll.deleteAll();
        csll.println();        
    }
}