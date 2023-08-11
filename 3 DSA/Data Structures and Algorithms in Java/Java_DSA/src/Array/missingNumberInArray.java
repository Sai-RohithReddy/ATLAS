package Array;

import java.util.Arrays;

public class missingNumberInArray {

	public static void main(String[] args) {
		int[] arr = {2,4,1,8,6,3,7};
		System.out.println(Arrays.toString(arr));
			
		System.out.println(findMissingNumber(arr));
	}
	public static int findMissingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2; // to find the sum of first n natural numbers(1 to n)
		for (int num : arr) {
			sum = sum - num;
		}
		return sum;
	}
}
