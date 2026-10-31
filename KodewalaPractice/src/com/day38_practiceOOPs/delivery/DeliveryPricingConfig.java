package com.day38_practiceOOPs.delivery;

import java.math.BigDecimal;

public final class DeliveryPricingConfig {
    private DeliveryPricingConfig() {} // Non-instantiable utility/config class

    public static final BigDecimal BASE_CONVENIENCE_FEE = new BigDecimal("20.00");
    public static final BigDecimal RATE_PER_KM = new BigDecimal("10.00");
    public static final BigDecimal SURGE_SURCHARGE = new BigDecimal("35.00");
}