package com.day40_serialization;



public class Account implements Cloneable {

    String accName;
    String collegeName;
    String accNo;

    public Account(String accName, String collegeName, String accNo) {
        this.accName = accName;
        this.collegeName = collegeName;
        this.accNo = accNo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}