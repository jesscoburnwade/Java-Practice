package com.company;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

class EventHandler2 implements ActionListener {
    TextField T1, T2, T3;
    String name;
    int regno, marks;
    String Check;
    Frame F;

    public EventHandler2(TextField t1, TextField t2, TextField t3, Frame f) {
        T1 = t1;
        T2 = t2;
        T3 = t3;
        F = f;
    }

    public void actionPerformed(ActionEvent A) {
        Button Btn;
        String What;

        Btn = (Button) A.getSource();
        What = Btn.getLabel();
        try {
            regno = Integer.parseInt(T1.getText());
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA", "root", "");
            Statement S = C.createStatement();
            ResultSet R = S.executeQuery("SELECT RegNo FROM School");
            Check.equals(R.getString("RegNo"));
        } catch (Exception X) {
            System.out.println(A.toString());
        }

        if (What.equals("SAVE")) {
            if ((T1.getText()).equals(Check)) {
                //Label no = new Label("Already in use");
                //F.add(no, BorderLayout.SOUTH);
                System.out.println("Already in use");
            }
            else {
                try {
                    regno = Integer.parseInt(T1.getText());
                    name = T2.getText();
                    marks = Integer.parseInt(T3.getText());
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA", "root", "");
                    Statement S = C.createStatement();
                    S.executeUpdate("INSERT INTO SCHOOL VALUES(" + regno + ",'" + name + "'," + marks + ")");
                } catch (Exception X) {
                    System.out.println(A.toString());
                }
                T1.setText("");
                T2.setText("");
                T3.setText("");
            }
        }
    }
}




