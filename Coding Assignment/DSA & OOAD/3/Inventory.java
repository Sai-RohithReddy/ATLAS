import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> product;
    private double price;
    private int quantity;

    public Inventory() {
        this.product = new HashMap<>();
        this.price = 0.0;
        this.quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Map<String, Integer> getProduct() {
        return product;
    }

    public void setProduct(String productName, Integer productId) {
        this.product.put(productName, productId);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}