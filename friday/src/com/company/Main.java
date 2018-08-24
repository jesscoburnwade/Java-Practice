package com.company;

public class Main {

    public static void main(String[] args) {
        int X;
        String message = "Manchester";

        if (message.substring(4,5).equals("h")) {
            System.out.print("****");
            for (X = 5; X < message.length(); X++) {
                System.out.print(message.substring(X, X + 1));
            }
        }
    }
}
