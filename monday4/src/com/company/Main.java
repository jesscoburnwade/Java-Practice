package com.company;

public class Main {

    public static void main(String[] args) {
        int C;
        try {
            C = 4 / 0;

        } catch (ArithmeticException AB) {
            System.out.println("Can't divide by 0");
        }
        System.out.println("Bye");
        String X;
        X = "AB";
        try {
            X.substring(5,6);
        } catch (IndexOutOfBoundsException B) {
            System.out.println("Not long enough");
        }
        int[] number = new int[4];
        number[0] = 1;
        number[1] = 2;
        number[2] = 2;
        number[3] = 4;
        System.out.println(number[0]);

    }
}