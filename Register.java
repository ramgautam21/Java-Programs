import sun.plugin2.message.JavaObjectOpMessage;
import DatabasePackage.DataBase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import DatabasePackage.DataBase;


public class Register {

    public Register() {

        JFrame rframe = new JFrame("Register new User");
        rframe.setDefaultCloseOperation(rframe.HIDE_ON_CLOSE);
        rframe.setSize(500,500);
        rframe.setLayout(null);

        JLabel lbl1 = new JLabel("Name:");
        lbl1.setBounds(20,20,200,30);
        rframe.add(lbl1);

        JLabel lbl2 = new JLabel("Email:");
        lbl2.setBounds(20,60,200,30);
        rframe.add(lbl2);

        JLabel lbl3 = new JLabel("Address:");
        lbl3.setBounds(20,100,200,30);
        rframe.add(lbl3);

        JLabel lbl4 = new JLabel("Phone Number");
        lbl4.setBounds(20,140,200,30);
        rframe.add(lbl4);

        JLabel lbl5 = new JLabel("Username:");
        lbl5.setBounds(20,180,200,30);
        rframe.add(lbl5);

        JLabel lbl6 = new JLabel("Password:");
        lbl6.setBounds(20,220,200,30);
        rframe.add(lbl6);

        JLabel lbl7 = new JLabel("Confirm Password:");
        lbl7.setBounds(20,260,200,30);
        rframe.add(lbl7);

        JTextField txt1 = new JTextField();
        txt1.setToolTipText("Full Name");
        txt1.setBounds(250,20,200,30);
        rframe.add(txt1);

        JTextField txt2 = new JTextField();
        txt2.setBounds(250,60,200,30);
        rframe.add(txt2);

        JTextField txt3 = new JTextField();
        txt3.setBounds(250,100,200,30);
        rframe.add(txt3);

        JTextField txt4 = new JTextField();
        txt4.setBounds(250,140,200,30);
        rframe.add(txt4);


        JTextField txt5 = new JTextField();
        txt5.setBounds(250,180,200,30);
        rframe.add(txt5);

        JPasswordField txt6 = new JPasswordField();
        txt6.setBounds(250,220,200,30);
        rframe.add(txt6);

        JPasswordField txt7 = new JPasswordField();
        txt7.setBounds(250,260,200,30);
        rframe.add(txt7);

        JButton btn1 = new JButton("Register");
        btn1.setBounds(70,350,150,30);
        rframe.add(btn1);

        JButton btn2 = new JButton("Cancel");
        btn2.setBounds(270,350,150,30);
        rframe.add(btn2);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rframe.dispose();
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s1 = txt1.getText();
                String s2 = txt2.getText();
                String s3 = txt3.getText();
                long  s4 = Long.parseLong(txt4.getText());
                String s5 = txt5.getText();
                String s6 = txt6.getText();
                String s7 = txt7.getText();

                try {
                    if (s7.equals(s6)) {
                        DataBase db = new DataBase(s1,s2,s3,s4,s5,s6,s7);
                        db.executeStatement();
                        rframe.dispose();
                        Register r = new Register();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Password doesn't match.");
                    }
                }catch (Exception e1){
                    JOptionPane.showMessageDialog(null,"Please Fill up the form properly ");
                }


                }
        });
        rframe.setVisible(true);
        rframe.setLocationRelativeTo(null);


    }
}





