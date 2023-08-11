public class SwapInt {
    public static void main(String[] args) {
        int i = 1, j = 2,
            a = 1, b = 2; 

        i = i - j;
        j = j + i;
        i = j - i;

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println(i +" "+j + "\n" + a + " " + b);
    }
}
