package com.company;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        Frame win = new Frame("Hello");
        Button B = new Button("Click");
        EventHandler X = new EventHandler();
        B.addActionListener(X);
        win.add(B);
        win.setSize(600,400);
        win.setBackground(Color.red.darker());
        win.setVisible(true);
    }
}
