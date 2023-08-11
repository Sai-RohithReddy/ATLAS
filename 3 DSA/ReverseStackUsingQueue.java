import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class ReverseStackUsingQueue {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        String str = "Hello";
        
        for (char c : str.toCharArray()) {
            s.add(c);
        }
        System.out.println("Stack Elements: " + s.toString());
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println("Queue Elements: " + q.toString());
        while (!q.isEmpty()) {
            s.add(q.poll());
        }
        System.out.println("Stack Elements: " + s.toString());
    }
}
