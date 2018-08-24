package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.ArrayDeque;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        JFrame Login = new JFrame("Login");
        JFrame Home = new JFrame("Home");
        JFrame CFrame = new JFrame("Create");
        JFrame EFrame = new JFrame("Edit");
        JFrame DFrame = new JFrame("Deposit");
        JFrame WFrame = new JFrame("Withdrawals");
        JFrame TFrame = new JFrame("Transfers");
        JFrame RFrame = new JFrame("Reports");
        Home.setSize(400, 500);
        Home.setLayout(new FlowLayout());
        CFrame.setSize(400, 500);
        CFrame.setLayout(new GridLayout(9, 1));
        EFrame.setLayout(new GridLayout(9, 1));
        DFrame.setSize(400, 500);
        DFrame.setLayout(new GridLayout(10, 1));
        WFrame.setSize(400, 500);
        WFrame.setLayout(new FlowLayout());
        TFrame.setSize(400, 500);
        TFrame.setLayout(new FlowLayout());
        RFrame.setSize(400, 500);
        RFrame.setLayout(new FlowLayout());
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
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
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
        JMenuItem Edit = new JMenuItem("Edit existing");
        Edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EFrame.setVisible(true);
                Home.dispose();
            }
        });
        JMenu Banking = new JMenu("Banking");
        JMenuItem Deposit = new JMenuItem("Deposit");
        Deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DFrame.setVisible(true);
                Home.dispose();
            }
        });
        JMenuItem Withdraw = new JMenuItem("Withdraw");
        Withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WFrame.setVisible(true);
                Home.dispose();
            }
        });
        JMenuItem Transfer = new JMenuItem("Transfer");
        Transfer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TFrame.setVisible(true);
                Home.dispose();
            }
        });
        JMenu Reports = new JMenu("Reports");
        Reports.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RFrame.setVisible(true);
                Home.dispose();
            }
        });
        JMenu Logout = new JMenu("Logout");
        Logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login.setVisible(true);
                Home.dispose();
            }
        });
        Users.add(Create);
        Users.add(Edit);
        Banking.add(Deposit);
        Banking.add(Withdraw);
        Banking.add(Transfer);
        Bar.add(Users);
        Bar.add(Banking);
        Bar.add(Reports);
        Bar.add(Logout);
        Home.setJMenuBar(Bar);

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

                String AccNo;
                try {
                    String name = AddName.getText();
                    String add = AddAdd.getText();
                    String email = AddEmail.getText();
                    String gender = "";
                    String acctyp = "";
                    String uname = AddUName.getText();
                    String pword = new String(AddPass.getPassword());
                    AccNo = "";
                    if (Male.isSelected())
                        gender = "Male";
                    else gender = "Female";
                    if (Current.isSelected())
                        acctyp = "Current";
                    else acctyp = "Savings";
                    if (acctyp.equals("Current"))
                        AccNo = AccNo + "C";
                    else if (acctyp.equals("Savings"))
                        AccNo = AccNo + "S";
                    if (gender.equals("Female"))
                        AccNo = AccNo + "F";
                    else AccNo = AccNo + "M";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S = C.createStatement();
                    ResultSet R = S.executeQuery("SELECT AccountNumber FROM user ORDER BY AccountNumber DESC");
                    int no;
                    String prior = "";
                    while (R.next()) {
                        String check = R.getString("AccountNumber");
                        if (AccNo.substring(0, 2).equals(check.substring(0, 2))) {
                            prior = R.getString("AccountNumber");
                            break;
                        }
                    }
                    no = Integer.parseInt(prior.substring(4));
                    no = no + 1;
                    if (no < 10) {
                        AccNo = AccNo + "00" + Integer.toString(no);
                    } else if (no >= 10 && no < 100) {
                        AccNo = AccNo + "0" + Integer.toString(no);
                    }
                    S.executeUpdate("INSERT INTO user VALUES ('" + name + "','" + add + "','" + email + "','" + AccNo + "','" + uname + "','" + pword + "')");
                    System.out.println(AccNo);
                    AcNo.setText("Your Account Number is " + AccNo);
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
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S = C.createStatement();
                    ResultSet R = S.executeQuery("SELECT * FROM user WHERE accountnumber = '" + EditAcc.getText() + "'");
                    while (R.next()) {
                        if (R.getString("accountnumber") != EditAcc.getText())
                            System.out.println("Account Number not valid");
                        E2.setVisible(true);
                        E3.setVisible(true);
                        E4.setVisible(true);
                        E5.setVisible(true);
                        E6.setVisible(true);
                        E7.setVisible(true);
                        E8.setVisible(true);
                        E9.setVisible(true);
                        EditName.setText(R.getString("Name"));
                        EditAdd.setText(R.getString("Address"));
                        EditEmail.setText(R.getString("Email"));
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
                    String name = EditName.getText();
                    String add = EditAdd.getText();
                    String email = EditEmail.getText();
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S = C.createStatement();
                    S.executeUpdate("UPDATE user SET  Name = '" + name + "', Address = '" + add + "', Email = '" + email + "' WHERE accountnumber = '" + EditAcc.getText() + "'");
                    EditName.setText("");
                    EditAdd.setText("");
                    EditEmail.setText("");
                    done.setVisible(true);
                    Female.setSelected(false);
                    Male.setSelected(false);
                    Current.setSelected(false);
                    Savings.setSelected(false);
                } catch (Exception E) {
                    System.out.println(E.toString());
                    System.out.println("Update");
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
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S = C.createStatement();
                    ResultSet R = S.executeQuery("SELECT * FROM user WHERE accountnumber = '" + DepAcc.getText() + "'");
                    while (R.next()) {
                        if (R.getString("accountnumber") != DepAcc.getText())
                            D2.setVisible(true);
                        D3.setVisible(true);
                        D4.setVisible(true);
                        D5.setVisible(true);
                        D6.setVisible(true);
                        D7.setVisible(true);
                        D8.setVisible(true);
                        D9.setVisible(true);
                        DepName.setText(R.getString("Name"));
                        DepAdd.setText(R.getString("Address"));
                        DepEmail.setText(R.getString("Email"));
                    }
                    String accno = DepAcc.getText();
                    String name = DepName.getText();
                    S.executeUpdate("INSERT INTO moneyin (username, accountnumber) VALUES ('" + name + "','" + accno + "')");

                } catch (Exception E) {
                    System.out.println(E.toString());
                    System.out.println("Find dep");
                }
            }
        });

        DepositBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = DepName.getText();
                    String accno = DepAcc.getText();
                    int depositam = Integer.parseInt(DepAmount.getText());
                    java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S = C.createStatement();
                    S.executeUpdate("UPDATE moneyin SET deposits=" + depositam + " WHERE AccountNumber = '" + accno + "'");
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
        JLabel WAcc = new JLabel("Account Number: ");
        JLabel WDet = new JLabel("User Details: ");
        JLabel WithN = new JLabel("Name: ");
        JLabel WithA = new JLabel("Address: ");
        JLabel WithE = new JLabel("Email: ");
        JLabel WithAm = new JLabel("Deposit Amount: ");
        JTextField WithAcc = new JTextField(20);
        JTextField WithName = new JTextField(20);
        JTextField WithAdd = new JTextField(20);
        JTextField WithEmail = new JTextField(20);
        JTextField WithAmount = new JTextField(20);
        JButton WithdrawalBtn = new JButton("Withdraw");
        JButton WFind = new JButton("Find");

        W1.add(WAcc);
        W1.add(WithAcc);
        W1.add(WFind);
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

        WFrame.add(W2);
        WFrame.add(W1);
        WFrame.add(W3);
        WFrame.add(W4);
        WFrame.add(W5);
        WFrame.add(W6);
        WFrame.add(W7);
        WFrame.add(W8);
        WFrame.add(W9);
        WFrame.add(W10);
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
        WFind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S = C.createStatement();
                    ResultSet R = S.executeQuery("SELECT * FROM user WHERE accountnumber = '" + WithAcc.getText() + "'");
                    while (R.next()) {
                        if (R.getString("accountnumber") != DepAcc.getText())
                            W2.setVisible(true);
                        W3.setVisible(true);
                        W4.setVisible(true);
                        W5.setVisible(true);
                        W6.setVisible(true);
                        W7.setVisible(true);
                        W8.setVisible(true);
                        W9.setVisible(true);
                        WithName.setText(R.getString("Name"));
                        WithAdd.setText(R.getString("Address"));
                        WithEmail.setText(R.getString("Email"));
                    }
                    String accno = WithAcc.getText();
                    String name = WithName.getText();
                    S.executeUpdate("INSERT INTO moneyout (username, accountnumber) VALUES ('" + name + "','" + accno + "')");

                } catch (Exception E) {
                    System.out.println(E.toString());
                    System.out.println("Find dep");
                }
            }
        });

        WithdrawalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = WithName.getText();
                    String accno = WithAcc.getText();
                    int withdr = Integer.parseInt(WithAmount.getText());
                    java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/bank", "root", "");
                    Statement S1 = C.createStatement();
                    Statement S2 = C.createStatement();
                    Statement S3 = C.createStatement();
                    ResultSet R1 = S1.executeQuery("SELECT SUM(deposits) as 'deposits' FROM moneyin WHERE accountnumber = '" + accno + "'");
                    ResultSet R2 = S2.executeQuery("SELECT SUM(withdrawals + transfers) AS 'out' FROM moneyout WHERE accountnumber = '" + accno + "'");
                    while (R1.next() & R2.next()) {
                        if (Integer.parseInt(R1.getString("Deposits")) > (Integer.parseInt(R2.getString("out")) + withdr)) {
                            S3.executeUpdate("UPDATE moneyout SET withdrawals=" + withdr + " WHERE AccountNumber = '" + accno + "'");
                            WithDone.setText("Your withdrawal of £" + withdr + " has been successful.");
                            W10.setVisible(true);
                        } else {
                            WithDone.setText("You don't have enough funds to withdraw from.");
                            W10.setVisible(true);
                        }
                    }
                } catch (Exception E)

                {
                    System.out.println(E.toString());
                    System.out.println("Withdraw");
                }
            }
        });


    }
}
