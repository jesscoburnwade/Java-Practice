package com.company;

import com.sun.org.apache.xpath.internal.operations.Mult;

import java.awt.*;
import java.awt.FlowLayout;

public class Main {

    public static void main(String[] args) {
        FlowLayout Fl = new FlowLayout();
        Frame F = new Frame("Calculations");
        TextField T1, T2, T3;
        Label L1, L2, L3;
        L1 = new Label("1st Number:");
        L2 = new Label("2nd Number:");
        L3 = new Label("Result:");
        T1 = new TextField(10);
        T2 = new TextField(10);
        T3 = new TextField(10);
        Button B1 = new Button("Add");
        Button B2 = new Button("Subtract");
        Button B3 = new Button("Multiply");
        Button B4 = new Button("Divide");

        EventHandler E = new EventHandler(T1, T2, T3, B1, B2, B3, B4);
        B1.addActionListener(E);
        B2.addActionListener(E);
        B3.addActionListener(E);
        B4.addActionListener(E);

        F.setLayout(Fl);
        F.add(L1);
        F.add(T1);
        F.add(L2);
        F.add(T2);
        F.add(B1);
        F.add(B2);
        F.add(B3);
        F.add(B4);
        F.add(L3);
        F.add(T3);
        F.setBackground(Color.cyan.darker());
        F.setSize(650,150);
        F.setVisible(true);
    }
}
