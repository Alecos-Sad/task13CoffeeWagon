package com.company.sadovnikov;

import com.company.sadovnikov.model.sorts.Arabic;

public class Main {

    public static void main(String[] args) {
       // new Runner().start();

        Arabic arabic = new Arabic();
        System.out.println(arabic.getCoffeeType());
        System.out.println(arabic.getPrice());
    }
}
