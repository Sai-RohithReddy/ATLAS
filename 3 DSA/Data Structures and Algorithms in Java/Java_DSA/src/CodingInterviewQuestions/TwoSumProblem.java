package CodingInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

	public static void main(String[] args) {
		
		TwoSumProblem a = new TwoSumProblem();
		
		int[] arr1 = {2, 11, 5, 10, 7, 8};
		int[] arr2 = {11, 2, 0, 10, 7, 6};
		
		System.out.println(Arrays.toString(a.twoSum(arr1, 9)));
		System.out.println(Arrays.toString(a.twoSumEnhanced(arr1, 9)));
	
		System.out.println(Arrays.toString(a.twoSum(arr2, 9)));
		System.out.println(Arrays.toString(a.twoSumEnhanced(arr2, 9)));
		
		int[] res = a.twoSumEnhanced2(arr2, 9);
		
		System.out.println("Two numbers are: " + res[0] + " + " + res[1] + " = " +(res[0] + res[1]));
	}
	public int[] twoSum(int[] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == target) {
					return new int[] {i, j};
				}
			}
		}
		return new int[] {-1, -1};
	}
	
	public int[] twoSumEnhanced(int[] arr, int target) {
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(target - arr[i])) {
				map.put(arr[i], i);
			} else {
				res[1] = i;
				res[0] = map.get(target - arr[i]);
				return res;
			}
		}
		
		throw new IllegalArgumentException("Two numbers not found");
	}

	public int[] twoSumEnhanced2(int[] arr, int target) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int[] res = new int[2];
		
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				 res[0] = arr[left];
				 res[1] = arr[right];
				 return res;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return new int[0];
	}
}
