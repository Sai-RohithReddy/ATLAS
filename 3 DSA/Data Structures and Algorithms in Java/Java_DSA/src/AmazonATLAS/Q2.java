package AmazonATLAS;

import java.util.Stack;

public class Q2 {

	public static void main(String[] args) {
		String s1 = "peEeemsoke";
		String s2 = "abBAcC";
		String s3 = "s";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
	}
	public static String solution(String str) {
		String res = "";
		Stack<Character> stack = new Stack<>();
		
		for (char ch : str.toCharArray()) {
			if (stack.isEmpty()) {
				stack.add(ch);
			}
			else {
				char firstEle = stack.peek();
				if (ch == Character.toUpperCase(firstEle) ) {
					stack.pop();
				} else {
					stack.add(ch);
				}
			}
		}
		
		for (Object s : stack.toArray()) {
			res += s;
		}
		
		return res;
	}
}
