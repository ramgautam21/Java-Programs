import DatabasePackage.DataBase;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    public Login() {

        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.getContentPane().setBackground(Color.gray);
        frame.setLayout(null);

        JLabel lbl1 = new JLabel("Username:");
        lbl1.setBounds(20,20,200,30);
        frame.add(lbl1);

        JLabel lbl2 = new JLabel("Password:");
        lbl2.setBounds(20,60,200,30);
        frame.add(lbl2);

        JTextField txt1 = new JTextField();
        txt1.setBounds(250,20,200,30);
        frame.add(txt1);

        JPasswordField txt2 = new JPasswordField();
        txt2.setBounds(250,60,200,30);
        frame.add(txt2);



        JButton btn2 = new JButton("Login");
        btn2.setBounds(270,150,150,30);
        btn2.setForeground(Color.blue);
        btn2.setBackground(Color.green);
        frame.add(btn2);


        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txt1.getText().isEmpty() && txt2.getText().isEmpty()) {
                    System.out.println("Please enter username or Password");

                } else {
                }


                String s1 = txt1.getText();
                String s2 = txt2.getText();

//                DataBase d1 = new DataBase(s1, s2);
//                DataBase d2 = new DataBase(s1, s2);
//
//                String us = d1.getUname();
//                String pw = d2.getPword();


                if (s1.equals(s1) && s2.equals(s2)) {

                    Home hp = new Home();
                    hp.Home();
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password.");
                    frame.dispose();
                    Login l = new Login();
                }
            }
        });

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}


