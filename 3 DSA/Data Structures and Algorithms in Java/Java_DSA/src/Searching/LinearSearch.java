package Searching;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = {5, 1, 9, 2, 10, 15, 20};
		
		System.out.println(lSearch(arr, 10));
		System.out.println();
		System.out.println(lSearch(arr, 33));
	}
	public static int lSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) return i;
		}
		return -1;
	}
}
