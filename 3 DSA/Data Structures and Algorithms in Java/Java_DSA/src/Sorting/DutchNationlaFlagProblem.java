package Sorting;

import java.util.Arrays;

public class DutchNationlaFlagProblem {

	public static void main(String[] args) {
		
		DutchNationlaFlagProblem dnf = new DutchNationlaFlagProblem();
		
		int[] arr = {2,0,2,2,0,1,1};
		System.out.println(Arrays.toString(arr));
		
		dnf.dnfSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public void dnfSort(int[] arr) {
		
		int i = 0;
		int j = 0;
		int k = arr.length - 1;
		
		while(i <= k) {
			
			if(arr[i] == 0) {
				swap(arr, i, j);
				i++;
				j++;
			}
			else if(arr[i] == 1) {
				i++;
			}
			else if(arr[i] == 2) {
				swap(arr, i, k);
				k--;
			}
		}
	}
	private void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
	}
}
