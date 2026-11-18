class MovieTicketDetails
{
	private int ticketPrice= 490;
	
	public void bookTickets(String movieName, int seats){
		int totalCost = ticketPrice * seats ;
		
		System.out.println("Movie: " + movieName);
		
        System.out.println("Tickets Booked: " + seats);
		
        System.out.println("Price per Ticket: Rs. " + ticketPrice);
        
		System.out.println("Total Amount: Rs. " + totalCost);
    
	}
}