package com.kodewala.task;

public class DriverCustomer {

	public static void main(String[] args) {

		CustomersInfo customer1 = new CustomersInfo("Akshat", 2500, "789652301");
		CustomersInfo customer2 = new CustomersInfo("Amit", 200, "7896530144");
		CustomersInfo customer3 = new CustomersInfo("Ravi", 1999, "745896320");
		CustomersInfo customer4 = new CustomersInfo("Aman", 2000, "7412589630");

		CustomersInfo CustomersInfo[] = new CustomersInfo[4];
		
		CustomersInfo[0] = customer1;
		CustomersInfo[1] = customer2;
		CustomersInfo[2] = customer3;
		CustomersInfo[3] = customer4;

		for (int index = 0; index < CustomersInfo.length; index++) {
			if (CustomersInfo[index].accountBalance < 2000) {
				System.out.println(CustomersInfo[index].cNme);
			}
		}

	}

}
