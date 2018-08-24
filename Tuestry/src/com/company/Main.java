package com.company;

public class Main {

    public static void main(String[] args) {
        float bill, paid, diff;

        bill = 22.30f;
        paid = 36f;

        diff = paid - bill;

        if (diff >= 50) {
            System.out.println("£50 = " + (int)(Math.floor(diff) / 50));
            diff = diff - (int)(Math.floor(diff) / 50) * 50;
        }
        if (diff >= 20) {
            System.out.println("£20 = " + (int)(Math.floor(diff) / 20));
            diff = diff - (int)(Math.floor(diff) / 20) * 20;
        }
        if (diff >= 10) {
            System.out.println("£10 = " + (int)(Math.floor(diff) / 10));
            diff = diff - (int)(Math.floor(diff) / 10) * 10;
        }
        if (diff >= 5) {
            System.out.println("£5 = " + (int)(Math.floor(diff) / 5));
            diff = diff - (int)(Math.floor(diff) / 5) * 5;
        }
        if (diff >= 2) {
            System.out.println("£2 = " + (int)(Math.floor(diff) / 2));
            diff = diff - (int)(Math.floor(diff) / 2) * 2;
        }
        if (diff >= 1) {
            System.out.println("£1 = " + (int)(Math.floor(diff)/1));
            diff = diff - (int)(Math.floor(diff) / 1) * 1;
        }
        if (diff >= 0.5) {
            System.out.println("50p = " + (int)((diff/0.5)));
            diff = (float) ((float)diff - ((int)((diff) / 0.5))*0.5);
        }
        if (diff >= 0.2) {
            System.out.println("20p = " + (int) ((diff) / 0.2));
            diff = (float) ((float) diff - ((int) ((diff) / 0.2)) * 0.2);
        }
    }
}
