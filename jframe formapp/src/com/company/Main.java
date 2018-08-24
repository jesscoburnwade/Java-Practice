package com.company;

import javax.xml.soap.Text;
import java.awt.event.*;
import java.sql.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;

import static java.lang.Class.forName;

public class Main {

    public static void main(String[] args) {

        // MAIN FRAME
        JFrame F = new JFrame("Main");
        F.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                F.dispose();
            }
        });
        JMenuBar Bar = new JMenuBar();
        JPanel P1 = new JPanel();
        JPanel P2 = new JPanel();
        JPanel P3 = new JPanel();
        JPanel P4 = new JPanel();
        JPanel P5 = new JPanel();
        JPanel P6 = new JPanel();
        JPanel P7 = new JPanel();
        JPanel P8 = new JPanel();
        JPanel P9 = new JPanel();
        JMenu B1 = new JMenu("ENTRY");
        JMenu B2 = new JMenu("VIEW");
        JMenu B3 = new JMenu("EDIT");
        JMenu B4 = new JMenu("DELETE");
        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent A) {
                Button Btn;
                String What;

                Btn = (Button) A.getSource();
                What = Btn.getLabel();

                if (What.equals("ENTRY")) {
                    F.setVisible(true);
                }
            }
        });
        Bar.add(B1);
        Bar.add(B2);
        Bar.add(B3);
        Bar.add(B4);
        Font Fn = new Font("", Font.ITALIC, 20);
        B1.setFont(Fn);
        B2.setFont(Fn);
        B3.setFont(Fn);
        B4.setFont(Fn);

        B1.setBackground(Color.LIGHT_GRAY);
        B2.setBackground(Color.LIGHT_GRAY);
        B3.setBackground(Color.LIGHT_GRAY);
        B4.setBackground(Color.LIGHT_GRAY);

        P1.setBackground(Color.red.darker());
        P2.setBackground(Color.orange.darker());
        P3.setBackground(Color.yellow.darker());
        P4.setBackground(Color.GREEN);
        P5.setBackground(Color.green.darker());
        P6.setBackground(Color.blue);
        P7.setBackground(Color.blue.darker());
        P8.setBackground(Color.MAGENTA.darker());
        P9.setBackground(Color.magenta);

        //P2.add(B1);
        //P4.add(B2);
        //P6.add(B3);
        //P8.add(B4);
        F.setJMenuBar(Bar);
        F.setLayout(new GridLayout(9, 1));
        F.add(P1);
        F.add(P2);
        F.add(P3);
        F.add(P4);
        F.add(P5);
        F.add(P6);
        F.add(P7);
        F.add(P8);
        F.add(P9);
        F.setSize(400, 400);
        F.setVisible(true);

        //ENTRY FRAME
        JPanel FEntry = new JPanel();
        //FEntry.addWindowListener(new WindowAdapter() {
        //    public void windowClosing(WindowEvent we) {
         //       FEntry.dispose();
        //    }
        //});
        FEntry.setLayout(new FlowLayout());
        JPanel PE1 = new JPanel();
        JPanel PE2 = new JPanel();
        JPanel PE3 = new JPanel();
        JPanel PE4 = new JPanel();

        JTextField T1 = new JTextField(10);
        JTextField T2 = new JTextField(10);
        JTextField T3 = new JTextField(10);
        Label L1 = new Label("Reg No: ");
        Label L2 = new Label("Name: ");
        Label L3 = new Label("Marks: ");
        JButton Save = new JButton("SAVE");
        JButton Back = new JButton("BACK");
        Save.setBackground(Color.lightGray);
        Back.setBackground(Color.lightGray);
        FEntry.setBackground(Color.RED.darker());

        Font F1 = new Font("", Font.BOLD, 18);
        L1.setFont(F1);
        L2.setFont(F1);
        L3.setFont(F1);

        PE1.add(L1);
        PE1.add(T1);
        PE2.add(L2);
        PE2.add(T2);
        PE3.add(L3);
        PE3.add(T3);
        PE4.add(Save);

        FEntry.setLayout(new GridLayout(9, 1));
        FEntry.add(PE1);
        FEntry.add(PE2);
        FEntry.add(PE3);
        FEntry.add(PE4);
        FEntry.add(L1);
        FEntry.add(T1);
        FEntry.add(L2);
        FEntry.add(T2);
        FEntry.add(L3);
        FEntry.add(T3);
        FEntry.add(Save);
        FEntry.add(Back);

        //EventHandler2 EE1 = new EventHandler2(T1, T2, T3, FEntry);
        Save.addActionListener(new ActionListener() {
            TextField T1, T2, T3;
            String name;
            int regno, marks;
            String Check;

            public void actionPerformed(ActionEvent A) {

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

        });
        //Back.addActionListener(EE1);
        FEntry.setSize(400, 400);

        //EventHandler E1 = new EventHandler(FEntry);
        //B1.addActionListener(E1);

        //DELETE FRAME
        Frame FDel = new Frame("Delete");
        FDel.addWindowListener(new

                                       WindowAdapter() {
                                           public void windowClosing(WindowEvent e) {
                                               FDel.dispose();
                                           }
                                       });

        FDel.setLayout(new

                GridLayout(5, 1));
        Panel PD1 = new Panel();
        Panel PD2 = new Panel();
        TextField TD1 = new TextField(10);
        TextField TD2 = new TextField(10);
        TextField TD3 = new TextField(10);
        Button BD1 = new Button("...");
        Button Delete = new Button("DELETE");
        Label LD1 = new Label("Reg No: ");
        Label LD2 = new Label("Name: ");
        Label LD3 = new Label("Marks: ");
        FDel.setBackground(Color.blue.darker());

        PD1.add(LD1);
        PD1.add(TD1);
        PD1.add(BD1);
        FDel.add(PD1);
        PD2.add(LD2);
        PD2.add(TD2);
        PD2.add(LD3);
        PD2.add(TD3);
        PD2.add(Delete);
        FDel.add(PD2);
        PD2.setVisible(false);
        FDel.setSize(400, 400);
        EventHandler E4 = new EventHandler(FDel);
        B4.addActionListener(E4);

        EventHandler3 ED1 = new EventHandler3(TD1, TD2, TD3, PD2);
        BD1.addActionListener(ED1);
        Delete.addActionListener(ED1);

        //VIEW FRAME
        Frame FView = new Frame("View");
        FView.addWindowListener(new

                                        WindowAdapter() {
                                            public void windowClosing(WindowEvent e) {
                                                FView.dispose();
                                            }
                                        });

        Panel PV1 = new Panel();
        Panel PV2 = new Panel();
        TextField TV1 = new TextField(10);
        TextField TV2 = new TextField(10);
        TextField TV3 = new TextField(10);
        Button BV1 = new Button("SEARCH");
        Label LV1 = new Label("Reg No: ");
        Label LV2 = new Label("Name: ");
        Label LV3 = new Label("Marks: ");
        FView.setBackground(Color.GREEN.darker());

        PV1.add(LV1);
        PV1.add(TV1);
        PV1.add(BV1);
        FView.add(PV1, BorderLayout.NORTH);
        PV2.add(LV2);
        PV2.add(TV2);
        PV2.add(LV3);
        PV2.add(TV3);
        PV2.add(BV1);
        FView.add(PV2);
        FView.setSize(400, 400);
        EventHandler E2 = new EventHandler(FView);
        B2.addActionListener(E2);

        EventHandler3 EV1 = new EventHandler3(TV1, TV2, TV3, PV2);
        BV1.addActionListener(EV1);

        //EDIT FRAME
        Frame FEdit = new Frame("Edit");
        FEdit.addWindowListener(new

                                        WindowAdapter() {
                                            public void windowClosing(WindowEvent e) {
                                                FEdit.dispose();
                                            }
                                        });
        Panel PED1 = new Panel();
        Panel PED2 = new Panel();
        TextField TED1 = new TextField(10);
        TextField TED2 = new TextField(10);
        TextField TED3 = new TextField(10);
        Button BED2 = new Button("...");
        Button Update = new Button("UPDATE");
        Label LED1 = new Label("Reg No: ");
        Label LED2 = new Label("Name: ");
        Label LED3 = new Label("Marks: ");
        FEdit.setBackground(Color.yellow.darker());

        PED1.add(LED1);
        PED1.add(TED1);
        PED1.add(BED2);
        FEdit.add(PED1, BorderLayout.NORTH);
        PED2.add(LED2);
        PED2.add(TED2);
        PED2.add(LED3);
        PED2.add(TED3);
        PED2.add(Update);
        FEdit.add(PED2);
        FEdit.setSize(400, 400);
        EventHandler E3 = new EventHandler(FEdit);
        B3.addActionListener(E3);

        EventHandler4 EDI1 = new EventHandler4(TED1, TED2, TED3, PED2);
        Update.addActionListener(EDI1);
        BED2.addActionListener(EDI1);

        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent A) {
                F.dispose();
                FEntry.setVisible(true);
            }
        });
    }
}


