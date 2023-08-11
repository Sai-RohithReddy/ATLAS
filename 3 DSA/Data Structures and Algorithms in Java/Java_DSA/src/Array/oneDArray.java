package Array;

import java.util.Arrays;

public class oneDArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr1));
		printArray(arr1);
		
		int[] arr2 = new int[5];
		printArray(arr2);
		arr2[0] = 1;
		arr2[4] = 5;
		printArray(arr2);
		
		System.out.println(arr2[arr2.length - 1]);
		
		printArray(new int[] {1,2,3,4,5});
		
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
