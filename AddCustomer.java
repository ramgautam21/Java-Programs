import DatabasePackage.DataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCustomer {

    public AddCustomer() {

        JFrame jFrame= new JFrame("Add New Customer");
        jFrame.setSize(600,500);
        jFrame.getContentPane().setBackground(Color.green);
        jFrame.setLayout(null);

        JLabel text1 = new JLabel("Register new Customer");
        //text1.setHorizontalAlignment( SwingConstants.CENTER );
        text1.setBounds(150,10,800,50);
        jFrame.add(text1);

        JLabel name = new JLabel("Name:");
        name.setBounds(20,70,175,30);
        jFrame.add(name);

        JLabel address = new JLabel("Address:");
        address.setBounds(20,120,175,30);
        jFrame.add(address);

        JLabel pn = new JLabel("Contact Number:");
        pn.setBounds(20,170,175,30);
        jFrame.add(pn);

        JLabel gender  = new JLabel("Gender:");
        gender.setBounds(20,220,175,30);
        jFrame.add(gender);

        JLabel country = new JLabel("Country:");
        country.setBounds(20,290,175,30);
        jFrame.add(country);

        JTextField tname = new JTextField();
        tname.setBounds(190,70,220,30);
        jFrame.add(tname);

        JTextField taddress = new JTextField();
        taddress.setBounds(190,120,220,30);
        jFrame.add(taddress);

        JTextField tcontact = new JTextField();
        tcontact.setBounds(190,170,220,30);
        jFrame.add(tcontact);

        ButtonGroup btnGrp = new ButtonGroup();
        JRadioButton rdoBtn1 = new JRadioButton("Male");
        rdoBtn1.setBounds(190, 220, 100,20);
        rdoBtn1.setActionCommand("Male");
        JRadioButton rdoBtn2 = new JRadioButton("Female");
        rdoBtn2.setBounds(190, 240, 100,20);
        rdoBtn2.setActionCommand("Female");
        JRadioButton rdoBtn3 = new JRadioButton("Others");
        rdoBtn3.setBounds(190, 260, 100,20);
        rdoBtn3.setActionCommand("Others");

        btnGrp.add(rdoBtn1);
        btnGrp.add(rdoBtn2);
        btnGrp.add(rdoBtn3);

        jFrame.add(rdoBtn1);
        jFrame.add(rdoBtn2);
        jFrame.add(rdoBtn3);

        String[] allcountry= new String[] {"Nepal","Germany","India","China",
                "Portugal","Spain","Pakistan","America"};
        JComboBox cb = new JComboBox(allcountry);
        cb.setBounds(190,290,220,25);
        jFrame.add(cb);

        JButton register = new JButton("Register");
        register.setBounds(125,355,100,20);
        jFrame.add(register);

        JButton clear = new JButton("Close");
        clear.setBounds(260,355,100,20);
        jFrame.add(clear);




        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = tname.getText();
                String cadd = taddress.getText();
                Long pn = Long.parseLong(tcontact.getText());
                String cgender = btnGrp.getSelection().getActionCommand();
                String country = cb.getSelectedItem().toString();

                DataBase dataBase123 = new DataBase(name,cadd,pn,cgender,country);
                dataBase123.executeCustomer();
                jFrame.dispose();

                Booking booking1 = new Booking();
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
            }
        });

        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }
}
