public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.inertDll(2, 1);
        dll.inertDll(3, 2);
        dll.inertDll(4, 7);
        dll.inertDll(5, 4);
        dll.traverseDLL();
        dll.reverseTraverseDLL();
        System.out.println(dll.getNodeIndex(5));
        dll.deleteNode(2);
        dll.traverseDLL();
        dll.deleteDLL();
        dll.traverseDLL();

    }
}
