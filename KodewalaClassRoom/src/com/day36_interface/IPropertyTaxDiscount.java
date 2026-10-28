package com.day36_interface;

public interface IPropertyTaxDiscount extends IDiscount {
	public abstract void calculatPropDisc();

	void calculateDiscountTax(int tax, String type);
}
