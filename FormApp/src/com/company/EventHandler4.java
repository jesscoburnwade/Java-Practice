package com.company;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

class EventHandler4 implements ActionListener {
    TextField T1, T2, T3;
    String name;
    int regno, marks;
    Frame F;
    Panel P;

    public EventHandler4(TextField t1, TextField t2, TextField t3, Panel p) {
        T1 = t1;
        T2 = t2;
        T3 = t3;
        P = p;


    }

    public void actionPerformed(ActionEvent A) {
        String What;
        Button Btn;

        Btn = (Button) A.getSource();
        What = Btn.getLabel();

        if (What.equals("...")|| (What.equals("SEARCH"))) {
            try {
                regno = Integer.parseInt(T1.getText());
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA", "root", "");
                Statement S = C.createStatement();
                ResultSet R = S.executeQuery("SELECT DISTINCT Name, Marks FROM School WHERE RegNo =" + regno);
                while (R.next()) {
                    T2.setText(R.getString("Name"));
                    T3.setText(R.getString("Marks"));
                }
            } catch (Exception X) {
                System.out.println(A.toString());
            }
        }


        if (What.equals("UPDATE")) {
            try {
                regno = Integer.parseInt(T1.getText());
                name = T2.getText();
                marks = Integer.parseInt(T3.getText());
                System.out.println("RegNo");
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA", "root", "");
                Statement S = C.createStatement();
                System.out.println("UPDATE SCHOOL SET Name=" + name + ", Marks= " + marks + " WHERE RegNo =" + regno);
                S.executeUpdate("UPDATE SCHOOL SET Name='" + name + "', Marks=" + marks + " WHERE RegNo =" + regno);
            } catch (Exception X) {
                System.out.println(A.toString());
            }
            T1.setText("");
            T2.setText("");
            T3.setText("");
        }
    }
}




