package com.company;

public class Digits {
    public void DigitsToWords(int A) {
        if (A > 99) {
            int digit1 = (A % 100) % 10;
            int digit3 = (A - (A % 100)) / 100;
            int digit2 = ((A - digit1) - (A - (A % 100))) / 10;

            switch (digit3) {
                case 1:
                    System.out.print("One Hundred and ");
                    break;
                case 2:
                    System.out.print("Two Hundred and ");
                    break;
                case 3:
                    System.out.print("Three Hundred and ");
                    break;
                case 4:
                    System.out.print("Four Hundred and ");
                    break;
                case 5:
                    System.out.print("Five Hundred and ");
                    break;
                case 6:
                    System.out.print("Six Hundred and ");
                    break;
                case 7:
                    System.out.print("Seven Hundred and ");
                    break;
                case 8:
                    System.out.print("Eight Hundred and ");
                    break;
                case 9:
                    System.out.print("Nine Hundred and ");
                    break;
            }

            switch (digit2) {
                case 1:
                    switch (A - (A - (A % 100))) {
                        case 10:
                            System.out.print("Ten");
                            break;
                        case 11:
                            System.out.print("Eleven");
                            break;
                        case 12:
                            System.out.print("Twelve");
                            break;
                        case 13:
                            System.out.print("Thirteen");
                            break;
                        case 14:
                            System.out.print("Fourteen");
                            break;
                        case 15:
                            System.out.print("Fifteen");
                            break;
                        case 16:
                            System.out.print("Sixteen");
                            break;
                        case 17:
                            System.out.print("Seventeen");
                            break;
                        case 18:
                            System.out.print("Eighteen");
                            break;
                        case 19:
                            System.out.print("Nineteen");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Forty ");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
            }
            if (digit2 != 1) {
                switch (digit1) {
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
            }
        } else {
            int digit1 = A % 10;
            int digit2 = (A - digit1) / 10;
            switch (digit2) {
                case 1:
                    switch (A) {
                        case 10:
                            System.out.print("Ten");
                            break;
                        case 11:
                            System.out.print("Eleven");
                            break;
                        case 12:
                            System.out.print("Twelve");
                            break;
                        case 13:
                            System.out.print("Thirteen");
                            break;
                        case 14:
                            System.out.print("Fourteen");
                            break;
                        case 15:
                            System.out.print("Fifteen");
                            break;
                        case 16:
                            System.out.print("Sixteen");
                            break;
                        case 17:
                            System.out.print("Seventeen");
                            break;
                        case 18:
                            System.out.print("Eighteen");
                            break;
                        case 19:
                            System.out.print("Nineteen");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            System.out.print(" ");
            if (digit2 != 1) {
                switch (digit1) {
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
            }
        }
    }
}