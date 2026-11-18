package com.day34_35_practiceOOPs.discount;

import java.math.BigDecimal;

public interface DiscountStrategy {
    BigDecimal applyDiscount(BigDecimal totalAmount);
    String getStrategyName();
}