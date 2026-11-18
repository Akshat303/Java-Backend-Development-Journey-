class InventoryMain {
    public static void main(String[] args) {
        InventoryDetails inventory = new InventoryDetails();
        inventory.checkStock("Wireless Keyboard");
        
        // Directly accessible because both files are in the same package
        System.out.println("Direct stock read from Main: " + inventory.warehouseStock);
    }
}