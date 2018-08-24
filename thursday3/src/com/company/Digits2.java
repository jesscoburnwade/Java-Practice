package com.company;

public class Digits2 {
    public void DigitsToWords(int A) {

        if (A >= 100 & A <= 999) {
            System.out.println(Ones(A / 100) + " hundred " + ty(A % 100 / 10 * 10) + Ones(A % 100 % 10));
        } else if (A < 100)
            System.out.println(ty(A / 10 * 10) + Ones(A % 10));
    }


    private String Ones(int num) {
        String word = "";
        switch (num) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
            case 10:
                word = "Ten";
                break;
            case 11:
                word = "Eleven";
                break;
            case 12:
                word = "Twelve";
                break;
            case 13:
                word = "Thirteen";
                break;
            case 14:
                word = "Fourteen";
                break;
            case 15:
                word = "Fifteen";
                break;
            case 16:
                word = "Sixteen";
                break;
            case 17:
                word = "Seventeen";
                break;
            case 18:
                word = "Eighteen";
                break;
            case 19:
                word = "Nineteen";
                break;
        }
        return word;
    }

    private String ty(int num) {
        String words = "";
        switch (num) {
            case 20:
                words = "Twenty ";
                break;
            case 30:
                words = "Thirty ";
                break;
            case 40:
                words = "Forty ";
                break;
            case 50:
                words = "Fifty";
                break;
            case 60:
                words = "Sixty ";
                break;
            case 70:
                words = "Seventy ";
                break;
            case 80:
                words = "Eighty ";
                break;
            case 90:
                words = "Ninety ";
                break;
        }
        return words;
    }
}

