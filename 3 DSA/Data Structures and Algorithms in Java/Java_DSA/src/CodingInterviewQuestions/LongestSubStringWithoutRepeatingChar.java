package CodingInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {
		
		String str1 = "pwwkew";
		String str2 = "pwwp";
		
		System.out.println(longestSubString(str1));
		System.out.println(longestSubString(str2));

	}
	public static int longestSubString(String str) {
		Map<Character, Integer> map = new HashMap<>();
		int resSum = 0;
		int start = 0;
		
		for (int end = 0; end < str.length(); end++) {
			char rightChar = str.charAt(end);
			if (map.containsKey(rightChar)) {
				start = Math.max(start, map.get(rightChar) + 1);
			}
			map.put(rightChar, end);
			resSum = Math.max(resSum, end - start + 1);
		}
		return resSum;
	}
}
