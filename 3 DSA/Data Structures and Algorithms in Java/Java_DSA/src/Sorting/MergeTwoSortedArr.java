package Sorting;

import java.util.Arrays;

public class MergeTwoSortedArr {

	public static void main(String[] args) {

		MergeTwoSortedArr mtsa = new MergeTwoSortedArr();
		
		int[] arr1 = {2,5,7};
		int[] arr2 = {3,4,9};
		
		System.out.println("Array 1 : " + Arrays.toString(arr1));
		System.out.println("Array 2 : " + Arrays.toString(arr2));
		
		int[] res = mtsa.merge(arr1, arr2);
		
		System.out.println("Result : " + Arrays.toString(res));
		
	}
	public int[] merge(int[] arr1, int[] arr2) {
		
		int m = arr1.length;
		int n = arr2.length;
		
		int[] result = new int[m + n];
		
		int i = 0; int j = 0; int k = 0;
		
		while(i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
				//k++;
			} else {
				result[k] = arr2[j];
				j++;
				//k++;
			}
			k++; // both works
		}
		while(i < m) {
			result[k] = arr1[i];
			i++;
			k++;
		}
		while(j < n) {
			result[k] = arr2[j];
			j++;
			k++;
		}
		
		return result;
	}
}
