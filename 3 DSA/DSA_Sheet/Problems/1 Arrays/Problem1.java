import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // reverseItr(arr);
        reverseRec(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseItr(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void reverseRec(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseRec(arr, start + 1, end - 1);
    }
}