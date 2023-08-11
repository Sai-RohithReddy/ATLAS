package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {5,1,9,2,10};
		System.out.println(Arrays.toString(arr));
		
		iSearch(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void iSearch(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = temp;
		}
	}
}
