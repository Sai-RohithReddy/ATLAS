package FindArea;

class Rectangle implements CalculateArea{
    int width;
    int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void calculateArea() {
        int area = width * height;
        System.out.println("Aread of rectange is: " + area);
    }
}