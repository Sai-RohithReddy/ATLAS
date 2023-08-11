public class AddTwoNum {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int totSale = 0;
        int customersVisited = 10;

        // Calculating sum of two numbers
        int resSum = addTwoNum(num1, num2);
        System.out.println("Sum of " + num1 + " + " + num2 + " = " + resSum);

        int avgSales = averageSales(customersVisited, totSale);
        System.out.println(avgSales);
    }
    public static int addTwoNum(int num1, int num2) {
        // Function returns sum of two numbers (int)
        return (num1 + num2);
    }
    public static int averageSales(int customersVisited, int totalSale) {
        // Function returns average of total sales per customer (int)
        int result;

        try {
            // Handling ArthemeticExceptions
            result = (totalSale / customersVisited);
        } catch (Exception e) {
            result = 0;
        }
        return result;
    }
}