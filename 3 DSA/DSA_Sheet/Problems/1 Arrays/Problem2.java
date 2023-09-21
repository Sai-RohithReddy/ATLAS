class Pair {
    public int min = Integer.MAX_VALUE;
    public int max = Integer.MIN_VALUE;
}

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Pair minMax = findMaxAndMin(arr);
        System.out.println("Minimum valie is: " + minMax.min);
        System.out.println("Maximun value is: " + minMax.max);
    }

    public static Pair findMaxAndMin(int[] arr) {

        Pair pair = new Pair();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > pair.max) {
                pair.max = arr[i];
            }
            if (arr[i] < pair.min) {
                pair.min = arr[i];
            }
        }
        return pair;
    }
}
