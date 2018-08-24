package com.company;

public class Main {

    public static void main(String[] args) {
        int Result = 0, A = 0, B = 0;

        try {
            A = Integer.parseInt(args[0]);
            B = Integer.parseInt(args[1]);
            Result = A / B;
            System.out.println(Result);
        }
        catch(ArithmeticException X){
            System.out.println("Cannot divide by 0");
        }
        catch(NumberFormatException Y) {
            System.out.println("Use digits only");
        }
        catch(IndexOutOfBoundsException Z) {
            System.out.println("Not enough values given");
        }

    }
}
