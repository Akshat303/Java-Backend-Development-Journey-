package com.hierarchical.payment;

public class NetBankingPayment
        extends PaymentMethod {

    private final String bankName;

    public NetBankingPayment(String accountHolder,
                             double amount,
                             String bankName) {

        super(accountHolder, amount);

        validateBankName(bankName);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public void processPayment() {

        System.out.println(
                "Processing Net Banking Payment of ₹"
                        + getAmount()
                        + " for "
                        + getAccountHolder()
                        + " through "
                        + bankName);
    }

    private static void validateBankName(
            String bankName) {

        if (bankName == null
                || bankName.isBlank()) {

            throw new IllegalArgumentException(
                    "Bank name cannot be empty");
        }
    }
}