package com.day34_oopsRevision.inheritance;


class DeliveryPartner3 {

    void deliver3() {
        System.out.println("Normal Delivery");
    }

    void deliver3(String city) {
        System.out.println("Delivery to " + city);
    }

    void deliver3(String city, int days) {
        System.out.println("Delivery to " + city + " in " + days + " days");
    }
}

public class OverloadingExample {
    public static void main(String[] args) {

        DeliveryPartner3 dp = new DeliveryPartner3();

        dp.deliver3();
        dp.deliver3("Bangalore");
        dp.deliver3("Delhi", 2);
    }
}
