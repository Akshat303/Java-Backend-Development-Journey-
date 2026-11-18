class RechargeDetails {
    private int minimumPlan = 199;

    public void processRecharge(long mobileNumber, int amount) {
        System.out.println("Target Mobile Number: " + mobileNumber);
        if (amount >= minimumPlan) {
            System.out.println("Recharge of Rs. " + amount + " successful!");
        } else {
            System.out.println("Failed! Minimum recharge amount must be Rs. " + minimumPlan);
        }
    }
}