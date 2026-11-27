package pdfKodewala.JavaMethod;

public class SendEmailQuestion
{

	public static void main(String[] args)
	{
		EmailService service = new EmailService();

		service.sendEmail("akshat@example.com", "Welcome to Java Backend Development");
	}

}

class EmailService
{
	void sendEmail(String recipient, String message)
	{
		System.out.println("Sending email to: " + recipient);
		System.out.println("Message: " + message);
		System.out.println("Email sent successfully!");
	}
}