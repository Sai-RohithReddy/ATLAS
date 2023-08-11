package FindArea;

public class Main {
    public static void main(String[] args) {
        CalculateArea circle = new Circle(22);
        CalculateArea rectangle = new Rectangle(5, 10);
        
        circle.calculateArea(); 
        rectangle.calculateArea();
    }
}
