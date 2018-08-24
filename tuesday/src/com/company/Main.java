package com.company;

public class Main {

    public static void main(String[] args) {
	int X, sum=0;

	X = 111;

	if (X < 99)
	    sum = (X/10) + (X%10);
    else if (X > 99 & X < 999)
    	sum = (X/100) + ((X%100)/10) + ((X%100)%10);

	System.out.println(sum);
    }
}
