package com.company;

public class Bank {
    static int Dollar;
    static {
        Dollar = 110;
    }
    public void giveDollar(int A) {
        System.out.println(Dollar);
        Dollar = A;
        System.out.println(Dollar);
    }
}
