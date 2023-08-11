package Array;

import java.util.Arrays;

public class arrResize {

	public static void main(String[] args) {
		int[] arr = {5,9,2,10};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		
		int[] arr1 = reSizeArray(arr);
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1.length);
	}
	public static int[] reSizeArray(int[] arr) {
		int[] temp = new int[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		return temp;
	}
}
