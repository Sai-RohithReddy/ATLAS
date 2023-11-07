import java.util.ArrayList;

public class InventorySystem {
    ArrayList<Inventory> inventoryes;
    ArrayList<Order> orders;

    public InventorySystem() {
        inventoryes = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addItem(String productName, Integer productId, double price, int quantity) {
        Inventory inventory = new Inventory();
        inventory.setProduct(productName, productId);
        inventory.setPrice(price);
        inventoryes.add(inventory);
        inventory.setQuantity(quantity);
    }

    public void recordSale(String name, int quantity) {
        Order order = new Order();
        order.setQuantity(quantity);
        order.setProductName(name);
        orders.add(order);
    }

    public void generateReport() {
        System.out.println("\nTotal items in Inventory are:");
        System.out.println("-----------------------------");
        for(Inventory inventory : inventoryes) {
            String product = inventory.getProduct().toString();
            String productName = product.substring(1, product.indexOf("="));
            String productId = product.substring(product.indexOf("=") + 1, product.length() - 1);
            double price = inventory.getPrice();
            int quantity = inventory.getQuantity();
            System.out.println("Product Name: " + productName + ", Product Id: " + productId + ", Price: " + price + ", Quantity: " + quantity);
        }
        System.out.println("\n\nTotal number of orders in Orders List are:");
        System.out.println("------------------------------------------");
        for (Order order : orders) {
            String productName = order.getProductName();
            int quantity = order.getQuantity();
            System.out.println("Product Name: " + productName + ", Ordered Quantity: " + quantity);
        }
        System.out.println();
    }

    public void restockAlert() {
        for (Order order : orders) {
            for (Inventory inventory : inventoryes) {
                if (inventory.getProduct().containsKey(order.getProductName())) {
                    int currentQuantity = inventory.getQuantity();
                    int orderedQuantity = order.getQuantity();
                    if (currentQuantity < orderedQuantity) {
                        System.out.println("RESTOCK ALERT:");
                        System.out.println("-------------");
                        String productName = order.getProductName();
                        System.out.println("Res stock " + (orderedQuantity - currentQuantity) + " " + productName + " to inventory to complete order");
                        System.out.println("Current Exitsting Quantity is: " + currentQuantity + " Ordered Quantity is: " + orderedQuantity);
                        System.out.println();
                    }
                }
            }
        }
    }
}
