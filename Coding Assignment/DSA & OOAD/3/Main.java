public class Main {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        inventorySystem.addItem("mobile", 123, 50000.0, 10);
        inventorySystem.addItem("tv", 333, 100000.0, 5);
        inventorySystem.addItem("ac", 555, 550000.0, 3);
        inventorySystem.addItem("tab", 999, 20000.0, 2);
        inventorySystem.addItem("oven", 888, 5000.0, 1);
        
        inventorySystem.recordSale("tv", 2);
        inventorySystem.recordSale("mobile", 5);
        inventorySystem.recordSale("tab", 5);
        inventorySystem.recordSale("oven", 2);

        inventorySystem.generateReport();

        inventorySystem.restockAlert();

    }
}
