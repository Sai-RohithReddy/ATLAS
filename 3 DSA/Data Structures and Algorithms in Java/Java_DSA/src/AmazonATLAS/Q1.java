package AmazonATLAS;

public class Q1 {

	public static void main(String[] args) {
		int[] arr1 = {3,4,1,2};
		int[] arr2 = {5,1,5};
		int k1 = 25;
		int k2 = 22;
		
		System.out.println("\nResult: " + solutionEnhanced(arr1, k1));
		
		System.out.println("**********************************");
		
		System.out.println("\nResult: " + solutionEnhanced(arr2, k2));
	}
	public static int solution(int[] arr, int k) {
		
		while(k >= 0) {
			for (int i = 0; i < arr.length; i++) {
				if (k < arr[i]) {
					return i;
				}
				k -= arr[i];
				System.out.println("Child " + i + " eats " + arr[i] + "toasts so k= " + k);
			}
		}
		return -1;
	}
	public static int solutionEnhanced(int[] arr, int k) {
		int i = 0;
		
		while(k >= 0) {
			if (k < arr[i]) {
				return i;
			}
			k -= arr[i];
			System.out.println("Child " + i + " eats " + arr[i] + " toasts so k= " + k);
			if (i >= arr.length - 1) {
				i = 0;
			} else {
				i++;
			}
		}
		return -1;
	}
}
