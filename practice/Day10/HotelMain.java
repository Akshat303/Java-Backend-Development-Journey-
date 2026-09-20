class HotelMain {
    public static void main(String[] args) {
		
		int numberOfNights = Integer.parseInt(args[0]);
        HotelDetails booking = new HotelDetails();
        booking.bookRoom("Akshat Srivastava", numberOfNights);
    }
}