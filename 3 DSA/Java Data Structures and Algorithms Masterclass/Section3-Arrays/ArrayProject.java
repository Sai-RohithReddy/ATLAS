import java.util.Scanner;

public class ArrayProject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many day's temperature?");
        int numDays = in.nextInt();
        int[] daysTemp = new int[numDays];
        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.println("Day " + (i + 1) + "'s temperatur: ");
           daysTemp[i] = in.nextInt();
            sum += daysTemp[i];
        }

        double avgTemp = sum / numDays;
        System.out.println("\nAverage temp: " + avgTemp);

        int tempGraterThanAvgCount = 0;

        for (int temp : daysTemp) {
            if (temp > avgTemp) tempGraterThanAvgCount ++;
        }

        System.out.println(tempGraterThanAvgCount + " days above average");

        in.close();
    }
}