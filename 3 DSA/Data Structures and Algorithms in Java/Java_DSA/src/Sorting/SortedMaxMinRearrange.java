package Sorting;

import java.util.Arrays;

public class SortedMaxMinRearrange {
	public static void main(String[] args) {
		
		QuickSort qs = new QuickSort();
		SortedMaxMinRearrange s = new SortedMaxMinRearrange();
		
		int[] arr = {2,3,5,6,8,9};
		qs.printArr(arr);
		
		System.out.println(Arrays.toString(s.reArrangeSort(arr)));
		
		s.rearrangeSortEnhanced(arr);
		qs.printArr(arr);
		
	}
	
	public int[] reArrangeSort(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int itr = 0;
		
		int[] res = new int[arr.length];
		
		while (i < j) {
			res[itr] = arr[j];
			itr++;
			j--;
			res[itr] = arr[i];
			itr++;
			i++;
		}
		
		return res;
	}
	public void rearrangeSortEnhanced(int[] arr) {
		
		int maxIdx = arr.length - 1;
		int minIdx = 0;
		int max = arr[maxIdx] + 1;
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = arr[i] + (arr[maxIdx] % max) * max;
				maxIdx--;
			} else {
				arr[i] = arr[i] + (arr[minIdx] % max) * max;
				minIdx++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max;
		}
	}
}
