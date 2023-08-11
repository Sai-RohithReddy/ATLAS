package Matrix;

public class SearchInRowColMatrix {

	public static void main(String[] args) {

	int[][] arr = {
			{10, 20, 30, 40},
			{15, 25, 35, 45},
			{27, 29, 37, 48},
			{32, 33, 39, 51}
	};
	
	search(arr, 32);
	search(arr, 55);
	
	}
	public static void search(int[][] arr, int target) {
		int i = 0;
		int j = arr.length - 1;
		
		while (i < arr[j].length && j >= 0) {
			if (arr[i][j] == target) {
				System.out.println("Target found at index - " + i +", " + j);
				return;
			}
			if (arr[i][j] > target) {
				j--;
			} else {
				i++;
			}
		}
		System.out.println("Target not found!!");
	}
}
