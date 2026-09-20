class FoodOrderMain {
    public static void main(String[] args) {
        FoodOrderDetails order = new FoodOrderDetails();
        
        System.out.println("--- Order 1 ---");
        order.placeFoodOrder("Pizza Hub", 350);
        
        System.out.println("\n--- Order 2 ---");
        order.placeFoodOrder("Biryani Corner", 650);
    }
}