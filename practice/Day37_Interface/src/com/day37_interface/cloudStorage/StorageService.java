package com.day37_interface.cloudStorage;

public interface StorageService {
	// Java 7: implicitly public abstract
	void upload(String fileName, double fileSizeInMB);

	double getRemainingSpace();
}