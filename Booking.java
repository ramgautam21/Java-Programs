import DatabasePackage.DataBase;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Booking {

    public Booking() {

        JFrame frame = new JFrame("Booking");
        frame.setDefaultCloseOperation(frame.HIDE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);


        JLabel jLabel2 = new JLabel("Customer Name:");
        jLabel2.setBounds(20,60,175,30);
        frame.add(jLabel2);

        JLabel jLabel3 = new JLabel("Destination:");
        jLabel3.setBounds(20,100,175,30);
        frame.add(jLabel3);

        JLabel jLabel5 = new JLabel("Vehicle No:");
        jLabel5.setBounds(20,140,175,30);
        frame.add(jLabel5);

        JLabel jLabel6 = new JLabel("No. of Passenger:");
        jLabel6.setBounds(20,180,175,30);
        frame.add(jLabel6);

        JLabel jLabel7 = new JLabel("Seat No:");
        jLabel7.setBounds(20,220,175,30);
        frame.add(jLabel7);

        JLabel jLabel9 = new JLabel("Total Amount:");
        jLabel9.setBounds(20,260,175,30);
        frame.add(jLabel9);

        //...................................................


        JTextField comboBox1 = new JTextField();
        comboBox1.setBounds(210,60,200,30);
        frame.add(comboBox1);

        JTextField comboBox2 = new JTextField();
        comboBox2.setBounds(210,100,200,30);
        frame.add(comboBox2);

        JTextField comboBox3 = new JTextField();
        comboBox3.setBounds(210,140,200,30);
        frame.add(comboBox3);

        JTextField textField1 = new JTextField();
        textField1.setBounds(210,180,200,30);
        frame.add(textField1);

        JTextField textField2 = new JTextField();
        textField2.setBounds(210,220,200,30);
        frame.add(textField2);

        JLabel jLabel12= new JLabel();
        jLabel12.setBounds(210,260,100,30);
        frame.add(jLabel12);

        JButton jButton = new JButton("Cal");
        jButton.setBounds(400,260,50,30);
        frame.add(jButton);

        JButton btn1 = new JButton("Save & Print");
        btn1.setBounds(90,360,150,30);
        frame.add(btn1);

        JButton btn2 = new JButton("Cancel");
        btn2.setBounds(280,360,100,30);
        frame.add(btn2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Cname = comboBox1.getText();
                String cDest = comboBox2.getText();
                String cVec = comboBox3.getText();
                int noPass = Integer.parseInt(textField1.getText());
                String seatno = textField2.getText();
                String total = jLabel12.getText();

                DataBase dataBase = new DataBase(Cname,cDest,cVec,noPass,seatno,total);
                dataBase.executeBooking();

                frame.dispose();
                Booking booking = new Booking();
            }
        });
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(textField1.getText());
                int totalamt = a*1000;
                jLabel12.setText("Rs. "+totalamt);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
