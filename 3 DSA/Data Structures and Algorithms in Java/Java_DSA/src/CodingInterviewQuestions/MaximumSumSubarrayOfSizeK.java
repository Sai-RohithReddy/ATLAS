package CodingInterviewQuestions;

public class MaximumSumSubarrayOfSizeK {

	public static void main(String[] args) {
		
		int[] arr = {2,7,3,5,8,1};
		int k = 3;
		
		System.out.println(maxSumSubarr1(arr, k));
		System.out.println(maxSumSubarr2(arr, k));
		System.out.println(maxSumSubarrEnhanced(arr, k));
	}
	public static int maxSumSubarr1(int[] arr, int k) {
		int tot;
		int res = Integer.MIN_VALUE;
		
		for (int i = 0; i <= arr.length - k; i++) {
			tot = 0;
			for (int j = i; j < i + k; j++) {
				tot += arr[j];
			}
			if (tot > res) res = tot;
		}
		return res;
	}
	public static int maxSumSubarr2(int[] arr, int k) {
		
		int iter = 0;
		int index = 0;
		int flag = 0;
		int tot = 0;
		int res = 0;
		
		while (index <= arr.length-3) {
			if (flag == k) {
				if(tot > res) res = tot;
				flag = 0;
				tot = 0;
				index++;
				iter = index;
			} else {
				tot += arr[iter];
				iter++;
				flag++;
			}
		}
		return res;
	}
	public static int maxSumSubarrEnhanced(int[] arr, int k) {
		int windowSum = 0;
		int greaterSum = 0;
		
		int start = 0;
		
		for (int end = 0; end < arr.length; end++) {
			windowSum += arr[end];
			if (end >= k -1) {
				greaterSum = Math.max(windowSum, greaterSum);
				windowSum -= arr[start];
				start++;
			}
		}
		return greaterSum;
	}
}
