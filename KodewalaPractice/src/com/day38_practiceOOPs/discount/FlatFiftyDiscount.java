package com.day38_practiceOOPs.discount;

import java.math.BigDecimal;

public class FlatFiftyDiscount implements DiscountStrategy {
    private static final BigDecimal THRESHOLD = new BigDecimal("500.00");
    private static final BigDecimal DISCOUNT_VALUE = new BigDecimal("50.00");

    @Override
    public BigDecimal applyDiscount(BigDecimal totalAmount) {
        if (totalAmount != null && totalAmount.compareTo(THRESHOLD) >= 0) {
            return DISCOUNT_VALUE;
        }
        return BigDecimal.ZERO;
    }

    @Override
    public String getStrategyName() {
        return "FLAT50 (Flat ₹50 OFF on orders above ₹500)";
    }
}