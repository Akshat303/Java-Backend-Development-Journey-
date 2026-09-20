class AccountDetails {
    public double balance = 5000.0;

    public void deposit(double amount) {
        System.out.println("Depositing: Rs. " + amount);
        balance = balance + amount;
        System.out.println("Updated Account Balance: Rs. " + balance);
    }
}