package com.company;

import java.awt.*;
import java.awt.event.*;

class EventHandler implements ActionListener {
    TextField T1, T2, T3;
    Button badd, bsub, bmult, bdiv;
    public EventHandler(TextField t1, TextField t2, TextField t3, Button b1, Button b2, Button b3, Button b4) {
        T1 = t1;
        T2 = t2;
        T3 = t3;
        badd = b1;
        bsub = b2;
        bmult = b3;
        bdiv = b4;
    }

    public void actionPerformed(ActionEvent A) {
        int No1, No2, No3=0;
        Button Btn;
        No1 = Integer.parseInt(T1.getText());
        No2 = Integer.parseInt(T2.getText());
        Btn = (Button) A.getSource();
        if (Btn == badd)
            No3 = No1 + No2;
        if (Btn == bsub)
            No3 = No1 - No2;
        if (Btn == bmult)
            No3 = No1 * No2;
        if (Btn==bdiv)
            No3 = No1/No2;
        T3.setText(Integer.toString(No3));
    }
}
