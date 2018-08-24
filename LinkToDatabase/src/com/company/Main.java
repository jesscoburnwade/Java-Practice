package com.company;

import java.sql.*;
import java.lang.*;
import java.awt.*;

import static java.lang.Class.forName;

public class Main {

    public static void main2(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA", "root", "");
            Statement S = C.createStatement();
            ResultSet R = S.executeQuery("SELECT * FROM SCHOOL");
            while (R.next()) {
                System.out.println(R.getInt("RegNo"));
                System.out.println(R.getString("Name"));
            }
        } catch (Exception A) {
            System.out.println(A.toString());
        }
    }

    public static void main(String[] args) {
        Frame F = new Frame();
        TextField T1 = new TextField(30);
        TextField T2 = new TextField(30);
        TextField T3 = new TextField(30);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA", "root", "");
            Statement S = C.createStatement();
            S.executeUpdate("INSERT INTO SCHOOL VALUES (5, 'Bill',678)");
        } catch (Exception A) {
            System.out.println(A.toString());
        }
    }
}

