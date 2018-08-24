package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame F = new JFrame("Hello");

        JMenuBar Bar = new JMenuBar();
        JMenu menu1 = new JMenu("Operations 1");
        JMenu menu2 = new JMenu("Operations 2");
        JMenuItem m1 = new JMenuItem("Addition");
        JMenuItem m2 = new JMenuItem("Subtraction");
        JMenuItem m3 = new JMenuItem("Multiplication");
        JMenuItem m4 = new JMenuItem("Division");
        JTextField no1 = new JTextField(10);
        JTextField no2 = new JTextField(10);
        JTextField no3 = new JTextField(10);
        JLabel L1 = new JLabel("Number 1:");
        JLabel L2 = new JLabel("Number 2:");
        JLabel L3 = new JLabel("Result:");
        Font Fnt = new Font("",Font.BOLD,20);
        Font Fnt2 = new Font("",Font.ITALIC,18);

        L1.setFont(Fnt);
        L2.setFont(Fnt);
        L3.setFont(Fnt);
        menu1.setFont(Fnt2);
        menu2.setFont(Fnt2);

        menu1.add(m1);
        menu1.add(m2);
        menu2.add(m3);
        menu2.add(m4);

        Bar.add(menu1);
        Bar.add(menu2);

        F.setLayout(new FlowLayout());
        F.add(L1);
        F.add(no1);
        F.add(L2);
        F.add(no2);
        F.add(L3);
        F.add(no3);
        F.setJMenuBar(Bar);
        F.setSize(500,400);
        F.setVisible(true);

        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int No1 = Integer.parseInt(no1.getText());
                int No2 = Integer.parseInt(no2.getText());
                int No3 = No1 + No2;
                no3.setText(Integer.toString(No3));
            }
        });
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int No1 = Integer.parseInt(no1.getText());
                int No2 = Integer.parseInt(no2.getText());
                int No3 = No1 - No2;
                no3.setText(Integer.toString(No3));
            }
        });
        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int No1 = Integer.parseInt(no1.getText());
                int No2 = Integer.parseInt(no2.getText());
                int No3 = No1 * No2;
                no3.setText(Integer.toString(No3));
            }
        });
        m4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int No1 = Integer.parseInt(no1.getText());
                int No2 = Integer.parseInt(no2.getText());
                int No3 = No1 / No2;
                no3.setText(Integer.toString(No3));
            }
        });
    }
}
