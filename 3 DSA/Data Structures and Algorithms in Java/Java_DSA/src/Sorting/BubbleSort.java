package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,1,9,2,10};
		System.out.println(Arrays.toString(arr));
		
		bSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void bSort(int[] arr) {
		boolean isSwapped;
		for(int i = 0; i < arr.length - 1; i++) {
			isSwapped = false;
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped) break;
		}
	}
}
