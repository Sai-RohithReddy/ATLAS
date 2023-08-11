package Array;

import java.util.Arrays;

public class removeEvenNum {

	public static void main(String[] args) {
		int[] arr = {3,2,4,7,10,6,5};
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(removeEven(arr)));

	}
	public static int[] removeEven(int[] arr) {
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		
		int[] res = new int[oddCount];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				res[index] = arr[i];
				index++;
			}
		}
		return res;
	}

}
