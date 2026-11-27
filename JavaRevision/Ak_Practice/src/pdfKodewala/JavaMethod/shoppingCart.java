package pdfKodewala.JavaMethod;

public class shoppingCart
{

	public static void main(String[] args)
	{
		CartCalculate cc = new CartCalculate();
		double total = cc.calculateTotal(234, 3);
		System.out.println(total);

	}

}

class CartCalculate
{
	double calculateTotal(double price, int quantity)
	{
		return price * quantity;
	}
}