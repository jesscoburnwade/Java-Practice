package com.company;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        Frame win = new Frame("Hello");
        Button B = new Button("Login");
        Button B2 = new Button("Sign Out");

        TextField T = new TextField();
        EventHandler X = new EventHandler(T);
        Event2 Y = new Event2(T);
        B.addActionListener(X);
        B2.addActionListener(Y);

        win.add(T,BorderLayout.SOUTH);
        win.add(B,BorderLayout.WEST);
        win.add(B2,BorderLayout.EAST);

        win.setSize(600,400);
        win.setBackground(Color.red.darker());
        win.setVisible(true);
    }
}
