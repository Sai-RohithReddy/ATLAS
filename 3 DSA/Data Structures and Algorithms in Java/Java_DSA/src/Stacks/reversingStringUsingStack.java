package Stacks;

import java.util.Stack;

public class reversingStringUsingStack {

	public static void main(String[] args) {
		
		String str = "ABCD";
		
		System.out.println(str);
		System.out.println(reverseUsingStack(str));

	}
	
	public static String reverseUsingStack(String word) {
		Stack<Character> stack = new Stack<>();
		char[] chars = word.toCharArray();
		
		for (char c : chars) {
			stack.push(c);
		}
		
		for (int i = 0; i < word.length(); i++) {
			chars[i] = stack.pop();
		}
		
		return new String(chars);
		
	}

}
