package com.day38_practiceOOPs.delivery;

import java.math.BigDecimal;

public class DeliveryFeeCalculator {

    // Overload 1: Standard distance-based calculation
    public BigDecimal calculateFee(double distanceKm) {
        return calculateFee(distanceKm, false, BigDecimal.ZERO);
    }

    // Overload 2: Distance + Peak Hour / Surge pricing
    public BigDecimal calculateFee(double distanceKm, boolean isPeakHour) {
        return calculateFee(distanceKm, isPeakHour, BigDecimal.ZERO);
    }

    // Overload 3: Full calculation (Distance + Peak Hour + Festival / Coupon Discount)
    public BigDecimal calculateFee(double distanceKm, boolean isPeakHour, BigDecimal festivalDiscount) {
        if (distanceKm < 0) {
            throw new IllegalArgumentException("Delivery distance cannot be negative.");
        }
        if (festivalDiscount == null || festivalDiscount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Discount cannot be null or negative.");
        }

        // Distance charge: Base Fee + (KM * Rate)
        BigDecimal distanceCharge = BigDecimal.valueOf(distanceKm)
                .multiply(DeliveryPricingConfig.RATE_PER_KM);
        BigDecimal totalFee = DeliveryPricingConfig.BASE_CONVENIENCE_FEE.add(distanceCharge);

        // Apply Surge if Peak Hour
        if (isPeakHour) {
            totalFee = totalFee.add(DeliveryPricingConfig.SURGE_SURCHARGE);
        }

        // Apply Discount (final fee cannot drop below zero)
        totalFee = totalFee.subtract(festivalDiscount);
        return totalFee.compareTo(BigDecimal.ZERO) < 0 ? BigDecimal.ZERO : totalFee;
    }
}