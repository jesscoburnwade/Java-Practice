package com.company;

import java.awt.*;
import java.awt.event.*;

class EventHandler implements ActionListener {
    TextField T1, T2, T3;

    public EventHandler(TextField t1, TextField t2, TextField t3) {
        T1 = t1;
        T2 = t2;
        T3 = t3;
    }

    public void actionPerformed(ActionEvent A) {
        int No1, No2, No3 = 0;
        Button Btn;
        String What;
        No1 = Integer.parseInt(T1.getText());
        No2 = Integer.parseInt(T2.getText());
        Btn = (Button) A.getSource();
        What = Btn.getLabel();
        if (What.equals("Add"))
            No3 = No1 + No2;
        if (What.equals("Subtract"))
            No3 = No1 - No2;
        if (What.equals("Multiply"))
            No3 = No1 * No2;
        if (What.equals("Divide"))
            No3 = No1 / No2;
        T3.setText(Integer.toString(No3));
    }
}
