package CodingInterviewQuestions;

public class IsValidSubsequenceString {

	public static void main(String[] args) {
		String str = "abcde";
		
		System.out.println(isValidSubsequence(str, "ace"));
		System.out.println(isValidSubsequence(str, "aec"));
		
		System.out.println();
		
		System.out.println(isValidSubsequenceEnhanced(str, "ace"));
		System.out.println(isValidSubsequenceEnhanced(str, "aec"));

	}
	public static boolean isValidSubsequence(String str, String target) {
		
		String res = "";
		
		int i = 0;
		int j = 0;
		
		while(i < str.length() && j < target.length()) {
			if(str.charAt(i) == target.charAt(j)) {
				res = res + str.charAt(i);
				i++;
				j++;
			} else {
				i++;
			}
		}
		
		
		System.out.println(res);
		return target.equals(res);
	}

	public static boolean isValidSubsequenceEnhanced(String str, String target) {
		int i = 0;
		int j = 0;
		
		while(i < str.length() && j < target.length()) {
			if (str.charAt(i) == target.charAt(j)) {
				j++;
			}
			i++;
		}
		return j == target.length();
	}
}
