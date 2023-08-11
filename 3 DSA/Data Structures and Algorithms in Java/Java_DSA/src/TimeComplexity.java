
public class TimeComplexity {
	public static void main(String[] args) {
		double now1 = System.currentTimeMillis();
		
		System.out.println(findSum1(99999));
		System.out.println("Time taken - " + (System.currentTimeMillis() - now1) + " millisecs.");
		
		System.out.println("");
		
		double now2 = System.currentTimeMillis();
		System.out.println(findSum2(99999));
		System.out.println("Time taken - " + (System.currentTimeMillis() - now2) + " millisecs.");
		
	}
	
	public static int findSum1(int n) {
		return n * (n + 1) / 2;
	}
	
	public static int findSum2(int n) {
		int res = 0;
		for (int i = 0; i <= n; i++) {
			res += i;
		}
		
		return res;
	}

}
