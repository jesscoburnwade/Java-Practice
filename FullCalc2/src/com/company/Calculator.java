package com.company;

import java.awt.*;
import java.awt.event.*;

class EventHandler implements ActionListener {
    TextField txt;
    int No1, No2, No3;
    String Sign;
    String Number = "";

    public EventHandler(TextField T) {
        txt = T;
    }

    public void actionPerformed(ActionEvent A) {
        Button Btn;
        String What;

        //No1 = Integer.parseInt(txt.getText());
        //No2 = Integer.parseInt(txt.getText());
        Btn = (Button) A.getSource();
        What = Btn.getLabel();

        if (What.equals("0")) {
            Number = Number + What;
            txt.setText(Number);
        }

        if (What.equals("1")) {
            Number = Number + What;
            if (Sign == null) {
                No1 = Integer.parseInt(Number);
                txt.setText(Integer.toString(No1));
            } else {
                No2 = (Integer.parseInt(Number));
                txt.setText(Integer.toString(No2));
            }
        }

        if (What.equals("2")) {
            Number = Number + What;
            if (Sign == null) {
                No1 = Integer.parseInt(Number);
                txt.setText(Integer.toString(No1));
            } else {
                No2 = (Integer.parseInt(Number));
                txt.setText(Integer.toString(No2));
            }
        }

        if (What.equals("3")) {
            Number = Number + What;
            if (Sign == null) {
                No1 = Integer.parseInt(Number);
                txt.setText(Integer.toString(No1));
            } else {
                No2 = (Integer.parseInt(Number));
                txt.setText(Integer.toString(No2));
            }
        }

        if (What.equals("4")) {
            Number = Number + What;
            if (Sign == null) {
                No1 = Integer.parseInt(Number);
                txt.setText(Integer.toString(No1));
            } else {
                No2 = (Integer.parseInt(Number));
                txt.setText(Integer.toString(No2));
            }
        }

        if (What.equals("5")) {
            Number = Number + What;
            if (Sign == null) {
                No1 = Integer.parseInt(Number);
                txt.setText(Integer.toString(No1));
            } else {
                No2 = (Integer.parseInt(Number));
                txt.setText(Integer.toString(No2));
            }
        }

        if (What.equals("6")) {
            Number = Number + What;
            if (Sign == null) {
                No1 = Integer.parseInt(Number);
                txt.setText(Integer.toString(No1));
            } else {
                No2 = (Integer.parseInt(Number));
                txt.setText(Integer.toString(No2));
            }
        }

        if (What.equals("7")) {
            Number = Number + What;
            if (Sign == null) {
                No1 = Integer.parseInt(Number);
                txt.setText(Integer.toString(No1));
            } else {
                No2 = (Integer.parseInt(Number));
                txt.setText(Integer.toString(No2));
            }
        }

        if (What.equals("8")) {
            Number = Number + What;
            if (Sign == null) {
                No1 = Integer.parseInt(Number);
                txt.setText(Integer.toString(No1));
            } else {
                No2 = (Integer.parseInt(Number));
                txt.setText(Integer.toString(No2));
            }
        }

        if (What.equals("9")) {
            Number = Number + What;
            if (Sign == null) {
                No1 = Integer.parseInt(Number);
                txt.setText(Integer.toString(No1));
            } else {
                No2 = (Integer.parseInt(Number));
                txt.setText(Integer.toString(No2));
            }
        }
        if (What.equals("Clear")) {
            txt.setText("");
            No1 = 0;
            No2 = 0;
            No3 = 0;
            Number = "";
            Sign = "";
        }
        if (What.equals("+")) {
            Sign = "+";
            No1 = No1 + No2;
            Number = "";
        }

        if (What.equals("-")) {
            Sign = "-";
            No1 = No1 - No2;
            Number = "";
        }

        if (What.equals("x")) {
            Sign = "x";
            No1 = No1 * No2;
            Number = "";
        }

        if (What.equals("/")) {
            Sign = "/";
            No1 = No1 / No2;
            Number = "";
        }

        if (What.equals("=")) {
            if (Sign.equals("+"))
                No3 = No1 + No2;
            if (Sign.equals("-"))
                No3 = No1 - No2;
            if (Sign.equals("x"))
                No3 = No1 * No2;
            if (Sign.equals("/"))
                No3 = No1 / No2;
            txt.setText(Integer.toString(No3));
        }

    }
}



