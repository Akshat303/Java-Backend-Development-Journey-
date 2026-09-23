package com.kodewala.product;

public class ProductDriver {
	public static void main(String[] args) {

		String productName = args[0];
		int productPrice = Integer.parseInt(args[1]);
		String productDescription = args[2];
		int productQuentity = Integer.parseInt(args[3]);

		ProductInfo productDetail = new ProductInfo();
		System.out.println("Default cons");

		ProductInfo newProductDetail = new ProductInfo(productName, productPrice, productDescription, productQuentity);

		System.out.println(newProductDetail.productName + "\n" + newProductDetail.productPrice + "\n"
				+ newProductDetail.productDescription + "\n" + newProductDetail.productQuentity);

		ProductInfo newProductDetail2 = new ProductInfo(productName, productDescription);
		System.out.println(newProductDetail2.productName + "\n" + newProductDetail2.productDescription);

	}

}
