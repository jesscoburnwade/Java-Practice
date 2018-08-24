package com.company;

public class Results {
    static Results X;
    private Results() {}

    static Results CreateObject() {
        if (X == null)
            X = new Results();
        return X;
    }
    public void msg() {
        System.out.println("hello");
    }

}
