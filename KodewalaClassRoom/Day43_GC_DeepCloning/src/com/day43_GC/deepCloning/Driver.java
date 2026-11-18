package com.day43_GC.deepCloning;

public class Driver {

	static Address address;
	static Employee emp1;
	static Employee clonedEmp;

	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("Driver.main()");

		address = new Address("16th Main", "27th Cross", "Bangalore");

		emp1 = new Employee("Kodewala", "kw123", address);

		clonedEmp = (Employee) emp1.clone();

		emp1.address.city = "Hyd";

//		System.out.println(emp1.address.city);
//		System.out.println(clonedEmp.address.city);
		System.out.println(emp1);
		
		emp1 = null;
		clonedEmp = null;
		
		System.out.println(emp1);
		
	}

}
