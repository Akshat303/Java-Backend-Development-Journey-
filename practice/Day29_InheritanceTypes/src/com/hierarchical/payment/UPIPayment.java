package com.hierarchical.payment;

public class UPIPayment extends PaymentMethod {

    private final String upiId;

    public UPIPayment(String accountHolder,
                      double amount,
                      String upiId) {

        super(accountHolder, amount);

        validateUpiId(upiId);
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    @Override
    public void processPayment() {

        System.out.println(
                "Processing UPI Payment of ₹"
                        + getAmount()
                        + " for "
                        + getAccountHolder()
                        + " using UPI ID: "
                        + upiId);
    }

    private static void validateUpiId(String upiId) {

        if (upiId == null || upiId.isBlank()) {

            throw new IllegalArgumentException(
                    "UPI ID cannot be empty");
        }
    }
}