package com.practice.string;

public class DriverProductNameProcessor {

	public static void main(String[] args) {

		String brand = "Apple";
		String model = "MacBook";
		String series = "Pro";

		ProductNameProcessor processor = new ProductNameProcessor(brand, model, series);

		// 1. Build product name using +
		String productNamePlus = processor.buildUsingPlus();

		System.out.println("Product Name using + : " + productNamePlus);

		// 2. Build product name using concat()
		String productNameConcat = processor.buildUsingConcat();

		System.out.println("Product Name using concat() : " + productNameConcat);

		// 3. Convert product name to uppercase
		String upperCaseName = processor.convertToUpperCase(productNamePlus);

		System.out.println("Uppercase Product Name : " + upperCaseName);

		// 4. Replace Pro with Air
		String modifiedProductName = processor.replaceProWithAir(productNamePlus);

		System.out.println("Modified Product Name : " + modifiedProductName);

		// 5. Compare original and modified product names
		System.out.println(
				"Original == Modified : " + processor.compareUsingDoubleEquals(productNamePlus, modifiedProductName));

		System.out.println(
				"Original equals Modified : " + processor.compareUsingEquals(productNamePlus, modifiedProductName));

		// 6. Check whether original product name changed
		System.out.println("Original Product Name : " + productNamePlus);

		// Original is still Apple MacBook Pro
		// because String is immutable.

		// 7. Print identity hash codes
		System.out.println("Original Identity HashCode : " + processor.getIdentityHashCode(productNamePlus));

		System.out.println("Modified Identity HashCode : " + processor.getIdentityHashCode(modifiedProductName));

		// 8. Create another identical String using new String()
		String anotherProductName = processor.createNewString(productNamePlus);

		System.out.println("Another Product Name : " + anotherProductName);

		// 9. Compare using ==
		System.out.println(
				"Original == Another : " + processor.compareUsingDoubleEquals(productNamePlus, anotherProductName));

		// 10. Compare using equals()
		System.out.println(
				"Original equals Another : " + processor.compareUsingEquals(productNamePlus, anotherProductName));

		// 11. Identity hash code of new String object
		System.out.println("Another Identity HashCode : " + processor.getIdentityHashCode(anotherProductName));
	}
}
