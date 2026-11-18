package com.day41_deepCloning;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("16th Main", "27th Cross", "Bangalore");
		
		Employee emp1 = new Employee("Kodewala", "kw123", address);
		
		Employee clonedEmp =  (Employee) emp1.clone();
		
		emp1.address.city = "Hyd";
		
		System.out.println(emp1.address.city);
		System.out.println(clonedEmp.address.city);
	}

}
