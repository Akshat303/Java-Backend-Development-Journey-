class OrderDetails {
	public static void main(String args[]){
		
	String orderId = args[0];
	String productname = args[1];
	String placeBy = args[2];
	String deliveryAddress = args[3];
	
	System.out.println(orderId);
	System.out.println(productname);
	System.out.println(placeBy);
	System.out.println(deliveryAddress);
	
	}
}

/* 
ORD11234 
iPhone16 
Kodewala 
"2nd stage BTM Layout, Bangalore"
 */
 
 
 class MyOrderDetails {
	public static void main(String args[]){
		
	String orderId = args[0];
	String productname = args[1];
	String placeBy = args[2];
	String deliveryAddress = args[3];
	
	System.out.println ("Order Id " + orderId);
	System.out.println ("Product Name " + productname);
	System.out.println ("Place By " + placeBy);
	System.out.println ("Delivery Address " + deliveryAddress);
	}
}