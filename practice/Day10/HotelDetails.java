class HotelDetails {
    private double roomRentPerNight = 2400.0;
    private double gstPercent = 12.0;

    public void bookRoom(String guestName, int nights) {
        double basePrice = roomRentPerNight * nights;
        double tax = (basePrice * gstPercent) / 100.0;
        double grandTotal = basePrice + tax;

        System.out.println("Guest Name: " + guestName);
        System.out.println("Nights: " + nights);
        System.out.println("Base Rent: Rs. " + basePrice);
        System.out.println("GST (12%): Rs. " + tax);
        System.out.println("Grand Total: Rs. " + grandTotal);
    }
}