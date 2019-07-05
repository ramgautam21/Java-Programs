import DatabasePackage.DataBase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class AddVehicles {


    public AddVehicles() {


        JFrame frame = new JFrame("Add Vehicles");
        frame.setDefaultCloseOperation(frame.HIDE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);


        JLabel lbl1 = new JLabel("Vehicle No: ");
        lbl1.setBounds(20,20,175,30);
        frame.add(lbl1);

        JLabel lbl22 = new JLabel("Type:");
        lbl22.setBounds(20,60,175,30);
        frame.add(lbl22);

        JLabel lbl2 = new JLabel("Route");
        lbl2.setBounds(20,100,175,30);
        frame.add(lbl2);

        JLabel lbl3 = new JLabel("Driver");
        lbl3.setBounds(20,140,175,30);
        frame.add(lbl3);

        JLabel lbl4 = new JLabel("Conductor");
        lbl4.setBounds(20,180,175,30);
        frame.add(lbl4);

        JLabel lbl5 = new JLabel("Capacity:");
        lbl5.setBounds(20,220,175,30);
        frame.add(lbl5);

        JLabel lbl6 = new JLabel("Fuel:");
        lbl6.setBounds(20,260,175,30);
        frame.add(lbl6);

        JTextField txt1 = new JTextField();
        txt1.setBounds(250,20,200,30);
        frame.add(txt1);



        String[] type = {"BUS","HIACE"};
        JComboBox cb1 = new JComboBox(type);
        cb1.setBounds(250,60,200,30);
        frame.add(cb1);


        String[] route = {"KTM-POKHARA","KTM-BIRGUNJ","KTM-SUNAULI","KTM-SINDHULI",
                                "KTM-MAHENDRANAGER"};



        JComboBox cb2 = new JComboBox(route);
        cb2.setBounds(250,100,200,30);
        frame.add(cb2);


        JTextField txt3 = new JTextField();
        txt3.setBounds(250,140,200,30);
        frame.add(txt3);

        JTextField txt4 = new JTextField();
        txt4.setBounds(250,180,200,30);
        frame.add(txt4);


        JTextField txt5 = new JTextField();
        txt5.setBounds(250,220,200,30);
        frame.add(txt5);

        String[] fuel ={"PETROL","DIESEL"};
        JComboBox txt6 = new JComboBox(fuel);
        txt6.setBounds(250,260,200,30);
        frame.add(txt6);

        JButton btn1 = new JButton("Register");
        btn1.setBounds(160,355,120,30);
        frame.add(btn1);

        JButton btn2 = new JButton("Cancel");
        btn2.setBounds(310,355,120,30);
        frame.add(btn2);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vno = txt1.getText();
                String type = cb1.getSelectedItem().toString();
                String route = cb2.getSelectedItem().toString();
                String driver = txt3.getText();
                String conductor = txt4.getText();
                int capacity = Integer.parseInt(txt5.getText());
                String fuel = txt6.getSelectedItem().toString();

                DataBase dataBase = new DataBase(vno,type,route,driver,conductor,capacity,fuel);
                dataBase.executeVehicles();

                frame.dispose();
                AddVehicles addVehicles = new AddVehicles();
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
