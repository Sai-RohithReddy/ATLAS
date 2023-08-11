package Array;

import java.util.Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		int[] arr = {8,1,0,2,1,0,3};
		System.out.println(Arrays.toString(arr));
		
		moveAllZerosToEnd(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void moveAllZerosToEnd(int[] arr) {
		int j = 0; // j focus on zero elements
		for (int i = 0; i < arr.length; i++) { // i focus on non zero elements
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
	}
}
