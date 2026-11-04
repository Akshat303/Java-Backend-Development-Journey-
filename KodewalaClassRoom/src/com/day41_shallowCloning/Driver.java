package com.day41_shallowCloning;

public class Driver {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("Btm", "Phase1", "Bangalore");
		
		Employee emp1 = new Employee("Kodewala", "KW123", address);
		
		Employee cloneEmp = (Employee) emp1.clone();
		
		emp1.address.city ="HYD";
		
		System.out.println(emp1.address.city);
		System.out.println(cloneEmp.address.city);
		
		
	}

}
