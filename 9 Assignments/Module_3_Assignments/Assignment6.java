import java.util.Arrays;

public class Assignment6 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        sort012(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
    public static void sort012(int[] arr) {
        int i = 0, j = 0, k = arr.length - 1;
        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, k);
                k--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}