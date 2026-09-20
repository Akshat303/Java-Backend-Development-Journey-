class ProductDetails {
    private double originalPrice = 1200.0;

    public void applyDiscount(int discountPercent) {
        double discountAmount = (originalPrice * discountPercent) / 100.0;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("Original Price: Rs. " + originalPrice);
        System.out.println("Discount (" + discountPercent + "%): Rs. " + discountAmount);
        System.out.println("Final Payable: Rs. " + finalPrice);
    }
}
