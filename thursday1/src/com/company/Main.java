package com.company;

public class Main {

    public static void main(String[] args) {
        Math M = new Math();
        M.Addition(5, 2);
        System.out.println(M.Subtraction(20, 10));

        int D = M.Subtraction(30, 13);
        System.out.println((D * 2));
        if (M.Subtraction(10, 3) > 6)
            System.out.println("Yep");
        else
            System.out.println("Nope");

        int t = M.Subtraction(10, 5);
        System.out.println(t*2);
    }
}
