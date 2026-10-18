package com.hierarchical.payment;

public class CardPayment extends PaymentMethod {

    private final String lastFourDigits;

    public CardPayment(String accountHolder,
                       double amount,
                       String lastFourDigits) {

        super(accountHolder, amount);

        validateLastFourDigits(lastFourDigits);
        this.lastFourDigits = lastFourDigits;
    }

    public String getLastFourDigits() {
        return lastFourDigits;
    }

    @Override
    public void processPayment() {

        System.out.println(
                "Processing Card Payment of ₹"
                        + getAmount()
                        + " for "
                        + getAccountHolder()
                        + " using card ending with "
                        + lastFourDigits);
    }

    private static void validateLastFourDigits(
            String lastFourDigits) {

        if (lastFourDigits == null
                || !lastFourDigits.matches("\\d{4}")) {

            throw new IllegalArgumentException(
                    "Card must contain exactly 4 digits");
        }
    }
}