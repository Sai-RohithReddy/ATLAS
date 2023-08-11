package Strategy2;

import java.util.ArrayList;
import java.util.List;

interface DiscountStrategy {
    double applyDiscount(List<Item> items);
}

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class NoDiscountStrategy implements DiscountStrategy {
    
    public double applyDiscount(List<Item> items) {
        return getTotalPrice(items);
    }

    private double getTotalPrice(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

class PercentageDiscountStrategy implements DiscountStrategy {
    private double discountPercentage;

    public PercentageDiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    
    public double applyDiscount(List<Item> items) {
        double totalPrice = getTotalPrice(items);
        return totalPrice * (1 - (discountPercentage / 100));
    }

    private double getTotalPrice(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

class FixedDiscountStrategy implements DiscountStrategy {
    private double discountAmount;

    public FixedDiscountStrategy(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    
    public double applyDiscount(List<Item> items) {
        double totalPrice = getTotalPrice(items);
        return totalPrice - discountAmount;
    }

    private double getTotalPrice(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

class ShoppingCart {
    private List<Item> items;
    private DiscountStrategy discountStrategy;

    public ShoppingCart() {
        items = new ArrayList<>();
        discountStrategy = new NoDiscountStrategy(); 
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotalAmount() {
        return discountStrategy.applyDiscount(items);
    }
}

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Shirt", 25.0);
        Item item2 = new Item("Shoes", 50.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);

        System.out.println("Total amount without discount: Rs." + cart.calculateTotalAmount());

        cart.setDiscountStrategy(new PercentageDiscountStrategy(10)); 
        System.out.println("Total amount with 10% discount: Rs." + cart.calculateTotalAmount());

        cart.setDiscountStrategy(new FixedDiscountStrategy(15)); 
        System.out.println("Total amount with 15rs dicount: Rs." + cart.calculateTotalAmount());
    }
}
