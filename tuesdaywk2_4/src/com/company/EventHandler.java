package com.company;

import java.awt.*;
import java.awt.event.*;

class EventHandler implements ActionListener {
    TextField txt;

    public EventHandler(TextField t) {
        txt = t;
    }

    public void actionPerformed(ActionEvent X) {
        txt.setText("Enter username: ");
        System.out.println("Button clicked");
    }
}

class Event2 implements ActionListener {
    TextField txt;

    public Event2(TextField t) {
        txt = t;
    }

    public void actionPerformed(ActionEvent X) {
        txt.setText("You've signed out");
        System.out.println("Button 2 clicked");
    }
}


        if (What.equals("0")) {
                txt.setText("0");
                if (No1 == 0)
                No1 = 0;
                else
                No2 = 0;
                }
                if (What.equals("1")) {
                txt.setText("1");
                if (No1 == 0)
                No1 = 1;
                else
                No2 = 1;
                }

                if (What.equals("2")) {
                txt.setText("2");
                if (No1 == 0)
                No1 = 2;
                else
                No2 = 2;
                }
                if (What.equals("3")) {
                txt.setText("3");
                if (No1 == 0)
                No1 = 3;
                else
                No2 = 3;
                }
                if (What.equals("4")) {
                txt.setText("4");
                if (No1 == 0)
                No1 = 4;
                else
                No2 = 4;
                }
                if (What.equals("5")) {
                txt.setText("5");
                if (No1 == 0)
                No1 = 5;
                else
                No2 = 5;
                }
                if (What.equals("6")) {
                txt.setText("6");
                if (No1 == 0)
                No1 = 6;
                else
                No2 = 6;
                }
                if (What.equals("7")) {
                txt.setText("7");
                if (No1 == 0)
                No1 = 7;
                else
                No2 = 7;
                }
                if (What.equals("8")) {
                txt.setText("8");
                if (No1 == 0)
                No1 = 8;
                else
                No2 = 8;
                }
                if (What.equals("9")) {
                txt.setText("9");
                if (No1 == 0)
                No1 = 9;
                else
                No2 = 9;
                }
                if (What.equals("Clear")) {
                txt.setText("");
                No1 = 0;
                No2 = 0;
                }
                if (What.equals("+"))
                No3 = No1 + No2;

                if (What.equals("-"))
                No3 = No1 - No2;

                if (What.equals("x"))
                No3 = No1 * No2;

                if (What.equals("/"))
                No3 = No1 / No2;

                if (What.equals("="))
                txt.setText(Integer.toString(No3));
                }
                }

