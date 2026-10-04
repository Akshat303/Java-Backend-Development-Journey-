package com.loop;

public class ReverseNo {

    public static void main(String[] args) {

        String n = "0123";
        int revNum = 0;

        // String ko integer mein convert karo
        int number = Integer.parseInt(n);

        while (number > 0) {

            int rem = number % 10;
            revNum = revNum * 10 + rem;

            number = number / 10;
        }

        System.out.println(revNum);
    }
}