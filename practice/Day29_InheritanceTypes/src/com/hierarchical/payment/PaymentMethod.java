package com.hierarchical.payment;

public abstract class PaymentMethod {

    private final String accountHolder;
    private final double amount;

    public PaymentMethod(String accountHolder,
                         double amount) {

        validateAccountHolder(accountHolder);
        validateAmount(amount);

        this.accountHolder = accountHolder;
        this.amount = amount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void processPayment();

    protected static void validateAccountHolder(
            String accountHolder) {

        if (accountHolder == null
                || accountHolder.isBlank()) {

            throw new IllegalArgumentException(
                    "Account holder cannot be empty");
        }
    }

    protected static void validateAmount(
            double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive");
        }
    }
}