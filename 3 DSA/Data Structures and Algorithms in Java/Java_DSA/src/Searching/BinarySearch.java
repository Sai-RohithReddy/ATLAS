package Searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1, 10, 20, 47, 59, 65, 75, 88, 99};
		
		System.out.println(bSearch(arr,99));
		System.out.println();
		System.out.println(bSearch(arr, 59));
		System.out.println();
		System.out.println(bSearch(arr, 1));
		System.out.println();
		System.out.println(bSearch(arr, 100));
	}
	public static int bSearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if (arr[mid] == target) return mid;
			
			if(target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
