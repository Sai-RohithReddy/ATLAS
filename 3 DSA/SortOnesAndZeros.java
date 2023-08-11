import java.util.Arrays;

public class SortOnesAndZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1};
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[j] == 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } 
            if (arr[j] != 1) {
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
