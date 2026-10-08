package com.practice.string;

public class ProductNameProcessor {

	private String brand;
	private String model;
	private String series;

	public ProductNameProcessor(String brand, String model, String series) {
		this.brand = brand;
		this.model = model;
		this.series = series;
	}

	// Build product name using +
	public String buildUsingPlus() {
		return brand + " " + model + " " + series;
	}

	// Build product name using concat()
	public String buildUsingConcat() {
		return brand.concat(" ").concat(model).concat(" ").concat(series);
	}

	// Convert product name to uppercase
	public String convertToUpperCase(String productName) {
		return productName.toUpperCase();
	}

	// Replace Pro with Air
	public String replaceProWithAir(String productName) {
		return productName.replace("Pro", "Air");
	}

	// Compare two Strings using ==
	public boolean compareUsingDoubleEquals(String s1, String s2) {
		return s1 == s2;
	}

	// Compare two Strings using equals()
	public boolean compareUsingEquals(String s1, String s2) {
		return s1.equals(s2);
	}

	// Create another String object using new String()
	public String createNewString(String productName) {
		return new String(productName);
	}

	// Print identity hash code
	public int getIdentityHashCode(String productName) {
		return System.identityHashCode(productName);
	}
}