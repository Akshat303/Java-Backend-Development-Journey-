package com.day38_practiceOOPs.discount;

import java.math.BigDecimal;

public class NoDiscount implements DiscountStrategy {
    @Override
    public BigDecimal applyDiscount(BigDecimal totalAmount) {
        return BigDecimal.ZERO;
    }

    @Override
    public String getStrategyName() {
        return "No Discount";
    }
}