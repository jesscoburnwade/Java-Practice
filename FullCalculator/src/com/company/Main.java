package com.company;

import java.awt.*;
import java.awt.GridLayout;

public class Main {

    public static void main(String[] args) {
        Frame F = new Frame("Calculator");
        Panel P1 = new Panel();
        Panel P2 = new Panel();


        P2.setLayout(new GridLayout(4,4));

        TextField T = new TextField(30);

        Button b0 = new Button("0");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b10 = new Button("Clear");
        Button b11 = new Button("=");
        Button b12 = new Button("+");
        Button b13 = new Button("-");
        Button b14 = new Button("x");
        Button b15 = new Button("/");

        P2.add(b0);
        P2.add(b1);
        P2.add(b2);
        P2.add(b3);
        P2.add(b4);
        P2.add(b5);
        P2.add(b6);
        P2.add(b7);
        P2.add(b8);
        P2.add(b9);
        P2.add(b10);
        P2.add(b11);
        P2.add(b12);
        P2.add(b13);
        P2.add(b14);
        P2.add(b15);
        P1.add(T);

        F.add(P1, BorderLayout.NORTH);
        F.add(P2);

        EventHandler E = new EventHandler(T);
        b1.addActionListener(E);
        b2.addActionListener(E);
        b3.addActionListener(E);
        b4.addActionListener(E);
        b5.addActionListener(E);
        b6.addActionListener(E);
        b7.addActionListener(E);
        b8.addActionListener(E);
        b9.addActionListener(E);
        b10.addActionListener(E);
        b11.addActionListener(E);
        b12.addActionListener(E);
        b13.addActionListener(E);
        b14.addActionListener(E);
        b15.addActionListener(E);

        F.setSize(400, 400);
        F.setBackground(Color.cyan.darker());
        F.setVisible(true);

    }
}
