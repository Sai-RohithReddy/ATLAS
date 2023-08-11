import java.util.Arrays;

public class SortAlgo {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 4};
        // bSort(arr);
        // iSort(arr);
        // sSort(arr);
        // mSort(arr, new int[arr.length], 0, arr.length - 1);
        qSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void bSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted) break;
        }
    }
    static void iSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    static void sSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp; 
        }
    }
    static void mSort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mSort(arr, temp, low, mid);
            mSort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }
    private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = 0; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high) {
            if (arr[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }
    static void qSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = pivot(arr, low, high);
            qSort(arr, low, pivot - 1);
            qSort(arr, pivot + 1, high);
        }
    }
    private static int pivot(int[] arr, int low, int high) {
        int i = 0;
        int j = 0;
        int pivot = arr[high];
        while(i <= high) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }
}