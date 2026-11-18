package com.string.practice;

public class DriverLogBuilderExperiment {

	public static void main(String[] args) throws InterruptedException {
		LogBuilderExperiment experiment = new LogBuilderExperiment();

		System.out.println("=== Running with StringBuffer (Thread-Safe) ===");
		experiment.runWithStringBuffer();

		System.out.println("=== Running with StringBuilder (Not Thread-Safe) ===");
		experiment.runWithStringBuilder();
	}
}
