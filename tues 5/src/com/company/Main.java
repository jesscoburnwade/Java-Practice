package com.company;

public class Main {

    public static void main(String[] args) {

        // Programme for printing multiple hellos!
	 //int A = 1;
	 //while (A < 10) {
         //System.out.println("Hello!");
         //++A;
 //    }

     //System.out.println("");

        // Programme for printing the two times tables
     //int B = 1;
	 //while (B <= 10) {
        // System.out.println("2 x " + B + " = " + (B * 2));
        // ++B;
    // }

     //System.out.println("");

        // Programme for printing even numbers
     //int C = 1;
        //while (C <= 10) {
           // if (C % 2 == 0)
               // System.out.println(C);
           // ++C;
       // }


    int X, Y;
    X = 10;

        while (X >= 1) {
            Y = 1;
            while (Y <= X) {
                    System.out.print(Y);
            ++Y;
            if (Y <= X)
                System.out.print(",");
            else
                System.out.print(".");
            }
            --X;

            System.out.println();
        }
    }
}