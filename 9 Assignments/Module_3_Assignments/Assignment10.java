public class Assignment10 {
    public static void main(String[] args) {
        int[] arr1 = { -8, 2, 3, -6, 10 };
        int[] arr2 = { 12, -1, -7, 8, -15, 30, 16, 28 };

        printFirstNegativeIntegerInWindow(arr1, 2);
        printFirstNegativeIntegerInWindow(arr2, 3);
    }

    public static void printFirstNegativeIntegerInWindow(int[] arr, int window) {
        for (int i = 0; i <= arr.length - window; i++) {
            boolean flag = false;
            for (int j = i; j < i + window; j++) {
                if (arr[j] < 0) {
                    System.out.print(" " + arr[j] + " ");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(" 0 ");
            }
        }
        System.out.println();
    }
}