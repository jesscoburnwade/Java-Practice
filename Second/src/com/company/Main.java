package com.company;

public class Main {

    public static void main(String[] args) {
	int phy, che, mat, total;
	float per;
	phy = 80;
	che = 80;
	mat = 100;
	total = phy+che+mat;
	per = (float)total*100/450;
	System.out.println("Total marks: " + total);
	System.out.println("Percentage: "+per+"%");
    }
}
