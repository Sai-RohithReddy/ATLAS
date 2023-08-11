package Calculator;

public class Calculate {
    public static void main(String[] args) {
        Mathh math = new Mathh();
        TestCalculator test = new TestCalculator();

        int num1 = 100;
        int num2 = 10;

        int sumOfNums = math.add(num1, num2);
        int multipleOfNums = math.multiply(num1, num2);
        int subtractOfNums = math.subtract(num1, num2);
        int divisionOfNums = math.divide(num1, num2);

        System.out.println(sumOfNums);
        System.out.println(multipleOfNums);
        System.out.println(subtractOfNums);
        System.out.println(divisionOfNums);

        System.out.println("---------------------------");

        System.out.println(test.testAdd(sumOfNums, 110));
        System.out.println(test.testMul(multipleOfNums, 1000));
        System.err.println(test.testSub(subtractOfNums, 110));
        System.err.println(test.testDiv(divisionOfNums, 10));
    }
}
