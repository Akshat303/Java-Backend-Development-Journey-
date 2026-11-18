class InventoryDetails {
    int warehouseStock = 120; // Default access 

    void checkStock(String item) { // Default method
        System.out.println("Checking item: " + item);
        System.out.println("Current Stock Available: " + warehouseStock);
    }
}