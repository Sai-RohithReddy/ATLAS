import java.util.LinkedList;
import java.util.Queue;

class Stack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int n) {
        q2.add(n);
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    public void pop() {
        if (q1.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(q1.peek());
            q1.remove();
        }
    } 
}

public class Assignment9 {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push(2);
        s1.push(3);
        s1.pop();
        s1.push(4);
        s1.pop();
        
        Stack s2 = new Stack();
        s2.push(2);
        s2.pop();
        s2.pop();
        s2.push(3);
        
        
    }
}
