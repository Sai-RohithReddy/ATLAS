package Searching;

public class SearchInsertPosition {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7};
		
		System.out.println(searchInsertPosition(arr, 5));
		System.out.println(searchInsertPosition(arr, 2));
		System.out.println(searchInsertPosition(arr, 8));
		System.out.println(searchInsertPosition(arr, 0));

	}
	public static int searchInsertPosition(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if (arr[mid] == target) return mid;
			
			if (target < arr[mid]) {
				end = mid - 1;
				
			} else {
				start = mid + 1;
			}
		}
		
		return start;
	}
}
