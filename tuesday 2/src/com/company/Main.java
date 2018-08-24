package com.company;

public class Main {

    public static void main(String[] args) {
		int bill, paid, diff;

		bill = 523;
		paid = 850;

		diff = paid - bill;

		if (diff >= 50) {
			System.out.println("£50 = " + (diff / 50));
			diff = diff - (diff / 50) * 50;
		}
		if (diff >= 20) {
			System.out.println("£20 = " + (diff / 20));
			diff = diff - (diff / 20) * 20;
		}
		if (diff >= 10) {
			System.out.println("£10 = " + (diff / 10));
			diff = diff - (diff / 10) * 10;
		}
		if (diff >= 5) {
			System.out.println("£5 = " + (diff / 5));
			diff = diff - (diff / 5) * 5;
		}
		if (diff >= 2) {
			System.out.println("£2 = " + (diff / 2));
			diff = diff - (diff / 2) * 2;
		}
		if (diff >= 1) {
			System.out.println("£1 = " + (diff));
		}
	}
}

