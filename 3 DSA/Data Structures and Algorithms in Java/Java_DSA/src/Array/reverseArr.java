package Array;

import java.util.Arrays;

public class reverseArr {

	public static void main(String[] args) {
		int[] arr = {2,11,5,10,7,8};
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(reverse1(arr)));
		
//		reverse2(arr);
//		System.out.println(Arrays.toString(arr));
		
		reverse3(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static int[] reverse1(int[] arr) {
		int length = 0;
		for (int i = 0; i < arr.length; i++) {
			length++;
		}
		
		int[] res = new int[length];
		int indx = 0;
		
		for (int j = length - 1; j >= 0; j--) {
			res[indx] = arr[j];
			indx++;
		}
		return res;
	}

	public static void reverse2(int[] arr) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void reverse3(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int start = i;
			int end = arr.length - 1 - i;
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
}
