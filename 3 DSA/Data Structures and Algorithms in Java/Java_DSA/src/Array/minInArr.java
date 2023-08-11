package Array;

import java.util.Arrays;

public class minInArr {

	public static void main(String[] args) {
		
		int[] arr = {5,9,3,15,1,2};
		System.out.println(Arrays.toString(arr));
		System.out.println(min(arr));
		
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
	public static int min(int[] arr) {
		
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
