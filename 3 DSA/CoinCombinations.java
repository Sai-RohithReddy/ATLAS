import java.util.Scanner;

public class CoinCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        System.out.println("All combinations for " + N + ":");
        printCombinations(N, "");
    }

    private static void printCombinations(int N, String combination) {
        if (N == 0) {
            System.out.println(combination);
            return;
        }

        if (N >= 1) {
            printCombinations(N - 1, combination + "1");
        }
        if (N >= 2) {
            printCombinations(N - 2, combination + "2");
        }
        if (N >= 3) {
            printCombinations(N - 3, combination + "3");
        }
    }
}
