package Array;

import java.util.Arrays;

public class SecondMaxValueInArr {
	public static void main(String[] args) {
		int[] arr = {33,13,34,2,34,1};
		System.out.println(Arrays.toString(arr));
		
		System.out.println(secondMax(arr));
//		System.out.println(secondMax2(arr));
		
		System.out.println(secondMin(arr));
		
	}
	public static int secondMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max){
				secondMax = arr[i];
			}
		}
		
		return secondMax;
	}
	
//	public static int secondMax2(int[] arr) {
//		int max = Integer.MIN_VALUE;
//		int secondMax = Integer.MIN_VALUE;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//			if (arr[i] > secondMax && arr[i] < max) {
//				secondMax = arr[i];
//			}
//		}
//		return secondMax;
//	}
	
	public static int secondMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				secondMin = min;
				min = arr[i];
			} else if (arr[i] < secondMin && arr[i] != min) {
				secondMin = arr[i];
			}
		}
		return secondMin;
	}
}
