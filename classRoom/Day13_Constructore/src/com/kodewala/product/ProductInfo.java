package com.kodewala.product;

public class ProductInfo {
	String productName;
	int productPrice;
	String productDescription;
	int productQuentity;

	ProductInfo() {

	}

	ProductInfo(String _productName, int _productPrice, String _productDescription, int _productQuentity) {

		this.productName = _productName;
		this.productPrice = _productPrice;
		this.productDescription = _productDescription;
		this.productQuentity = _productQuentity;
	}

	ProductInfo(String _productName, String _productDescription) {
		this.productName = _productName;
		this.productDescription = _productDescription;
	}

}
