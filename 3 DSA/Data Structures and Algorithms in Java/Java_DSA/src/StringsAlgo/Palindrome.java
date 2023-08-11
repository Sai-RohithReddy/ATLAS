package StringsAlgo;

public class Palindrome {

	public static void main(String[] args) {

		String wrd1 = "madam";
		String wrd2 = "that";
		
		System.out.println(isPalindrome(wrd1));
		System.out.println(isPalindrome(wrd2));
	}
	public static boolean isPalindrome(String word) {
		char[] charArr = word.toCharArray();
		int start = 0;
		int end = charArr.length - 1;
		
		while (start < end) {
			if (charArr[start] != charArr[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
