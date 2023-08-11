import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        generate(5);
    }
    public static void generate(int n) {
        String[] res = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for (int i = 0; i < res.length; i++) {
            res[i] = q.poll();
            String n1 = res[i] + "0";
            String n2 = res[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }
        System.out.println(Arrays.toString(res));
    }
}
