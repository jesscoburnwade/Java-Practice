package com.company;

public class Main {

    public static void main(String[] args) {
        Results Peter = new Results(), Smith = new Results();

        System.out.println("Peter:");
        Peter.physics(105);
        Peter.chemistry(100);
        Peter.maths(100);
        Peter.showResults();

        System.out.println("");

        System.out.println("Smith:");
        Smith.physics(95);
        Smith.chemistry(100);
        Smith.maths(53);
        Smith.showResults();
    }
}