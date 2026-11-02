package com.day34_oopsRevision.inheritance;

class DeliveryPartner2 {

    void deliver() {
        System.out.println("Delivery Partner Delivering Order");
    }
}

class XpressBee2 extends DeliveryPartner2 {

    @Override
    void deliver() {
        System.out.println("XpressBee Delivering Order");
    }
}

class Ecart2 extends DeliveryPartner2 {

    @Override
    void deliver() {
        System.out.println("Ecart Delivering Order");
    }
}

public class OverridingExample {
    public static void main(String[] args) {

        XpressBee2 x = new XpressBee2();
        x.deliver();

        Ecart2 e = new Ecart2();
        e.deliver();
    }
}


