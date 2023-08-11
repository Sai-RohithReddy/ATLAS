class ContactListImp {
    private ListNode head;
    private int size;

    class ListNode {
        private Long contactNumber;
        private String contactName;
        private ListNode next;

        public ListNode(Long number, String name) {
            this.contactName = name;
            this.contactNumber = number;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        if (this.size != 0) this.size++;
        return this.size;
    }

    public void insertContact(Long number, String name) {

        ListNode temp = new ListNode(number, name);

        if (head == null) {
            head = temp;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
            this.size++;
        }
    }

    public void displayContacts() {
        if (!isEmpty()) {
            ListNode current = head;
            while (current != null) {
                System.out.println(current.contactName + " : " + current.contactNumber);
                current = current.next;
            }
        } else {
            System.out.println("No Contacts added yet!!");
        }

    }
}

public class ContactList {
    public static void main(String[] args) {
        ContactListImp CL = new ContactListImp();

        System.out.println(CL.size());
        CL.displayContacts();

        CL.insertContact(7396781155L, "Rohith");
        CL.insertContact(7702818373L, "Sai Ram");
        CL.insertContact(8712284073L, "Bharath");
        CL.insertContact(9640034822L, "Mom");

        System.out.println(CL.size());
        CL.displayContacts();

    }
}