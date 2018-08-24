package com.company;

public class Results {
    private int phy, che, mat, tot, count;
    private float per;
    private String exam;

    public void physics(int A) {
        if (A >= 0 && A <= 150) {
            phy = A;
            if (phy * 100 / 150 <= 60) {
                count++;
                exam = "physics";
            }
        } else {
            phy = -1;
            System.out.println("Invalid physics mark");
        }
    }

    public void chemistry(int A) {
        if (A >= 0 && A <= 150) {
            che = A;
            if (che * 100 / 150 <= 60) {
                count++;
                exam = "chemistry";
            }
        } else {
            che = -1;
            System.out.println("Invalid chemistry mark");
        }
    }

    public void maths(int A) {
        if (A >= 0 && A <= 150) {
            mat = A;
            if (mat * 100 / 150 <= 60) {
                count++;
                exam = "maths";
            }
        } else {
            mat = -1;
            System.out.println("Invalid maths mark");
        }
    }

    public void showResults() {
        switch (count) {
            case 0:
                if (phy >= 0 && che >= 0 && mat >= 0) {
                    tot = phy + che + mat;
                    per = tot * 100 / 450;
                    System.out.println("Total = " + tot + "/450");
                    System.out.println("Percentage = " + per + "%");
                    System.out.println("");
                } else
                    System.out.println("INVALID");
                break;
            case 1:
                if (phy >= 0 && che >= 0 && mat >= 0)
                    System.out.println("Retake the " + exam + " exam.");
                break;
            case 2:
                if (phy >= 0 && che >= 0 && mat >= 0)
                    System.out.println("Retake the course.");
                break;
            case 3:
                if (phy >= 0 && che >= 0 && mat >= 0)
                    System.out.println("Go home...");
                break;
        }
    }
}