package com.day40_serialization;


public class Driver {

    public static void main(String[] args) throws CloneNotSupportedException {

        Account acc1 =new Account("Kodewala Academy","BTM Bangalore", "78653241456");

        Account clonedObjOfAcc = (Account) acc1.clone(); // xerox / copy

        System.out.println(clonedObjOfAcc.accNo);

        if (acc1 instanceof Cloneable) {
            System.out.println("true.... allowed to perform the activity...");
        } else {
            System.out.println("false");
        }
    }
}