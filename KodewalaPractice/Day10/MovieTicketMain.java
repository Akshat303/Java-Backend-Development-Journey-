class MovieTicketMain
{
	public static void main(String [] args)
	{
		int numberOfSeats = Integer.parseInt(args[0]);
		
		MovieTicketDetails booking = new MovieTicketDetails();
        booking.bookTickets("Interstellar", numberOfSeats);
		
		
	}
}