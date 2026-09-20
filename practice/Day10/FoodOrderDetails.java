class FoodOrderDetails {
    private int freeDeliveryThreshold = 500;
    private int standardDeliveryFee = 40;

    public void placeFoodOrder(String restaurantName, int foodBill) {
        int deliveryCharge = (foodBill >= freeDeliveryThreshold) ? 0 : standardDeliveryFee;
        int finalTotal = foodBill + deliveryCharge;

        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Food Cost: Rs. " + foodBill);
        System.out.println("Delivery Fee: Rs. " + deliveryCharge);
        System.out.println("Final Bill: Rs. " + finalTotal);
    }
}