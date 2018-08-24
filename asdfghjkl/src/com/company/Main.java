package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.lang.*;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.table.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(78.9%10);
        JFrame Login = new JFrame("Login");
        JFrame Home = new JFrame("Home");
        JFrame CFrame = new JFrame("Create");
        JFrame NFrame = new JFrame("New Account");
        JFrame EFrame = new JFrame("Edit");
        JFrame DFrame = new JFrame("Deposit");
        JFrame WFrame = new JFrame("Withdrawals");
        JFrame TFrame = new JFrame("Transfers");
        JFrame RFrame = new JFrame("Reports");
        JFrame BFrame = new JFrame("Balance");
        JFrame SFrame = new JFrame("Statement");
        JFrame MFrame = new JFrame("Male accounts");
        JFrame FeFrame = new JFrame("Female accounts");
        JFrame AFrame = new JFrame("All accounts");

        Home.setSize(400, 500);
        Home.setLayout(new FlowLayout());
        CFrame.setSize(400, 500);
        CFrame.setLayout(new GridLayout(9, 1));
        NFrame.setSize(400, 500);
        NFrame.setLayout(new GridLayout(9, 1));
        EFrame.setLayout(new GridLayout(9, 1));
        DFrame.setSize(400, 500);
        DFrame.setLayout(new GridLayout(10, 1));
        WFrame.setSize(400, 500);
        WFrame.setLayout(new FlowLayout());
        TFrame.setSize(400, 500);
        TFrame.setLayout(new FlowLayout());
        RFrame.setSize(400, 500);
        RFrame.setLayout(new FlowLayout());
        BFrame.setSize(400, 500);
        BFrame.setLayout(new GridLayout(3, 1));
        SFrame.setSize(400, 500);
        SFrame.setLayout(new GridLayout(7, 1));
        MFrame.setSize(400, 500);
        MFrame.setLayout(new BorderLayout());
        FeFrame.setSize(400, 500);
        FeFrame.setLayout(new BorderLayout());
        AFrame.setSize(400, 500);
        AFrame.setLayout(new BorderLayout());
        Font F = new Font("", Font.BOLD, 16);
        Login.setLayout(new GridLayout(3, 1));
        Login.getContentPane().setBackground(Color.CYAN.darker());
        Home.getContentPane().setBackground(Color.CYAN.darker());
        JPanel P1 = new JPanel();
        JPanel P2 = new JPanel();
        JPanel P3 = new JPanel();
        P1.setBackground(new Color(0, 0, 0, 70));
        P2.setBackground(new Color(0, 0, 0, 90));
        P3.setBackground(new Color(0, 0, 0, 70));
        JLabel UName = new JLabel("Username: ");
        UName.setFont(F);
        JLabel Pword = new JLabel("Password: ");
        Pword.setFont(F);
        JLabel Error = new JLabel("Username or password incorrect");
        JLabel Done = new JLabel("Successfully logged in");
        JTextField Username = new JTextField(20);
        JButton LoginBtn = new JButton("Login");
        JPasswordField Password = new JPasswordField(20);
        P2.add(UName);
        P2.add(Username);
        P2.add(Pword);
        P2.add(Password);
        P2.add(LoginBtn);
        P1.add(Error);
        P1.add(Done);
        P2.setLayout(new FlowLayout());
        Error.setVisible(false);
        Done.setVisible(false);
        Login.add(P1);
        Login.add(P2);
        Login.add(P3);
        Login.setSize(400, 500);
        Login.setVisible(true);
        LoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S = C.createStatement();
                    ResultSet R = S.executeQuery("SELECT Name, username, Password FROM User WHERE username = '" + Username.getText() + "'");
                    while (R.next()) {
                        String P = R.getString("Password");
                        //System.out.println(P);
                        String U = R.getString("Username");
                        //System.out.println(U);
                        String Name = R.getString("Name");
                        //System.out.println(Name);
                        if (new String(Password.getPassword()).equals(P) && Username.getText().equals(U)) {
                            Home.setVisible(true);
                            Username.setText("");
                            Password.setText("");
                            JLabel Hello = new JLabel("Hello " + Name + "!");
                            Home.add(Hello);
                            Login.dispose();
                        } else {
                            Error.setVisible(true);
                            Username.setText("");
                            Password.setText("");
                        }
                    }
                } catch (Exception X) {
                    System.out.println(X.toString());
                }
            }
        });

        JMenuBar Bar = new JMenuBar();
        JMenu Users = new JMenu("Users");
        JMenuItem Create = new JMenuItem("Create User");
        Create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CFrame.setVisible(true);
            }
        });
        JMenuItem AddNA = new JMenuItem("Add New Account");
        AddNA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NFrame.setVisible(true);
            }
        });
        JMenuItem Edit = new JMenuItem("Edit existing");
        Edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EFrame.setVisible(true);
            }
        });
        JMenu Banking = new JMenu("Banking");
        JMenuItem Deposit = new JMenuItem("Deposit");
        Deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DFrame.setVisible(true);
            }
        });
        JMenuItem Withdraw = new JMenuItem("Withdraw");
        Withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WFrame.setVisible(true);
            }
        });
        JMenuItem Transfer = new JMenuItem("Transfer");
        Transfer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TFrame.setVisible(true);
            }
        });
        JMenu Reports = new JMenu("Reports");
        Reports.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RFrame.setVisible(true);
            }
        });
        JMenuItem Balance = new JMenuItem("Balance");
        Reports.add(Balance);
        Balance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BFrame.setVisible(true);
            }
        });
        JMenuItem Statement = new JMenuItem("Statement");
        Reports.add(Statement);
        Statement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SFrame.setVisible(true);
            }
        });
        //JMenu Logout = new JMenu("Logout");
        //Logout.addActionListener(new ActionListener() {
        // @Override
        // public void actionPerformed(ActionEvent e) {
//                Login.setVisible(true);
        //}
        // });
        Users.add(Create);
        Users.add(AddNA);
        Users.add(Edit);
        Banking.add(Deposit);
        Banking.add(Withdraw);
        Banking.add(Transfer);
        Bar.add(Users);
        Bar.add(Banking);
        Bar.add(Reports);
        //Bar.add(Logout);
        Home.setJMenuBar(Bar);
        //CFrame.setJMenuBar(Bar);
        //EFrame.setJMenuBar(Bar);
        //DFrame.setJMenuBar(Bar);
        //WFrame.setJMenuBar(Bar);
        //TFrame.setJMenuBar(Bar);
        //RFrame.setJMenuBar(Bar);


        //Create user
        JPanel C1 = new JPanel();
        JPanel C2 = new JPanel();
        JPanel C3 = new JPanel();
        JPanel C4 = new JPanel();
        JPanel C5 = new JPanel();
        JPanel C6 = new JPanel();
        JPanel C7 = new JPanel();
        JPanel C8 = new JPanel();
        JPanel C9 = new JPanel();
        C1.setLayout(new FlowLayout());
        C2.setLayout(new FlowLayout());
        C3.setLayout(new FlowLayout());
        C4.setLayout(new GridLayout(1, 2));
        C5.setLayout(new GridLayout(1, 2));
        C6.setLayout(new FlowLayout());
        C7.setLayout(new FlowLayout());
        C8.setLayout(new FlowLayout());
        C9.setLayout(new FlowLayout());
        JTextField AddName = new JTextField(20);
        JTextField AddAdd = new JTextField(20);
        JTextField AddEmail = new JTextField(20);
        JTextField AddUName = new JTextField(20);
        JPasswordField AddPass = new JPasswordField(20);
        JRadioButton Male = new JRadioButton("Male");
        JRadioButton Female = new JRadioButton("Female");
        JRadioButton Current = new JRadioButton("Current");
        JRadioButton Savings = new JRadioButton("Savings");
        ButtonGroup Gender = new ButtonGroup();
        ButtonGroup AccType = new ButtonGroup();
        Gender.add(Female);
        Gender.add(Male);
        AccType.add(Current);
        AccType.add(Savings);
        JButton Add = new JButton("Create");
        JLabel AddN = new JLabel("Name: ");
        JLabel AddA = new JLabel("Address: ");
        JLabel AddE = new JLabel("Email: ");
        JLabel AddG = new JLabel("Gender: ");
        JLabel AddAc = new JLabel("Account Type: ");
        JLabel UNam = new JLabel("Username: ");
        JLabel Pwd = new JLabel("Password: ");
        C1.add(AddN);
        C1.add(AddName);
        C2.add(AddA);
        C2.add(AddAdd);
        C3.add(AddE);
        C3.add(AddEmail);
        C4.add(AddG);
        C4.add(Female);
        C4.add(Male);
        C5.add(AddAc);
        C5.add(Current);
        C5.add(Savings);
        C6.add(UNam);
        C6.add(AddUName);
        C7.add(Pwd);
        C7.add(AddPass);
        C8.add(Add);
        CFrame.add(C1);
        CFrame.add(C2);
        CFrame.add(C3);
        CFrame.add(C4);
        CFrame.add(C5);
        CFrame.add(C6);
        CFrame.add(C7);
        CFrame.add(C8);
        JLabel AcNo = new JLabel();
        C9.add(AcNo);
        C9.setVisible(true);
        CFrame.add(C9);
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String CAccNo;
                try {
                    String name = AddName.getText();
                    String add = AddAdd.getText();
                    String email = AddEmail.getText();
                    String gender = "";
                    String acctyp = "";
                    String uname = AddUName.getText();
                    String pword = new String(AddPass.getPassword());
                    CAccNo = "";
                    if (Male.isSelected())
                        gender = "M";
                    else gender = "F";
                    if (Current.isSelected())
                        acctyp = "C";
                    else acctyp = "S";

                    CAccNo = acctyp + gender;
                    System.out.println(CAccNo);
//                    if (acctyp.equals("C"))
//                        CAccNo.equals("C");
//                    else if (acctyp.equals("Savings"))
//                        CAccNo.equals("S");
//                    System.out.println(CAccNo);
//                    if (gender.equals("Female"))
//                        CAccNo = CAccNo + "F";
//                    else CAccNo = CAccNo + "M";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    Statement S3 = C.createStatement();
                    ResultSet R = S1.executeQuery("SELECT * FROM accounts ORDER BY AccountNumber DESC");
                    int no = 0;
                    System.out.println(CAccNo);
                    while (R.next()) {
                        String check = R.getString("AccountNumber");
                        if (CAccNo.substring(0, 2).equals(check.substring(0, 2))) {
                            System.out.println("ello");
                            no = Integer.parseInt(R.getString("AccountNumber").substring(4));
                            break;
                        }
                    }
                    //no = Integer.parseInt(prior.substring(4));
                    int newno = no + 1;
                    System.out.println(newno);
                    if (newno < 10) {
                        CAccNo = CAccNo + "00" + Integer.toString(newno);
                    } else if (newno >= 10 && newno < 100) {
                        CAccNo = CAccNo + "0" + Integer.toString(newno);
                    }
                    S2.executeUpdate("INSERT INTO user VALUES ('" + name + "','" + add + "','" + email + "','" + uname + "','" + pword + "')");
                    System.out.println(CAccNo);
                    S3.executeUpdate("INSERT INTO accounts (Name, accountnumber) VALUES ('" + name + "','" + CAccNo + "')");
                    System.out.println(CAccNo);
                    AcNo.setText("Your Account Number is " + CAccNo + ". Please remember it!");
                    AddName.setText("");
                    AddAdd.setText("");
                    AddEmail.setText("");
                    AddUName.setText("");
                    AddPass.setText("");
                } catch (Exception X) {
                    System.out.println(X.toString());
                    System.out.println("Insert");
                }
            }
        });

        //New Account
        JPanel N1 = new JPanel();
        JPanel N2 = new JPanel();
        JPanel N3 = new JPanel();
        JPanel N4 = new JPanel();
        JPanel N5 = new JPanel();
        JPanel N6 = new JPanel();
        JPanel N7 = new JPanel();
        JPanel N8 = new JPanel();
        JPanel N9 = new JPanel();
        N1.setLayout(new FlowLayout());
        N2.setLayout(new FlowLayout());
        N3.setLayout(new FlowLayout());
        N6.setLayout(new GridLayout(1, 2));
        N7.setLayout(new GridLayout(1, 2));
        N4.setLayout(new FlowLayout());
        N5.setLayout(new FlowLayout());
        N8.setLayout(new FlowLayout());
        N9.setLayout(new FlowLayout());
        JLabel NUser = new JLabel("Username: ");
        JLabel NPass = new JLabel("Password: ");
        JLabel NNam = new JLabel("Name: ");
        JLabel NAdd = new JLabel("Address: ");
        JLabel NEma = new JLabel("Email: ");
        JLabel NAccT = new JLabel("Account Type: ");
        JLabel NNewAcc = new JLabel();
        JTextField NUserTxt = new JTextField(10);
        JPasswordField NPassTxt = new JPasswordField(10);
        JTextField NName = new JTextField(10);
        JTextField NAddress = new JTextField(10);
        JTextField NEmail = new JTextField(10);
        JRadioButton NCurr = new JRadioButton("Current");
        JRadioButton NSav = new JRadioButton("Savings");
        ButtonGroup NAcc = new ButtonGroup();
        JButton NLoginBtn = new JButton("Login");
        JButton NNewBtn = new JButton("Create new account");
        NAcc.add(NCurr);
        NAcc.add(NSav);
        N1.add(NUser);
        N1.add(NUserTxt);
        N2.add(NPass);
        N2.add(NPassTxt);
        N3.add(NLoginBtn);
        N4.add(NNam);
        N4.add(NName);
        N5.add(NAdd);
        N5.add(NAddress);
        N6.add(NEma);
        N6.add(NEmail);
        N7.add(NAccT);
        N7.add(NCurr);
        N7.add(NSav);
        N8.add(NNewBtn);
        N9.add(NNewAcc);
        NFrame.add(N1);
        NFrame.add(N2);
        NFrame.add(N3);
        NFrame.add(N4);
        NFrame.add(N5);
        NFrame.add(N6);
        NFrame.add(N7);
        NFrame.add(N8);
        NFrame.add(N9);
        N9.setVisible(false);
        N4.setVisible(false);
        N5.setVisible(false);
        N6.setVisible(false);
        N7.setVisible(false);
        N8.setVisible(false);
        N9.setVisible(false);
        NLoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S = C.createStatement();
                    ResultSet R = S.executeQuery("SELECT Name, username, Password FROM User WHERE username = '" + NUserTxt.getText() + "'");
                    while (R.next()) {
                        String NP = R.getString("Password");
                        //System.out.println(P);
                        String NU = R.getString("Username");
                        //System.out.println(U);
                        String NN = R.getString("Name");
                        //System.out.println(Name);
                        if (new String(NPassTxt.getPassword()).equals(NP) && NUserTxt.getText().equals(NU)) {
                            N4.setVisible(true);
                            N5.setVisible(true);
                            N6.setVisible(true);
                            N7.setVisible(true);
                            N8.setVisible(true);
                            JLabel NHello = new JLabel("Hello " + NN + "!");
                            N3.add(NHello);
                            ResultSet R2 = S.executeQuery("SELECT * FROM user WHERE username = '" + NUserTxt.getText() + "'");
                            while (R2.next()) {
                                NName.setText(R2.getString("Name"));
                                NAddress.setText(R2.getString("Address"));
                                NEmail.setText(R2.getString("Email"));
                            }
                        } else {
                            JLabel NError = new JLabel("Incorrect login details");
                            N3.add(NError);
                            NUserTxt.setText("");
                            NPassTxt.setText("");
                        }
                    }
                } catch (Exception X) {
                    System.out.println(X.toString());
                }
            }
        });
        NNewBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Nname = NName.getText();
                    String add = NAdd.getText();
                    String email = NEmail.getText();
                    String NAccNo = "";
                    String ncheck = "";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    Statement S3 = C.createStatement();
                    ResultSet R = S1.executeQuery("SELECT * FROM accounts ORDER BY AccountNumber DESC");
                    int no = 0;
                    String prior = "";
                    while (R.next()) {
                        ResultSet R2 = S2.executeQuery("SELECT * FROM accounts WHERE name = '" + NName.getText() + "' ORDER BY AccountNumber DESC");
                        while (R2.next()) {
                            ncheck = R2.getString("AccountNumber");
                        }
                        //ncheck = R2.getString("AccountNumber");
                        if (NCurr.isSelected())
                            NAccNo = "C";
                        else if (NSav.isSelected())
                            NAccNo = "S";
                        System.out.println(NAccNo);
                        prior = R.getString("AccountNumber");
                        NAccNo = NAccNo + ncheck.substring(1, 2);
                        System.out.println(NAccNo);
                        if (NAccNo.substring(0, 2).equals(prior.substring(0, 2))) {
                            System.out.println("ello");
                            no = Integer.parseInt(R.getString("AccountNumber").substring(4));
                            System.out.println(no);
                            break;
                        }
                    }
                    //no = Integer.parseInt(prior.substring(4));
                    //no = no + 1;
                    int newno = no + 1;
                    System.out.println(newno);
                    if (newno < 10) {
                        NAccNo = NAccNo + "00" + Integer.toString(newno);
                    } else if (newno >= 10 && newno < 100) {
                        NAccNo = NAccNo + "0" + Integer.toString(newno);
                    }
                    //S2.executeUpdate("INSERT INTO user VALUES ('" + name + "','" + add + "','" + email + "','" + uname + "','" + pword + "')");
                    System.out.println(NAccNo);
                    S3.executeUpdate("INSERT INTO accounts (Name, accountnumber) VALUES ('" + Nname + "','" + NAccNo + "')");
                    System.out.println(NAccNo);
                    N9.setVisible(true);
                    NNewAcc.setText("Your Account Number is " + NAccNo + ". Please remember it!");
                    NName.setText("");
                    NAddress.setText("");
                    NEmail.setText("");
                    NUserTxt.setText("");
                    NPassTxt.setText("");
                } catch (Exception X) {
                    System.out.println(X.toString());
                    System.out.println("Edit");
                }
            }
        });
        //Edit User
        EFrame.setSize(400, 500);
        JPanel E1 = new JPanel();
        JPanel E2 = new JPanel();
        JPanel E3 = new JPanel();
        JPanel E4 = new JPanel();
        JPanel E5 = new JPanel();
        JPanel E6 = new JPanel();
        JPanel E7 = new JPanel();
        JPanel E8 = new JPanel();
        JPanel E9 = new JPanel();
        E1.setLayout(new FlowLayout());
        E2.setLayout(new FlowLayout());
        E3.setLayout(new FlowLayout());
        E6.setLayout(new GridLayout(1, 2));
        E7.setLayout(new GridLayout(1, 2));
        E4.setLayout(new FlowLayout());
        E5.setLayout(new FlowLayout());
        E8.setLayout(new FlowLayout());
        E9.setLayout(new FlowLayout());
        JLabel EAcc = new JLabel("Account Number: ");
        JLabel Det = new JLabel("User Details: ");
        JLabel EdN = new JLabel("Name: ");
        JLabel EdA = new JLabel("Address: ");
        JLabel EdE = new JLabel("Email: ");
        JLabel EdG = new JLabel("Gender: ");
        JLabel EdAc = new JLabel("Account Type: ");
        JTextField EditAcc = new JTextField(20);
        JTextField EditName = new JTextField(20);
        JTextField EditAdd = new JTextField(20);
        JTextField EditEmail = new JTextField(20);
        JButton UpdateBtn = new JButton("Update");
        JButton Find = new JButton("Find");
        JRadioButton EMale = new JRadioButton("Male");
        JRadioButton EFemale = new JRadioButton("Female");
        JRadioButton ECurrent = new JRadioButton("Current");
        JRadioButton ESavings = new JRadioButton("Savings");
        ButtonGroup EGender = new ButtonGroup();
        ButtonGroup EAccType = new ButtonGroup();
        EGender.add(EFemale);
        EGender.add(EMale);
        EAccType.add(ECurrent);
        EAccType.add(ESavings);
        E1.add(EAcc);
        E1.add(EditAcc);
        E1.add(Find);
        E2.add(Det);
        E3.add(EdN);
        E3.add(EditName);
        E4.add(EdA);
        E4.add(EditAdd);
        E5.add(EdE);
        E5.add(EditEmail);
        //E6.add(EdG);
        //E6.add(EFemale);
        //E6.add(EMale);
        //E7.add(EdAc);
        //E7.add(ECurrent);
        //E7.add(ESavings);
        E9.add(UpdateBtn);
        EFrame.add(E1);
        EFrame.add(E2);
        EFrame.add(E3);
        EFrame.add(E4);
        EFrame.add(E5);
        EFrame.add(E6);
        EFrame.add(E7);
        EFrame.add(E8);
        EFrame.add(E9);
        E2.setVisible(false);
        E3.setVisible(false);
        E4.setVisible(false);
        E5.setVisible(false);
        E6.setVisible(false);
        E7.setVisible(false);
        E8.setVisible(false);
        E9.setVisible(false);
        JLabel done = new JLabel("Your details have been updated.");
        E8.add(done);
        done.setVisible(false);
        Find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT * FROM accounts WHERE accountnumber = '" + EditAcc.getText() + "'");
                    if (R1.next()) {
                        ResultSet R2 = S2.executeQuery("SELECT * FROM user WHERE name = '" + R1.getString("name") + "'");
                        if (R2.next()) {
                            EditName.setText(R2.getString("Name"));
                            EditAdd.setText(R2.getString("Address"));
                            EditEmail.setText(R2.getString("Email"));
                            E2.setVisible(true);
                            E3.setVisible(true);
                            E4.setVisible(true);
                            E5.setVisible(true);
                            E6.setVisible(true);
                            E7.setVisible(true);
                            E8.setVisible(true);
                            E9.setVisible(true);
                        }
                    } else {
                        Det.setText("Account Number not valid");
                        E3.setVisible(true);
                    }
                } catch (Exception E) {
                    System.out.println(E.toString());
                }
            }
        });
        UpdateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    Statement S3 = C.createStatement();
                    ResultSet R3 = S1.executeQuery("SELECT * FROM accounts WHERE accountnumber = '" + EditAcc.getText() + "'");
                    while (R3.next()) {
                        //ResultSet R4 = S2.executeQuery("SELECT * FROM users WHERE name = '" + R3.getString("name") + "'");
                        ResultSet R4 = S2.executeQuery("SELECT * FROM user WHERE name = '" + R3.getString("name") + "'");
                        while (R4.next()) {
                            String Ename2 = EditName.getText();
                            System.out.println(Ename2);
                            String Eadd2 = EditAdd.getText();
                            System.out.println(Eadd2);
                            String Eemail2 = EditEmail.getText();
                            System.out.println(Eemail2);
                            String edituname2 = R4.getString("username");
                            System.out.println(edituname2);
                            //S3.executeUpdate("UPDATE users SET  Name = '" + Ename2 + "', Address = '" + Eadd2 + "', Email = '" + Eemail2 + "' WHERE username = '" + edituname2 + "'");
                            S3.executeUpdate("UPDATE user SET  Name = '" + Ename2 + "', Address = '" + Eadd2 + "', Email = '" + Eemail2 + "' WHERE username = '" + edituname2 + "'");
                        }
                        EditName.setText("");
                        EditAdd.setText("");
                        EditEmail.setText("");
                        EditAcc.setText("");
                        done.setVisible(true);
                        Current.setSelected(false);
                        Savings.setSelected(false);

                    }
                } catch (Exception E) {
                    System.out.println(E.toString());
                    System.out.println("Update");
                } catch (Throwable throweee) {
                    throweee.printStackTrace();
                }
            }
        });

        //Deposit
        JPanel D1 = new JPanel();
        JPanel D2 = new JPanel();
        JPanel D3 = new JPanel();
        JPanel D4 = new JPanel();
        JPanel D5 = new JPanel();
        JPanel D6 = new JPanel();
        JPanel D7 = new JPanel();
        JPanel D8 = new JPanel();
        JPanel D9 = new JPanel();
        JPanel D10 = new JPanel();
        D1.setLayout(new FlowLayout());
        D2.setLayout(new FlowLayout());
        D3.setLayout(new FlowLayout());
        D6.setLayout(new FlowLayout());
        D7.setLayout(new FlowLayout());
        D4.setLayout(new FlowLayout());
        D5.setLayout(new FlowLayout());
        D8.setLayout(new FlowLayout());
        D9.setLayout(new FlowLayout());
        D10.setLayout(new FlowLayout());
        JLabel DAcc = new JLabel("Account Number: ");
        JLabel DDet = new JLabel("User Details: ");
        JLabel DepN = new JLabel("Name: ");
        JLabel DepA = new JLabel("Address: ");
        JLabel DepE = new JLabel("Email: ");
        JLabel DepAm = new JLabel("Deposit Amount: ");
        JTextField DepAcc = new JTextField(20);
        JTextField DepName = new JTextField(20);
        JTextField DepAdd = new JTextField(20);
        JTextField DepEmail = new JTextField(20);
        JTextField DepAmount = new JTextField(20);
        JButton DepositBtn = new JButton("Deposit");
        JButton DFind = new JButton("Find");

        D1.add(DAcc);
        D1.add(DepAcc);
        D1.add(DFind);
        D3.add(DDet);
        D4.add(DepN);
        D4.add(DepName);
        D5.add(DepA);
        D5.add(DepAdd);
        D6.add(DepE);
        D6.add(DepEmail);
        //D6.add(DepG);
        //D6.add(DepGen);
        // D7.add(DepAc);
        //D7.add(DepAccType);
        D8.add(DepAm);
        D8.add(DepAmount);
        D9.add(DepositBtn);

        DFrame.add(D2);
        DFrame.add(D1);
        DFrame.add(D3);
        DFrame.add(D4);
        DFrame.add(D5);
        DFrame.add(D6);
        DFrame.add(D7);
        DFrame.add(D8);
        DFrame.add(D9);
        DFrame.add(D10);
        //D2.setVisible(false);
        D3.setVisible(false);
        D4.setVisible(false);
        D5.setVisible(false);
        D6.setVisible(false);
        D7.setVisible(false);
        D8.setVisible(false);
        D9.setVisible(false);
        JLabel DepDone = new JLabel();
        D10.add(DepDone);
        D10.setVisible(false);
        DFind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Daccno = DepAcc.getText();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    Statement S3 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT * FROM accounts WHERE accountnumber = '" + Daccno + "'");
                    while (R1.next()) {
                        ResultSet R2 = S2.executeQuery("SELECT * FROM user WHERE name = '" + R1.getString("name") + "'");
                        D2.setVisible(true);
                        D3.setVisible(true);
                        D4.setVisible(true);
                        D5.setVisible(true);
                        D6.setVisible(true);
                        D7.setVisible(true);
                        D8.setVisible(true);
                        D9.setVisible(true);
                        while (R2.next()) {
                            DepName.setText(R2.getString("name"));
                            DepAdd.setText(R2.getString("Address"));
                            DepEmail.setText(R2.getString("Email"));
                        }
                    }
                    if (!R1.isAfterLast()) {
                        D2.setVisible(true);
                        JLabel nooo = new JLabel("Account number not valid");
                        D2.add(nooo);
                    }
                    //S3.executeUpdate("INSERT INTO moneyin (username, accountnumber) VALUES ('" + name + "','" + accno + "')");

                } catch (Exception E) {
                    System.out.println(E.toString());
                    System.out.println("Find dep");
                }
            }
        });

        DepositBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = DepName.getText();
                String accno = DepAcc.getText();
                try {
                    int depositam = Integer.parseInt(DepAmount.getText());
                    java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S = C.createStatement();
                    S.executeUpdate("INSERT INTO moneyin (username, accountnumber, deposits) VALUES ('" + name + "','" + accno + "'," + depositam + ")");
                    DepDone.setText("Your deposit of £" + depositam + " has been successful.");
                    D10.setVisible(true);
                } catch (Exception E) {
                    System.out.println(E.toString());
                    System.out.println("Deposit");
                }
            }
        });

        //Withdraw
        JPanel W1 = new JPanel();
        JPanel W2 = new JPanel();
        JPanel W3 = new JPanel();
        JPanel W4 = new JPanel();
        JPanel W5 = new JPanel();
        JPanel W6 = new JPanel();
        JPanel W7 = new JPanel();
        JPanel W8 = new JPanel();
        JPanel W9 = new JPanel();
        JPanel W10 = new JPanel();
        JPanel W11 = new JPanel();
        W1.setLayout(new FlowLayout());
        W2.setLayout(new FlowLayout());
        W3.setLayout(new FlowLayout());
        W6.setLayout(new FlowLayout());
        W7.setLayout(new FlowLayout());
        W4.setLayout(new FlowLayout());
        W5.setLayout(new FlowLayout());
        W8.setLayout(new FlowLayout());
        W9.setLayout(new FlowLayout());
        W10.setLayout(new FlowLayout());
        W11.setLayout(new FlowLayout());
        JLabel WAcc = new JLabel("Account Number: ");
        JLabel WDet = new JLabel("User Details: ");
        JLabel WithN = new JLabel("Name: ");
        JLabel WithA = new JLabel("Address: ");
        JLabel WithE = new JLabel("Email: ");
        JLabel WithAm = new JLabel("Withdraw Amount: ");
        JTextField WithAcc = new JTextField(20);
        JTextField WithName = new JTextField(20);
        JTextField WithAdd = new JTextField(20);
        JTextField WithEmail = new JTextField(20);
        JTextField WithAmount = new JTextField(20);
        JButton WithdrawalBtn = new JButton("Withdraw");
        JButton WFind = new JButton("Find");

        W1.add(WAcc);
        W1.add(WithAcc);
        W2.add(WFind);
        W3.add(WDet);
        W4.add(WithN);
        W4.add(WithName);
        W5.add(WithA);
        W5.add(WithAdd);
        W6.add(WithE);
        W6.add(WithEmail);
        //D6.add(DepG);
        //D6.add(DepGen);
        // D7.add(DepAc);
        //D7.add(DepAccType);
        W8.add(WithAm);
        W8.add(WithAmount);
        W9.add(WithdrawalBtn);

        WFrame.add(W1);
        WFrame.add(W2);
        WFrame.add(W3);
        WFrame.add(W4);
        WFrame.add(W5);
        WFrame.add(W6);
        WFrame.add(W7);
        WFrame.add(W8);
        WFrame.add(W9);
        WFrame.add(W10);
        WFrame.add(W11);
        //D2.setVisible(false);
        W3.setVisible(false);
        W4.setVisible(false);
        W5.setVisible(false);
        W6.setVisible(false);
        W7.setVisible(false);
        W8.setVisible(false);
        W9.setVisible(false);
        JLabel WithDone = new JLabel();
        W10.add(WithDone);
        W10.setVisible(false);
        JLabel WithBal = new JLabel();
        W11.add(WithBal);
        W11.setVisible(false);
        WFind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Wname = WithName.getText();
                String Waccno = WithAcc.getText();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT * FROM accounts WHERE accountnumber = '" + Waccno + "'");
                    while (R1.next()) {
                        ResultSet R2 = S2.executeQuery("SELECT * FROM user WHERE  name = '" + R1.getString("name") + "'");
                        while (R2.next()) {
                            if (R1.getString("accountnumber") == WithAcc.getText())
                                W2.setVisible(true);
                            W3.setVisible(true);
                            W4.setVisible(true);
                            W5.setVisible(true);
                            W6.setVisible(true);
                            W7.setVisible(true);
                            W8.setVisible(true);
                            W9.setVisible(true);
                            WithName.setText(R2.getString("Name"));
                            WithAdd.setText(R2.getString("Address"));
                            WithEmail.setText(R2.getString("Email"));
                        }
                    }
                } catch (Exception E) {
                    System.out.println(E.toString());
                    System.out.println("Find WITH");
                }
            }
        });

        WithdrawalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Wname = WithName.getText();
                String Waccno = WithAcc.getText();
                try {
                    int withdr = Integer.parseInt(WithAmount.getText());
                    java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    Statement S3 = C.createStatement();
                    Statement S4 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT SUM(deposits) as 'deposits1' FROM moneyin WHERE accountnumber = '" + Waccno + "'");
                    while (R1.next()) {
                        int DepInt = Integer.parseInt(R1.getString("deposits1"));
                        ResultSet R2 = S2.executeQuery("SELECT SUM(withdrawals + transfers) AS 'WTot' FROM moneyout WHERE accountnumber = '" + Waccno + "'");
                        if (R2.next()) {
                            while (R2.next()) {
                                int outInt = Integer.parseInt(R2.getString("WTot"));
                                //int TransInt = Integer.parseInt(R2.getString("transfers"));
                                if (Integer.parseInt(R1.getString("deposits1")) > (outInt + withdr)) {
                                    WithDone.setText("Your withdrawal of £" + withdr + " has been successful.");
                                    W10.setVisible(true);
                                    WithBal.setText("Your new balance is £" + (Integer.parseInt(R1.getString("deposits1")) - (outInt + withdr)));
                                    W11.setVisible(true);
                                    S4.executeUpdate("INSERT INTO moneyout (username, accountnumber, withdrawals) VALUES ('" + Wname + "','" + Waccno + "'," + withdr + ")");
                                } else {
                                    WithDone.setText("You don't have enough funds to withdraw from.");
                                    W10.setVisible(true);
                                }
                            }
                        } else {
                            int outInt = Integer.parseInt(R2.getString("WTot"));
                            System.out.println(outInt);
                            //int TransInt = Integer.parseInt(R2.getString("transfers"));
                            if (Integer.parseInt(R1.getString("deposits1")) > withdr) {
                                S3.executeUpdate("INSERT INTO moneyout (username, accountnumber, withdrawals) VALUES ('" + Wname + "','" + Waccno + "'," + withdr + ")");
                                WithDone.setText("Your withdrawal of £" + withdr + " has been successful.");
                                W10.setVisible(true);
                                WithBal.setText("Your new balance is £" + (DepInt - (outInt + withdr)));
                                W11.setVisible(true);
                            } else {
                                WithDone.setText("You don't have enough funds to withdraw from.");
                                W10.setVisible(true);
                            }
                        }
                    }
                } catch (
                        Exception E)

                {
                    System.out.println(E.toString());
                    System.out.println("Withdraw");
                }
            }
        });

        //Transfer
        JPanel T1 = new JPanel();
        JPanel T2 = new JPanel();
        JPanel T3 = new JPanel();
        JPanel T4 = new JPanel();
        JPanel T5 = new JPanel();
        JPanel T6 = new JPanel();
        JPanel T7 = new JPanel();
        JPanel T8 = new JPanel();
        JPanel T9 = new JPanel();
        JPanel T10 = new JPanel();
        JPanel T11 = new JPanel();
        T1.setLayout(new FlowLayout());
        T2.setLayout(new FlowLayout());
        T3.setLayout(new FlowLayout());
        T6.setLayout(new FlowLayout());
        T7.setLayout(new FlowLayout());
        T4.setLayout(new FlowLayout());
        T5.setLayout(new FlowLayout());
        T8.setLayout(new FlowLayout());
        T9.setLayout(new FlowLayout());
        T10.setLayout(new FlowLayout());
        T11.setLayout(new FlowLayout());
        JLabel TransAcc = new JLabel("Account Number: ");
        JLabel TransDet = new JLabel("User Details: ");
        JLabel TransN = new JLabel("Name: ");
        JLabel TransA = new JLabel("Address: ");
        JLabel TransE = new JLabel("Email: ");
        JLabel TransAm = new JLabel("Transfer Amount: ");
        JLabel TransTo = new JLabel("Recipient Account");
        JTextField TransAccTxt = new JTextField(20);
        JTextField TransNameTxt = new JTextField(20);
        JTextField TransAddTxt = new JTextField(20);
        JTextField TransEmailTxt = new JTextField(20);
        JTextField TransAmountTxt = new JTextField(20);
        JTextField TransToTxt = new JTextField(10);
        JButton TransferBtn = new JButton("Transfer");
        JButton TFind = new JButton("Find");

        T1.add(TransAcc);
        T1.add(TransAccTxt);
        T2.add(TFind);
        T3.add(TransDet);
        T4.add(TransN);
        T4.add(TransNameTxt);
        T5.add(TransA);
        T5.add(TransAddTxt);
        T6.add(TransE);
        T6.add(TransEmailTxt);
        T7.add(TransTo);
        T7.add(TransToTxt);
        T8.add(TransAm);
        T8.add(TransAmountTxt);
        T9.add(TransferBtn);

        TFrame.add(T1);
        TFrame.add(T2);
        TFrame.add(T3);
        TFrame.add(T4);
        TFrame.add(T5);
        TFrame.add(T6);
        TFrame.add(T7);
        TFrame.add(T8);
        TFrame.add(T9);
        TFrame.add(T10);
        TFrame.add(T11);
        T3.setVisible(false);
        T4.setVisible(false);
        T5.setVisible(false);
        T6.setVisible(false);
        T7.setVisible(false);
        T8.setVisible(false);
        T9.setVisible(false);
        JLabel TransDone = new JLabel();
        T10.add(TransDone);
        T10.setVisible(false);
        JLabel TransBal = new JLabel();
        T11.add(TransBal);
        T11.setVisible(false);
        TFind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Taccno = TransAccTxt.getText();
                //String Tname = TransNameTxt.getText();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT * FROM accounts WHERE accountnumber = '" + Taccno + "'");
                    while (R1.next()) {
                        ResultSet R2 = S2.executeQuery("SELECT * FROM user WHERE name = '" + R1.getString("name") + "'");
                        while (R2.next()) {
                            if (R1.getString("accountnumber") == Taccno)
                                T3.setVisible(true);
                            T4.setVisible(true);
                            T5.setVisible(true);
                            T6.setVisible(true);
                            T7.setVisible(true);
                            T8.setVisible(true);
                            T9.setVisible(true);
                            T10.setVisible(true);
                            T11.setVisible(true);
                            TransNameTxt.setText(R2.getString("Name"));
                            TransAddTxt.setText(R2.getString("Address"));
                            TransEmailTxt.setText(R2.getString("Email"));
                            break;

                        }
                    }
                } catch (Exception E) {
                    System.out.println(E.toString());
                    System.out.println("Find tran");
                }
            }
        });

        TransferBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Tname = TransNameTxt.getText();
                    String Taccno = TransAccTxt.getText();
                    String TransToAcc = TransToTxt.getText();
                    int trans = Integer.parseInt(TransAmountTxt.getText());
                    System.out.println(trans);
                    java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    Statement S3 = C.createStatement();
                    Statement S6 = C.createStatement();
                    Statement S7 = C.createStatement();
                    Statement S8 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT SUM(deposits) as 'deposits' FROM moneyin WHERE accountnumber = '" + Taccno + "'");
                    while (R1.next()) {
                        System.out.println("1");
                        ResultSet R2 = S2.executeQuery("SELECT SUM(withdrawals + transfers) AS 'Tout' FROM moneyout WHERE accountnumber = '" + Taccno + "'");
                        //if (!R2.first() && !R2.next())
                        if (!R2.isAfterLast() | !R1.isAfterLast()) {
                            //System.out.println(R2.getString("Tout"));
                            if (Integer.parseInt(R1.getString("deposits")) > trans) {
                                ResultSet R4 = S8.executeQuery("SELECT * FROM accounts WHERE accountnumber = '" + TransToAcc + "'");
                                while (R4.next()) {
                                    String TToname = R4.getString("name");
                                    S6.executeUpdate("INSERT INTO moneyin (username, accountnumber, deposits) VALUES ('" + TToname + "','" + TransToAcc + "'," + trans + ")");
                                    S7.executeUpdate("INSERT INTO moneyout (username, accountnumber, transfers) VALUES ('" + Tname + "','" + Taccno + "'," + trans + ")");
                                    TransDone.setText("Your transfer of £" + trans + " to " + TToname + " has been successful.");
                                    T10.setVisible(true);
                                    TransBal.setText("Your new balance is £" + (Integer.parseInt(R1.getString("deposits")) - ((Integer.parseInt(R2.getString("Tout")) + trans))));
                                    T11.setVisible(true);
                                }
                            } else {
                                TransDone.setText("You don't have enough funds to transfer.");
                                T10.setVisible(true);
                            }
                        } else if (Integer.parseInt(R1.getString("deposits")) > (Integer.parseInt(R2.getString("Tout")) + trans)) {
                            Statement S4 = C.createStatement();
                            Statement S5 = C.createStatement();
                            ResultSet R3 = S3.executeQuery("SELECT * FROM accounts WHERE accountnumber = '" + TransToAcc + "'");
                            while (R3.next()) {
                                String TToname = R3.getString("name");
                                S4.executeUpdate("INSERT INTO moneyin (username, accountnumber, deposits) VALUES ('" + TToname + "','" + TransToAcc + "'," + trans + ")");

                                S5.executeUpdate("INSERT INTO moneyout (username, accountnumber, transfers) VALUES ('" + Tname + "','" + Taccno + "'," + trans + ")");

                                TransDone.setText("Your transfer of £" + trans + " to " + TToname + " has been successful.");
                                T10.setVisible(true);
                                TransBal.setText("Your new balance is £" + (Integer.parseInt(R1.getString("deposits")) - ((Integer.parseInt(R2.getString("Tout")) + trans))));
                                T11.setVisible(true);
                            }

                        } else {
                            TransDone.setText("You don't have enough funds to transfer.");
                            T10.setVisible(true);
                        }
                    }

                } catch (Exception E)

                {
                    System.out.println(E.toString());
                    System.out.println("Transfer");
                }
            }
        });

        //Reports
        JPanel B1 = new JPanel();
        JPanel B2 = new JPanel();
        JPanel B3 = new JPanel();
        JLabel BAcc = new JLabel("Account Number");
        JLabel BalanceIs = new JLabel();
        JTextField BAccNo = new JTextField(10);
        JButton BalanceBtn = new JButton("Show Balance");
        B1.add(BAcc);
        B1.add(BAccNo);
        B2.add(BalanceBtn);
        B3.add(BalanceIs);
        BFrame.add(B1);
        BFrame.add(B2);
        BFrame.add(B3);
        BalanceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Baccno = BAccNo.getText();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    Statement S3 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT * FROM accounts WHERE accountnumber = '" + Baccno + "'");
                    while (R1.next()) {
                        ResultSet R2 = S2.executeQuery("SELECT SUM(deposits) as 'deposits' FROM moneyin WHERE accountnumber = '" + Baccno + "'");
                        while (R2.next()) {
                            ResultSet R3 = S3.executeQuery("SELECT SUM(withdrawals + transfers) AS 'Tout' FROM moneyout WHERE accountnumber = '" + Baccno + "'");
                            while (R3.next()) {
                                int BalTot = Integer.parseInt(R2.getString("deposits")) - Integer.parseInt(R3.getString("Tout"));
                                BalanceIs.setText("Hi " + R1.getString("name") + ", your balance is £" + (BalTot));
                            }
                            B3.setVisible(true);
                        }
                    }

                } catch (Exception E) {
                    System.out.println(E.toString());
                    System.out.println("Balance");
                }
            }
        });

        //Statements
        JPanel SP1 = new JPanel();
        JPanel SP2 = new JPanel();
        JPanel SP3 = new JPanel();
        JPanel SP4 = new JPanel();
        JPanel SP5 = new JPanel();
        JPanel SP6 = new JPanel();
        JPanel SP7 = new JPanel();
        JLabel SAcc = new JLabel("Account Number: ");
        JTextField SAccNo = new JTextField(10);
        JButton SFind = new JButton("Show Statement");
        JLabel SDep = new JLabel("Deposits");
        JLabel SWit = new JLabel("Withdrawals");
        JLabel STran = new JLabel("Transfers");
        SP1.add(SAcc);
        SP1.add(SAccNo);
        SP1.add(SFind);
        SP2.setLayout(new BorderLayout());
        SP3.setLayout(new BorderLayout());
        SP4.setLayout(new BorderLayout());
        SP5.setLayout(new BorderLayout());
        SP6.setLayout(new BorderLayout());
        SP7.setLayout(new BorderLayout());
        SFrame.add(SP1);
        JTable t1 = new JTable();
        JTable t2 = new JTable();
        JTable t3 = new JTable();
        DefaultTableModel dm = new DefaultTableModel();
        DefaultTableModel dm2 = new DefaultTableModel();
        DefaultTableModel dm3 = new DefaultTableModel();
        SFind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Saccno = SAccNo.getText();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    Statement S3 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT username, withdrawals, date FROM moneyout WHERE accountnumber = '" + Saccno + "' ORDER BY 'date' ASC ");
                    ResultSet R2 = S2.executeQuery("SELECT username, transfers, date FROM moneyout WHERE accountnumber = '" + Saccno + "' ORDER BY 'date' ASC ");
                    ResultSet R3 = S3.executeQuery("SELECT username, deposits, date FROM moneyin WHERE accountnumber = '" + Saccno + "' ORDER BY 'date' ASC ");
                    ResultSetMetaData rsmd1 = R1.getMetaData();

                    int cols = rsmd1.getColumnCount();
                    String c[] = new String[cols];
                    for (int i = 0; i < cols; i++) {
                        c[i] = rsmd1.getColumnName(i + 1);
                        dm.addColumn(c[i]);
                    }
                    Object row[] = new Object[cols];
                    while (R1.next()) {
                        for (int i = 0; i < cols; i++) {
                            row[i] = R1.getString(i + 1);
                        }
                        if (Integer.parseInt(R1.getString("WITHDRAWALS")) != 0)
                            dm.addRow(row);
                    }
                    t3.setModel(dm);

                    ResultSetMetaData rsmd2 = R2.getMetaData();
                    int cols2 = rsmd2.getColumnCount();
                    String c2[] = new String[cols2];
                    for (int i = 0; i < cols2; i++) {
                        c2[i] = rsmd2.getColumnName(i + 1);
                        dm2.addColumn(c2[i]);
                    }
                    Object row2[] = new Object[cols2];
                    while (R2.next()) {
                        for (int i = 0; i < cols2; i++) {
                            row2[i] = R2.getString(i + 1);
                        }
                        if (Integer.parseInt(R2.getString("transfers")) != 0)
                            dm2.addRow(row2);
                    }
                    t2.setModel(dm2);

                    ResultSetMetaData rsmd3 = R3.getMetaData();
                    int cols3 = rsmd3.getColumnCount();
                    String c3[] = new String[cols3];
                    for (int i = 0; i < cols3; i++) {
                        c3[i] = rsmd3.getColumnName(i + 1);
                        dm3.addColumn(c3[i]);
                    }
                    Object row3[] = new Object[cols3];
                    while (R3.next()) {
                        for (int i = 0; i < cols3; i++) {
                            row3[i] = R3.getString(i + 1);
                        }
                        if (Integer.parseInt(R3.getString("deposits")) != 0)
                            dm3.addRow(row3);
                    }
                    t1.setModel(dm3);

                    if (t1.getRowCount() == 0 && t2.getRowCount() == 0 && t3.getRowCount() == 0) {
                        JLabel error = new JLabel("No history available");
                        SP2.add(error);
                    } else {

                        JScrollPane scrollPane1 = new JScrollPane(t1);
                        JScrollPane scrollPane2 = new JScrollPane(t2);
                        JScrollPane scrollPane3 = new JScrollPane(t3);

                        SP2.add(SDep);
                        SP3.add(scrollPane1);
                        SFrame.add(SP2);
                        SFrame.add(SP3);
                        SP4.add(SWit);
                        SP5.add(scrollPane2);
                        SFrame.add(SP4);
                        SFrame.add(SP5);
                        SP6.add(STran);
                        SP7.add(scrollPane3);
                        SFrame.add(SP6);
                        SFrame.add(SP7);
                    }
                } catch (Exception E) {
                    System.out.println(E.toString());
                }
            }
        });

        //Male
        JPanel MP1 = new JPanel();
        MP1.setLayout(new FlowLayout());
        JTable M1 = new JTable();
        DefaultTableModel Mdm = new DefaultTableModel();
        JMenuItem Males = new JMenuItem("Male Accounts");
        String FindGender = "M";
        Reports.add(Males);
        Males.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MFrame.setVisible(true);
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT name, accountnumber, date FROM accounts WHERE SUBSTRING(accountnumber, 2, 1) = '" + FindGender + "' ORDER BY 'date' ASC ");
                    ResultSetMetaData rsmd1 = R1.getMetaData();

                    int Mcols = rsmd1.getColumnCount();
                    String Mc[] = new String[Mcols];
                    for (int i = 0; i < Mcols; i++) {
                        Mc[i] = rsmd1.getColumnName(i + 1);
                        Mdm.addColumn(Mc[i]);
                    }
                    Object Mrow[] = new Object[Mcols];
                    while (R1.next()) {
                        for (int i = 0; i < Mcols; i++) {
                            Mrow[i] = R1.getString(i + 1);
                        }
                        Mdm.addRow(Mrow);
                    }
                    M1.setModel(Mdm);
                    JScrollPane scrollPane = new JScrollPane(M1);
                    MFrame.add(scrollPane);

                } catch (Exception E) {
                    System.out.println(E.toString());
                }
            }
        });

        //Female Accounts
        JPanel FP1 = new JPanel();
        FP1.setLayout(new FlowLayout());
        JTable F1 = new JTable();
        DefaultTableModel Fdm = new DefaultTableModel();
        String FFindGender = "F";
        JMenuItem Females = new JMenuItem("Female Accounts");
        Reports.add(Females);
        Females.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FeFrame.setVisible(true);
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT name, accountnumber, date FROM accounts WHERE SUBSTRING(accountnumber, 2, 1) = '" + FFindGender + "' ORDER BY 'date' ASC ");
                    ResultSetMetaData rsmd1 = R1.getMetaData();

                    int Fcols = rsmd1.getColumnCount();
                    String Fc[] = new String[Fcols];
                    for (int i = 0; i < Fcols; i++) {
                        Fc[i] = rsmd1.getColumnName(i + 1);
                        Fdm.addColumn(Fc[i]);
                    }
                    Object Frow[] = new Object[Fcols];
                    while (R1.next()) {
                        for (int i = 0; i < Fcols; i++) {
                            Frow[i] = R1.getString(i + 1);
                        }
                        Fdm.addRow(Frow);
                    }
                    F1.setModel(Fdm);
                    JScrollPane scrollPane = new JScrollPane(F1);
                    FeFrame.add(scrollPane);

                } catch (Exception E) {
                    System.out.println(E.toString());
                }
            }
        });

        //All Accounts
        JPanel AP1 = new JPanel();
        AP1.setLayout(new FlowLayout());
        JTable A1 = new JTable();
        DefaultTableModel Adm = new DefaultTableModel();
        JMenuItem All = new JMenuItem("All Accounts");
        Reports.add(All);
        All.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AFrame.setVisible(true);
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT name, accountnumber, date FROM accounts ORDER BY 'date' ASC ");
                    ResultSetMetaData rsmd1 = R1.getMetaData();

                    int Acols = rsmd1.getColumnCount();
                    String Ac[] = new String[Acols];
                    for (int i = 0; i < Acols; i++) {
                        Ac[i] = rsmd1.getColumnName(i + 1);
                        Adm.addColumn(Ac[i]);
                    }
                    Object Arow[] = new Object[Acols];
                    while (R1.next()) {
                        for (int i = 0; i < Acols; i++) {
                            Arow[i] = R1.getString(i + 1);
                        }
                        Adm.addRow(Arow);
                    }
                    A1.setModel(Adm);
                    JScrollPane scrollPane = new JScrollPane(A1);
                    AFrame.add(scrollPane);

                } catch (Exception E) {
                    System.out.println(E.toString());
                }
            }
        });
    }
}