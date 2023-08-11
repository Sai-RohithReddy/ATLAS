import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        lSearch(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void lSearch(int[] arr) {
        //
        for (int i = 0; i < arr.length - 1; i++) {
            //flag to check if given array is sorted or not
            boolean sorted = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = true;
                }
            }
            // breaking the entire loop if array sorted
            if (!sorted) break;
        }
    } 
}
