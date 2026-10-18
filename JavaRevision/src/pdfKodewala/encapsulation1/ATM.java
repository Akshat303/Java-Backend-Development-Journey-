package pdfKodewala.encapsulation1;


public class ATM {

    private double balance;
    private String pin;

    public ATM(double balance, String pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public boolean deposit(double amount, String enteredPin) {
        if (!pin.equals(enteredPin)) {
            System.out.println("Incorrect PIN");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount");
            return false;
        }

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (!pin.equals(enteredPin)) {
            System.out.println("Incorrect PIN");
            return false;
        }

        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid amount or insufficient balance");
            return false;
        }

        balance -= amount;
        return true;
    }

    public double getBalance(String enteredPin) {
        if (pin.equals(enteredPin)) {
            return balance;
        }

        System.out.println("Incorrect PIN");
        return -1;
    }
}
