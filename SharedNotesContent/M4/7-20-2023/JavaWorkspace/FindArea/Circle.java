package FindArea;

class Circle implements CalculateArea{
    int radius;
    double pi = 3.14;
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = pi * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}