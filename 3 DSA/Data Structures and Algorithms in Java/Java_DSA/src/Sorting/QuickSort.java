package Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		
		int[] arr = {8,-3,5,2,6,9,-6,1,3};
		
		qs.printArr(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		qs.qSort(arr, 0, arr.length - 1);
		qs.printArr(arr);
	}
	public void printArr(int[] arr) {
		
		System.out.print("[");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
		System.out.println();
	}

	public void qSort(int[] arr, int low, int high) {
		if (low < high) {
			 
			int p = partinon(arr, low, high);
			
			qSort(arr, low, p-1);
			qSort(arr, p+1, high);
		}
	}
	
	private int partinon(int[] arr, int low, int high) {
		int i = low;
		int j = low; 
		int pivot = arr[high];
		
		while(i <= high) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			i++;
		}
		return j-1;
	}
}
    