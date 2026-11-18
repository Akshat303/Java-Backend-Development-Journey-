class VehicleDetails {
    private int maxSafeSpeed = 80;

    public void recordSpeed(String vehicleNumber, int currentSpeed) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Current Speed: " + currentSpeed + " km/h");
        
        if (currentSpeed > maxSafeSpeed) {
            System.out.println("Alert: OVERSPEEDING! Maximum speed limit is " + maxSafeSpeed + " km/h.");
        } else {
            System.out.println("Status: Within safe speed limit.");
        }
    }
}