package com.string.practice;

public class LogBuilderExperiment {

	private static final int LOG_COUNT = 1000;

	public void runWithStringBuffer() throws InterruptedException {
		StringBuffer buffer = new StringBuffer();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= LOG_COUNT; i++) {
				buffer.append("Thread1 - Log ").append(i).append("\n");
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= LOG_COUNT; i++) {
				buffer.append("Thread2 - Log ").append(i).append("\n");
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("StringBuffer logs length: " + buffer.toString().split("\n").length);
	}

	public void runWithStringBuilder() throws InterruptedException {
		StringBuilder builder = new StringBuilder();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= LOG_COUNT; i++) {
				builder.append("Thread1 - Log ").append(i).append("\n");
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= LOG_COUNT; i++) {
				builder.append("Thread2 - Log ").append(i).append("\n");
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("StringBuilder logs length: " + builder.toString().split("\n").length);
	}
}
