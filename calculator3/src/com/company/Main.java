package com.company;

import com.sun.org.apache.xpath.internal.operations.Mult;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        FlowLayout Fl = new FlowLayout();
        Font Fi = new Font("Calibri", Font.ITALIC, 14);
        Font Fb = new Font("Serif", Font.BOLD, 14);
        //Frame F = new Frame("Calculations");
        JFrame F = new JFrame("Calculator");
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TextField T1, T2, T3;
        Label L1, L2, L3;
        L1 = new Label("1st Number:");
        L2 = new Label("2nd Number:");
        L3 = new Label("Result:");
        L3.setFont(Fb);
        T1 = new TextField(10);
        T2 = new TextField(10);
        T3 = new TextField(10);
        Button B1 = new Button("Add");
        Button B2 = new Button("Subtract");
        Button B3 = new Button("Multiply");
        Button B4 = new Button("Divide");

        EventHandler E = new EventHandler(T1, T2, T3);
        B1.addActionListener(E);
        B2.addActionListener(E);
        B3.addActionListener(E);
        B4.addActionListener(E);

        B1.setBackground(Color.gray.brighter());
        B2.setBackground(Color.gray.brighter());
        B3.setBackground(Color.gray.brighter());
        B4.setBackground(Color.gray.brighter());
        B1.setFont(Fb);
        B2.setFont(Fb);
        B3.setFont(Fb);
        B4.setFont(Fb);
        T1.setFont(Fb);
        T2.setFont(Fb);
        T3.setFont(Fb);

        F.setLayout(Fl);
        F.setFont(Fi);
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
        F.setSize(660, 150);
        F.setVisible(true);
    }
}
