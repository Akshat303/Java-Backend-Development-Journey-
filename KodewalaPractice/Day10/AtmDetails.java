class AtmDetails {
    private int userPin = 1234;
    private double balance = 10000.0;

    public void withdraw(int enteredPin, double withdrawAmount) {
        if (enteredPin != userPin) {
            System.out.println("Error: Invalid Security PIN!");
            return;
        }

        if (withdrawAmount > balance) {
            System.out.println("Error: Insufficient Funds! Current Balance: Rs. " + balance);
            return;
        }

        balance = balance - withdrawAmount;
        System.out.println("Withdrawal Successful: Rs. " + withdrawAmount);
        System.out.println("Remaining Balance: Rs. " + balance);
    }
}