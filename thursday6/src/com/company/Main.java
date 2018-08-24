package com.company;

public class Main {

    public static void main(String[] args) {
	Bank HSBC, Natwest;
	HSBC = new Bank();
	Natwest = new Bank();

	HSBC.SetDollar(100);
	Natwest.amount(3);
	Bank.howmuch();
    }
}
