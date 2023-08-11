package CodingInterviewQuestions;

import java.util.Set;

public class removeVovelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeVovles("ice cream"));
	}
	public static String removeVovles(String str) {
		Set<Character> vovels = Set.of('a', 'e', 'i', 'o', 'u');
		StringBuilder sb = new StringBuilder();
		
		char[] charArr =  str.toCharArray();
		
		for (char ch : charArr) {
			if (!vovels.contains(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
