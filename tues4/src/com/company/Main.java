package com.company;

public class Main {

    public static void main(String[] args) {
	int no;
	no=972;

	if (no > 1000) {
        System.out.println("A");
        if (no > 5000)
            System.out.println("B");
        else
            System.out.println("C");
        System.out.println("E");
        if (no < 2000) {
            System.out.println("F");
            System.out.println("G");
        }
    }
    else {
        if (no < 500) {
            System.out.println("1");
            System.out.println("2");
        }
        if (no > 200) {
            System.out.println("3");
            if (no > 300)
                System.out.println("4");
            else
                System.out.println("5");
            }
        }

    System.out.println("6");
    }
}
