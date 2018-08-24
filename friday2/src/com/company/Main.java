package com.company;

public class Main {

    public static void main(String[] args) {
	int X;
	String name = "SHAFEEQ";

	for (X=1; X <= name.length(); X++)
        System.out.println(name.substring(0,X));

	for (X = (name.length()-1); X >= 0; X--)
        System.out.println(name.substring(0, X));
    }
}