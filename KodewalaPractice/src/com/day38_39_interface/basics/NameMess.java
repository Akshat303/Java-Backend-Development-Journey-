package com.day38_39_interface.basics;

public class NameMess {

    public static PrintName getName() {
        return () -> System.out.println("My name is Akshat");
    }
}