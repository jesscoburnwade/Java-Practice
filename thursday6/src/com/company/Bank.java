package com.company;

public class Bank {
    int X;
    static int Dollar;

    public void SetDollar(int A) {
        Dollar = A;
    }

    public void amount(int A) {
        System.out.println(A * Dollar);
    }

    static void howmuch() {
        System.out.println("$" + Dollar);
    }
}