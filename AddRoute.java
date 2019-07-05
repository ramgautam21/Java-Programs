import DatabasePackage.DataBase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoute {
    public AddRoute() {

        JFrame frame = new JFrame("Add Route");
        frame.setDefaultCloseOperation(frame.HIDE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        JLabel jLabel1 = new JLabel("Route:");
        jLabel1.setBounds(20,40,175,30);
        frame.add(jLabel1);

        JLabel jLabel2 = new JLabel("Vehicle No:");
        jLabel2.setBounds(20,80,175,30);
        frame.add(jLabel2);

        JLabel jLabel4 = new JLabel("Route Charge:");
        jLabel4.setBounds(20,120,175,30);
        frame.add(jLabel4);

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(190,40,200,30);
        frame.add(jTextField1);

        String[] b = {"BA 3 PA 1212"};
        JComboBox jComboBox = new JComboBox(b);
        jComboBox.setBounds(190,80,200,30);
        frame.add(jComboBox);

        JTextField jTextField2= new JTextField();
        jTextField2.setBounds(190,120,200,30);
        frame.add(jTextField2);

        JButton jButton1 = new JButton("Save");
        jButton1.setBounds(100,200,120,30);
        frame.add(jButton1);

        JButton jButton2= new JButton("Cancel");
        jButton2.setBounds(250,200,120,30);
        frame.add(jButton2);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String route = jTextField1.getText();
                String rvecno = jComboBox.getSelectedItem().toString();
                long rcharge = Long.parseLong(jTextField2.getText());

                DataBase dataBase = new DataBase(route,rvecno,rcharge);
                dataBase.executeRoute();

                frame.dispose();
                AddRoute addRoute = new AddRoute();
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });



        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
