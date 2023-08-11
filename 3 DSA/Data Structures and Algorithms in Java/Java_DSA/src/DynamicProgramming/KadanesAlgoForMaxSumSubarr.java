package DynamicProgramming;

public class KadanesAlgoForMaxSumSubarr {

	public static void main(String[] args) {
		int[] arr = {4,3,-2,6,-12,7,-1,6};
		System.out.println(maxSumSubarr(arr));
	}
	public static int maxSumSubarr(int[] arr) {
		int maxSum = arr[0];
		int currentSum = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
//			currentSum += arr[i];
//			if (currentSum < arr[i]) currentSum = arr[i];
			currentSum = Math.max(currentSum + arr[i], arr[i]);
			
			if (currentSum > maxSum) maxSum = currentSum;
		}
		
		return maxSum;
	}
}
