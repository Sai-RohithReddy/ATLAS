package AmazonATLAS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q3 {

	public static void main(String[] args) {
		int[] arr1 = {10, 12, 10, 11, 13, 17, 16, 15, 11};
		int[] arr2 = {7, 3, 8, 6, 4, 6, 7, 8, 9, 8, 7};
		
		System.out.println(Arrays.toString(solution(arr1)));
		System.out.println(Arrays.toString(solution(arr2)));
	}
	public static Object[] solution(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i : arr) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		for (int i : arr) {
			if (map.get(i) == 2 && !al.contains(i)) {
				al.add(i);
			}
		}
		return al.toArray();
	}
	
	
	
	
//	public static int[] solution(int[] arr) {
//		int res[];
//		ArrayList<Integer> al = new ArrayList<>();
//		int currentCount;
//		
//		for (int i = 0; i < arr.length; i++) {
//			currentCount = 1;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					currentCount++;
//				}
//			}
//			if (currentCount == 2) {
//				al.add(arr[i]);
//			}
//		}
//		
//		res = new int[al.size()];
//		
//		for (int i = 0; i < al.size(); i++) {
//			res[i] = al.get(i);
//		}
//		
//		return res;
//	}
}
