package com.company;

public class DigitWords {
    public String digitstowords(int A) {
        int ones = A % 10;
        int tens = A - ones;

        String word1 = "";
        String word2 = "";

        switch (ones) {
            case 1:
                if (A < 10)
                    word1 = "One";
                break;
            case 2:
                word1 = "Two";
            break;
            case 3:
                word1 = "Three";
            break;
            case 4:
                word1 =  "Four";
            break;
            case 5:
                word1 =  "Five";
            break;
            case 6:
                word1 =  "Six";
            break;
            case 7:
                word1 =  "Seven";
            break;
            case 8:
                word1 =  "Eight";
            break;
            case 9:
                word1 = "Nine";
            break;
        }

        switch (tens) {
            case 10:
                word2 =  "Ten";
            break;
            case 20:
                word2 = "Twenty";
            break;
            case 30:
                word2 = "Thirty";
            break;
            case 40:
                word2 = "Forty";
            break;
            case 50:
                word2 = "Fifty";
            break;
            case 60:
                word2 = "Sixty";
            break;
            case 70:
                word2 = "Seventy";
            break;
            case 80:
                word2 = "Eighty";
            break;
            case 90:
                word2 = "Ninety";
            break;
            switch (A) {
                case 11:
                    word2 = "Eleven";
                    break;
                case 12:
                    word2 = "Twelve";

                    break;
                case 13:
                    word2 = "Thirteen";

                    break;
                case 14:
                    word2 = "Fourteen";

                    break;
                case 15:
                    word2 = "Fifteen";

                    break;
                case 16:
                    word2 = "Sixteen";

                    break;
                case 17:
                    word2 = "Seventeen";

                    break;
                case 18:
                    word2 = "Eighteen";

                    break;
                case 19:
                    word2 = "Nineteen";

                    break;
            }


        }
    }
}