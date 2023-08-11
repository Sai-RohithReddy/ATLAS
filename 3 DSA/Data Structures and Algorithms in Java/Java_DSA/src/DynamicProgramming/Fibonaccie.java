package DynamicProgramming;

public class Fibonaccie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(5));
		System.out.println(fiboBottomUpApproach(5));
		
		System.out.println(fiboTopDownApproach1(new int[5 + 1],5));
		System.out.println(fiboTopDownApproach2(5));
	}
	public static int fibo(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fibo(n - 1) + fibo(n - 2);
	}
	public static int fiboBottomUpApproach(int n) {
		int[] table = new int[n + 1];
		table[0] = 0;
		table[1] = 1;
		for (int i = 2; i <= n; i++) {
			table[i] = table[i-1] + table[i-2];
		}
		return table[n];
	}
	public static int fiboTopDownApproach1(int[] memo ,int n) {
				
		if(memo[n] == 0) {
			if (n < 2) {
				memo[n] = n;
			} else {
				memo[n] = fiboTopDownApproach1(memo, n-1) + fiboTopDownApproach1(memo, n-2);
			}
		}
		return memo[n];
	}
	public static int fiboTopDownApproach2(int n) {
		int[] memo = new int[n + 1];
		if(memo[n] == 0) {
			if (n < 2) {
				memo[n] = n;
			} else {
				int left = fiboTopDownApproach2(n - 1);
				int right = fiboTopDownApproach2(n - 2);
				memo[n] = left + right;
//				memo[n] = fiboTopDownApproach2(n-1) + fiboTopDownApproach2(n-2);
			}
		}
		return memo[n];
	}
}
