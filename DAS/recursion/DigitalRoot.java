package recursion;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digitalRoot(8426693));
    }
    public static int digitalRoot(int n)
    {
        if (n < 10) {
            return n;
        }
        return (getDigitSum(getDigitSum(n)));
    }
    public static int getDigitSum(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + getDigitSum(n / 10); 
    }
}
