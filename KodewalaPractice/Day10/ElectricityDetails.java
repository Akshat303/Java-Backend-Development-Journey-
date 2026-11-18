class ElectricityDetails {
    private double ratePerUnit = 7.5;
    private double fixedCharge = 150.0;

    public void calculateBill(String consumerNo, int units) {
        double unitCharges = units * ratePerUnit;
        double totalBill = unitCharges + fixedCharge;

        System.out.println("Consumer Number: " + consumerNo);
        System.out.println("Units Consumed: " + units);
        System.out.println("Unit Charges: Rs. " + unitCharges);
        System.out.println("Fixed Meter Charge: Rs. " + fixedCharge);
        System.out.println("Total Amount Due: Rs. " + totalBill);
    }
}