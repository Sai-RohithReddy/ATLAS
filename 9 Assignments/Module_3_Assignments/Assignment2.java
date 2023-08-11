class Stack {
    ListNode top;
    int size; 
    class ListNode {
        int data;
        ListNode next;
        
        ListNode(int data) {
            this.data = data;
        }
    }
    void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        size++;
    }
    void peek () {
        if (!isEmpty()) {
            System.out.println(top.data);
        } else {
            System.out.println("Empty Stack");
        }
    }
    boolean isEmpty() {
        return top == null;
    }
    void pop() {
        if (!isEmpty()) {
            int temp = top.data;
            top = top.next;
            size--;
            System.out.println("Popped item: " + temp);
        } else {
            System.out.println("Empty Stack");
        }
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.peek();
        s.push(5);
        s.peek();
        s.push(10);
        s.peek();
        s.push(20);
        s.peek();

        s.pop();
        s.pop();
        s.peek();
        s.pop();
        s.peek();
    }
}
