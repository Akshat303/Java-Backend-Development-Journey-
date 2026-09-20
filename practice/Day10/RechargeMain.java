class RechargeMain {
    public static void main(String[] args) {
        RechargeDetails recharge = new RechargeDetails();
        recharge.processRecharge(9876501234L, 299);
        System.out.println("---");
        recharge.processRecharge(9874563210L, 99);
    }
}