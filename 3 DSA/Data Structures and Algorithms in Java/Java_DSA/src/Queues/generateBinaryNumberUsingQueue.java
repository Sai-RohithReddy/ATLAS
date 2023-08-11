package Queues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class generateBinaryNumberUsingQueue {

	public static void main(String[] args) {
		
		String[] res = gernerateBinary(4);
		System.out.println(Arrays.toString(res));

	}
	public static String[] gernerateBinary(int n) {
		String[] res = new String[n];
		Queue<String> q = new LinkedList<>();
		
		q.offer("1");
		
		for (int i = 0; i < n; i++) {
			
			res[i] = q.poll();
			
			String n1 = res[i] + "0";
			String n2 = res[i] + "1";
			
			q.offer(n1);
			q.offer(n2);
		}
		
		return res;
	}
}
