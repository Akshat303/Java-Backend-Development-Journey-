package com.day38_practiceOOPs.discount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentageDiscount implements DiscountStrategy {
    private final BigDecimal percentage;
    private final BigDecimal maxCap;

    public PercentageDiscount(double percentage, BigDecimal maxCap) {
        if (percentage <= 0 || percentage > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100.");
        }
        if (maxCap == null || maxCap.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Maximum cap must be greater than zero.");
        }
        this.percentage = BigDecimal.valueOf(percentage);
        this.maxCap = maxCap;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal totalAmount) {
        if (totalAmount == null || totalAmount.compareTo(BigDecimal.ZERO) <= 0) {
            return BigDecimal.ZERO;
        }

        // discount = (total * percentage) / 100
        BigDecimal calculated = totalAmount.multiply(percentage)
                .divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);

        // Cap discount if it exceeds max allowed limit
        return calculated.compareTo(maxCap) > 0 ? maxCap : calculated;
    }

    @Override
    public String getStrategyName() {
        return percentage + "% OFF (Capped up to ₹" + maxCap + ")";
    }
}