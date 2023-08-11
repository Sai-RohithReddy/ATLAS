package CodingInterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {

		int n = 12345;
		
		System.out.println(revetrseInt(n));
		System.out.println(revetrseInt(-321));

	}
	public static long revetrseInt(int n) {
		
		boolean isNegative = n < 0;
		
		if (isNegative) {
//			n = n * -1;
			n *= -1;
		}
		
		long res = 0;
		//int lastDigit;
		
		while(n > 0) {
			//lastDigit = n % 10;
			//res = res * 10 + lastDigit;
			res = res * 10 + n % 10;
			//n = n/10;
			n /= 10;
		}
		
		
		return isNegative ? res * -1 : res;
	}
}
