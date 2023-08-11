import java.util.Arrays;
import java.util.Stack;

public class NextGreaterNumber {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 4, 8, 1};
        System.out.println(Arrays.toString(arr));
        fillNextGreatestNumber(arr);
    }
    public static void fillNextGreatestNumber(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!s.isEmpty()) {
                while (!s.isEmpty() && s.peek() <= arr[i]) {
                    s.pop();
                }
            }
            if (s.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = s.peek();
            }
            s.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
