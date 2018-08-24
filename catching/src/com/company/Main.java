package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Accounts Peter = new Accounts();
        try {
            Peter.CalculateSalary(1500, 9);
        }
        catch (Boom A) {
            System.out.println("Why you never in bro?");
            JFrame error = new JFrame();
            error.setSize(400,400);
            error.setVisible(true);
            JLabel what = new JLabel("Go to HR");
            error.add(what);
        }
    }
}
