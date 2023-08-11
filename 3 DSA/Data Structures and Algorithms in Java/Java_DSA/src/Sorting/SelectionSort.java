package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {3,1,5,2,6,4};
		System.out.println(Arrays.toString(arr));
		
		sSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void sSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}
