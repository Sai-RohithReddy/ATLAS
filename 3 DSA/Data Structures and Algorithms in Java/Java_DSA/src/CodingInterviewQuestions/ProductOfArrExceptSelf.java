package CodingInterviewQuestions;

import java.util.Arrays;

public class ProductOfArrExceptSelf {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1, -1, 0, -3, 3};
		
		System.out.println(Arrays.toString(productOfArrExceptSelf(arr1)));
		System.out.println(Arrays.toString(productOfArrExceptSelf(arr2)));

	}
	public static int[] productOfArrExceptSelf(int[] arr) {
		
		int [] res = new int[arr.length];
		int temp = 1;
		
		for (int i = 0; i < arr.length; i++) {
			res[i] = temp;
			temp *= arr[i];
		}
		
		temp = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			res[i] *= temp;
			temp *= arr[i];
		}
		return res;
	}
}
