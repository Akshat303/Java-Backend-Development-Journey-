class AtmMain {
    public static void main(String[] args) {
        AtmDetails atm = new AtmDetails();

        System.out.println("--- Attempt 1 (Wrong PIN) ---");
        atm.withdraw(9999, 2000.0);

        System.out.println("\n--- Attempt 2 (Valid PIN & Amount) ---");
        atm.withdraw(1234, 3000.0);

        System.out.println("\n--- Attempt 3 (Over Limit) ---");
        atm.withdraw(1234, 15000.0);
    }
}