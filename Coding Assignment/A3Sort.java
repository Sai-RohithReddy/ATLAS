import java.util.Arrays;

public class A3Sort {
    public static void main(String[] args) {
       
        int[] arr1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        long mStartTime = System.nanoTime();
        mergeSort(arr1, new int[arr1.length], 0, arr1.length - 1);
        long mEndTime = System.nanoTime();
        
        long hStartTime = System.nanoTime();
        heapSort(arr2);
        long hEndTime = System.nanoTime();
        
        long qStartTime = System.nanoTime();
        quickSort(arr3, 0, arr3.length - 1);
        long qEndTime = System.nanoTime();

        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));
        // System.out.println(Arrays.toString(arr3));

        long mRes = mEndTime - mStartTime;
        long hRes = hEndTime - hStartTime;
        long qRes = qEndTime - qStartTime;
        
        System.out.println(String.format("Merge Sort took %s nano seconds to sort given Array.", mRes));
        System.out.println(String.format("Heap Sort took %s nano seconds to sort given Array.", hRes));
        System.out.println(String.format("Quick Sort took %s nano seconds to sort given Array.", qRes));

    }
    public static void mergeSort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }
    private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;

        while(i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }
    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    private static void heapify(int[] arr, int n, int i) {
        int large = i, l = 2 * i + 1, r = 2 * i + 2;
        if (l < n && arr[l] > arr[large]) large = l;
        if (r < n && arr[r] > arr[large]) large = r;
        if (large != i) {
            int swap = arr[i];
            arr[i] = arr[large];
            arr[large] = swap;
            heapify(arr, n, large);
        }
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partitian(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }
    private static int partitian(int[] arr, int low, int high) {
        int i = low, j = low, pivot = arr[high];
        while (i <= high) {
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
