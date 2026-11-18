package com.day37_interface.cloudStorage;

public class GoogleDriveService implements StorageService {
	// 15 GB total storage converted to Megabytes (15 * 1024 MB)
	private static final double TOTAL_STORAGE_MB = 15360.0;

	private double usedStorageMB;

	public GoogleDriveService() {
		this.usedStorageMB = 0.0;
	}

	@Override
	public void upload(String fileName, double fileSizeInMB) {
		// Validation 1: Negative or zero file size
		if (fileSizeInMB <= 0) {
			System.out.println("Upload Failed: File \"" + fileName + "\" size must be greater than 0 MB.");
			return;
		}

		// Validation 2: Check available remaining capacity
		double availableSpace = getRemainingSpace();
		if (fileSizeInMB > availableSpace) {
			System.out.println("Upload Failed [Storage Full]: Cannot upload \"" + fileName + "\" (" + fileSizeInMB
					+ " MB). Available space is only " + availableSpace + " MB.");
			return;
		}

		// Deduct space by adding to used storage
		usedStorageMB += fileSizeInMB;
		System.out.println("Upload Successful: \"" + fileName + "\" (" + fileSizeInMB + " MB) uploaded.");
		System.out.println("Remaining Free Storage: " + getRemainingSpace() + " MB.");
	}

	@Override
	public double getRemainingSpace() {
		return TOTAL_STORAGE_MB - usedStorageMB;
	}

	public double getUsedStorageMB() {
		return usedStorageMB;
	}
}