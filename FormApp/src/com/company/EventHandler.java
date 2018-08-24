package com.company;

import java.awt.*;
import java.awt.event.*;

class EventHandler implements ActionListener {
    TextField T1, T2, T3;
    Frame F;
    String txt1, txt3;
    int txt2;
    public EventHandler(Frame Fr) {
        F = Fr;
    }

    public void actionPerformed (ActionEvent A) {
        Button Btn;
        String What;

        Btn = (Button) A.getSource();
        What = Btn.getLabel();

        if (What.equals("ENTRY")) {
            F.setVisible(true);
            }
        if (What.equals("VIEW")) {
            F.setVisible(true);
        }
        if (What.equals("EDIT")) {
            F.setVisible(true);
        }
        if (What.equals("DELETE")) {
            F.setVisible(true);
        }
        while (What.equals("ENTRY")) {
            txt1 = T1.getText();
            txt2 = Integer.parseInt("T2");
            txt3 = T3.getText();
        }
        }
    }

