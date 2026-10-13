package com.practice.objectBlock;

public class ApplicationService {

	// Static members
	private static String applicationName;
	private static int serviceCount;

	// Instance members
	private String serviceName;
	private int instanceNumber;

	// Static block
	static {
		applicationName = "EnterpriseApp";
		serviceCount = 0;
		System.out.println("Application configuration loaded");
	}

	// Instance initialization block (IIB)
	{
		serviceCount++;
		instanceNumber = serviceCount;
		System.out.println("Service instance initialized: " + instanceNumber);
	}

	// Constructor
	public ApplicationService(String serviceName) {
		this.serviceName = serviceName;
		System.out.println("Service constructor executed");
	}

	// Display method
	public void displayService() {
		System.out.println("Application: " + applicationName + ", Service: " + serviceName + ", Instance Number: "
				+ instanceNumber);
	}

	// Static method to show total services
	public static void displayTotalServices() {
		System.out.println("Total Services: " + serviceCount);
	}
}
