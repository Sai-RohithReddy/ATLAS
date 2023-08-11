public class Demo {
    int temp = 10;
    public void display() {
        int temp = 50;
        System.out.println("Value of temp variable in mentod is: " + temp);
    }
    public static void main(String[] args) {
        Demo d = new Demo();

        d.display();
        System.out.println("Value of temp variable globally is: " + d.temp);
    }
}