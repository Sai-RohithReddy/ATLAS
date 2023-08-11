package Strategy1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = {5, 4, 3, 2, 1};

        Sort bs = new BubbleSort();
        Sort is = new InsertionSort();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        bs.sort(arr1);
        is.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
    }
}
