package pdfKodewala.JavaMethod;

public class Practice
{

	public static void main(String[] args)
	{

		DeliveryService service = new DeliveryService();

		double fee1 = service.calculateDeliveryFee(3);
		double fee2 = service.calculateDeliveryFee(8);
		System.out.println(fee1);
		System.out.println(fee2);

	}

}

class DeliveryService
{
	double calculateDeliveryFee(double distance)
	{
		double fee;

		if (distance <= 5)
		{
			fee = 30;
		}
		else
		{
			fee = 30 + (distance - 5) * 10;
		}

		return fee;
	}
}