import java.util.Arrays;

public class Probliem3 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int res = kthSmallest(arr, 0, 6, 3);
        System.out.println(res);
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        return arr[k - 1];
    } 
}
