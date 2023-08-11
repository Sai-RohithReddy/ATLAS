package CodingInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInStr {

	public static void main(String[] args) {
		String str1 = "codeforcode";
		String str2 = "aabb";
		
		System.out.println(nonRepatingChar(str1));
		System.out.println(nonRepatingChar(str2));
		
	}
	public static int nonRepatingChar(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		char[] chars = str.toCharArray();
		
		for (char ch : chars) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for (int i = 0; i < chars.length; i++) {
			if (map.get(chars[i]) == 1) {
				return i;
			}
		}
		
		return -1;
	}
}
