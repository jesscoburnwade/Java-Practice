package com.company;

public class Main {

    public static void main(String[] args) {
	String product;
	int quantity;
	float price, amount;
	product = "7up";
	quantity = 5;
	price = 1.25f;
	amount = quantity * price;
	System.out.println("Product: " + product);
	System.out.println("Quantity: " + quantity);
	System.out.println("Price: £" + price);
	System.out.println("Amount: £" + amount);
	System.out.println("VAT: £" + (amount*21/100));
    }
}
