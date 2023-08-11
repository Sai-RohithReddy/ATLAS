package DesignPatterns;

//Builder Pattern

class Product {
    private String property1;
    private int property2;
    private boolean property3;

    Product(String property1, int property2, boolean property3) {
        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
    }

    public String getProduct1() {
        return this.property1;
    }

    public int getProduct2() {
        return this.property2;
    }

    public boolean getProduct3() {
        return this.property3;
    }
}

class ProductBuilder {
    private String property1;
    private int property2;
    private boolean property3;

    public ProductBuilder setProperty1(String property1) {
        this.property1 = property1;
        return this;
    }

    public ProductBuilder setProperty2(int property2) {
        this.property2 = property2;
        return this;
    }

    public ProductBuilder setProperty3(boolean property3) {
        this.property3 = property3;
        return this;
    }

    public Product build() {
        return new Product(property1, property2, property3);
    }

}

public class BuilderPattern {
    public static void main(String args[]) {
        Product product = new ProductBuilder()
                .setProperty1("String")
                .setProperty2(1)
                .setProperty3(true)
                .build();
                
        System.out.println(product.getProduct1());
        System.out.println(product.getProduct2());
        System.out.println(product.getProduct3());
    }
}
