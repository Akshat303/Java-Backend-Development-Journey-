package com.day38_practiceOOPs.discount;

import java.math.BigDecimal;

public interface DiscountStrategy {
    BigDecimal applyDiscount(BigDecimal totalAmount);
    String getStrategyName();
}