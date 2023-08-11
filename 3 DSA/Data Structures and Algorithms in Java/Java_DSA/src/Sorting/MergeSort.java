package Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		MergeSort ms = new MergeSort();
		
		int[] arr = {9, 5, 2, 4, 3};
		System.out.println(Arrays.toString(arr));
		
		ms.mSort(arr, new int[arr.length], 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

	public void mSort(int[] arr, int[] temp, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			
			mSort(arr, temp, low, mid);
			mSort(arr, temp, mid+1, high);
			
			merge(arr, temp, low, mid, high);
		}
	}
	
	private void merge(int[] arr, int[] temp, int low, int mid, int high) {
		
		for (int i = low; i <= high; i++) {
			temp[i] = arr[i];
		}
		int i  = low;
		int j = mid + 1;
		int k = low;
		
		while (i <= mid && j <= high) {
			if (temp[i] <= temp[j]) {
				arr[k] = temp[i];
				i++;
				//k++;
			} else {
				arr[k] = temp[j];
				j++;
				//k++;
			}
			k++;
		}
		
		while(i <= mid) {
			arr[k] = temp[i];
			i++;
			k++;
		}
	}
	
}
