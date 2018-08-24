package com.company;

import java.awt.*;
import java.awt.event.*;

class Addition implements ActionListener {
    TextField T1, T2, T3;

    public Addition(TextField a, TextField b, TextField c) {
        T1 = a;
        T2 = b;
        T3 = c;
    }

    public void actionPerformed(ActionEvent A) {
        int No1, No2, No3;
        No1 = Integer.parseInt(T1.getText());
        No2 = Integer.parseInt(T2.getText());
        No3 = No1 + No2;
        T3.setText(Integer.toString(No3));
    }
}

class Subtraction implements ActionListener {
    TextField T1, T2, T3;

    public Subtraction(TextField a, TextField b, TextField c) {
        T1 = a;
        T2 = b;
        T3 = c;
    }

    public void actionPerformed(ActionEvent A) {
        int No1, No2, No3;
        No1 = Integer.parseInt(T1.getText());
        No2 = Integer.parseInt(T2.getText());
        No3 = No1 - No2;
        T3.setText(Integer.toString(No3));
    }
}

class Multiplication implements ActionListener {
    TextField T1, T2, T3;

    public Multiplication(TextField a, TextField b, TextField c) {
        T1 = a;
        T2 = b;
        T3 = c;
    }

    public void actionPerformed(ActionEvent A) {
        int No1, No2, No3;
        No1 = Integer.parseInt(T1.getText());
        No2 = Integer.parseInt(T2.getText());
        No3 = No1 * No2;
        T3.setText(Integer.toString(No3));
    }
}

class Division implements ActionListener {
    TextField T1, T2, T3;

    public Division(TextField a, TextField b, TextField c) {
        T1 = a;
        T2 = b;
        T3 = c;
    }

    public void actionPerformed(ActionEvent A) {
        int No1, No2, No3;
        No1 = Integer.parseInt(T1.getText());
        No2 = Integer.parseInt(T2.getText());
        No3 = No1 / No2;
        T3.setText(Integer.toString(No3));
    }
}

