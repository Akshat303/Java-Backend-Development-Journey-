package com.day36.interface1;

public interface IPropertyTaxDiscount extends IDiscount {
	public abstract void calculatPropDisc();

	void calculateDiscountTax(int tax, String type);
}
