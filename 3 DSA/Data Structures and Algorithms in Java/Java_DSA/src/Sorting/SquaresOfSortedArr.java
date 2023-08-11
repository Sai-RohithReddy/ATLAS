package Sorting;

public class SquaresOfSortedArr {
	public static void main(String[] args) {
		 
		QuickSort qs = new QuickSort();
		SquaresOfSortedArr ss = new SquaresOfSortedArr();		
		
		int[] arr = {-4, -1, 0, 3, 10};
		qs.printArr(arr);
		
		int[] res = ss.sortedSqurares(arr);
		qs.printArr(res);
	}
	
	public int[] sortedSqurares(int[] arr) {
		int n = arr.length;
		int i = 0;
		int j = n - 1;
		
		int[] res = new int[n];
		
		for (int k = n - 1; k >= 0; k--) {
			if (Math.abs(arr[i]) > Math.abs(arr[j])) {
				res[k] = arr[i] * arr[i];
				i++;
 			} else {
 				res[k] = arr[j] * arr[j];
 				j--;
 			}
		}
		
		return res;
	}
}
