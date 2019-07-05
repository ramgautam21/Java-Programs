import DatabasePackage.DataBase;
import sun.util.calendar.JulianCalendar;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DriverAndCunductor {

    public DriverAndCunductor() {

        JFrame frame = new JFrame("Driver And Conductor");
        frame.setDefaultCloseOperation(frame.HIDE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        JTabbedPane tabbedPane1 = new JTabbedPane();
        tabbedPane1.setBounds(0,0,500,500);
        frame.add(tabbedPane1);

        JPanel jPanel1 = new JPanel();
        jPanel1.setBounds(2,2,400,400);
        jPanel1.setBackground(Color.yellow);
        jPanel1.setLayout(null);
        tabbedPane1.add(jPanel1);

        JPanel jPanel2 = new JPanel();
        jPanel2.setBounds(2,2,400,400);
        jPanel2.setBackground(Color.green);
        jPanel2.setLayout(null);
        tabbedPane1.add(jPanel2);

        tabbedPane1.add("Driver",jPanel1);
        tabbedPane1.add("Conductor",jPanel2);

        JLabel lbl1 = new JLabel("Name:");
        lbl1.setBounds(20,20,175,30);
        jPanel1.add(lbl1);

        JLabel lbl2 = new JLabel("DOB");
        lbl2.setBounds(20,60,175,30);
        jPanel1.add(lbl2);

        JLabel lbl3 = new JLabel("Address:");
        lbl3.setBounds(20,100,175,30);
        jPanel1.add(lbl3);

        JLabel lbl4 = new JLabel("Gender:");
        lbl4.setBounds(20,140,175,30);
        jPanel1.add(lbl4);

        JLabel lbl5 = new JLabel("Contact No:");
        lbl5.setBounds(20,220,175,30);
        jPanel1.add(lbl5);

        JLabel lbl6 = new JLabel("Licence No:");
        lbl6.setBounds(20,260,175,30);
        jPanel1.add(lbl6);

        JLabel lbl7 = new JLabel("Qualification:");
        lbl7.setBounds(20,300,175,30);
        jPanel1.add(lbl7);

        //driver textfield

        JTextField txt1 = new JTextField();
        txt1.setToolTipText("Full Name");
        txt1.setBounds(190,20,200,30);
        jPanel1.add(txt1);

        String[] day= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15",
                "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

        JComboBox txt2dd = new JComboBox(day);
        txt2dd.setBounds(190,60,45,30);
        txt2dd.setToolTipText("DD");
        jPanel1.add(txt2dd);

        String[] month = {"01","02","03","04","05","06","07","08","09","10","11","12"};

        JComboBox txt2mm = new JComboBox(month);
        txt2mm.setBounds(255,60,45,30);
        txt2mm.setToolTipText("MM");
        jPanel1.add(txt2mm);

        JComboBox txt2yy = new JComboBox();
        txt2yy.setBounds(320,60,70,30);
        txt2yy.setToolTipText("YYYY");
        jPanel1.add(txt2yy);

        for(int y=2019;y>=1975;y--) {
            txt2yy.addItem(y);
        }



        JTextField txt3 = new JTextField();
        txt3.setBounds(190,100,200,30);
        jPanel1.add(txt3);

        ButtonGroup btnGrp = new ButtonGroup();
        JRadioButton rdoBtn1 = new JRadioButton("Male");
        rdoBtn1.setBounds(190, 140, 100,20);
        rdoBtn1.setActionCommand("Male");
        JRadioButton rdoBtn2 = new JRadioButton("Female");
        rdoBtn2.setBounds(190, 160, 100,20);
        rdoBtn2.setActionCommand("Female");
        JRadioButton rdoBtn3 = new JRadioButton("Others");
        rdoBtn3.setBounds(190, 180, 100,20);
        rdoBtn3.setActionCommand("Others");

        btnGrp.add(rdoBtn1);
        btnGrp.add(rdoBtn2);
        btnGrp.add(rdoBtn3);

        jPanel1.add(rdoBtn1);
        jPanel1.add(rdoBtn2);
        jPanel1.add(rdoBtn3);


        JTextField txt5 = new JTextField();
        txt5.setBounds(190,220,200,30);
        jPanel1.add(txt5);

        JTextField txt6 = new JTextField();
        txt6.setBounds(190,260,200,30);
        jPanel1.add(txt6);

        String[] qualification ={"Secondary","+2 Level","Bachelor","Master"};

        JComboBox txt7 = new JComboBox(qualification);
        txt7.setBounds(190,300,200,30);
        jPanel1.add(txt7);

        JButton driverbtn1 = new JButton("Register");
        driverbtn1.setBounds(120,370,120,30);
        jPanel1.add(driverbtn1);

        JButton driverbtn2 = new JButton("Cancel");
        driverbtn2.setBounds(300,370,120,30);
        jPanel1.add(driverbtn2);


        //Conducter


        JLabel clbl1 = new JLabel("Name:");
        clbl1.setBounds(20,20,175,30);
        jPanel2.add(clbl1);

        JLabel clbl2 = new JLabel("DOB");
        clbl2.setBounds(20,60,175,30);
        jPanel2.add(clbl2);

        JLabel clbl3 = new JLabel("Address:");
        clbl3.setBounds(20,100,175,30);
        jPanel2.add(clbl3);

        JLabel clbl4 = new JLabel("Gender:");
        clbl4.setBounds(20,140,175,30);
        jPanel2.add(clbl4);

        JLabel clbl5 = new JLabel("Contact No:");
        clbl5.setBounds(20,220,175,30);
        jPanel2.add(clbl5);

        JLabel clbl6 = new JLabel("Citizenship No:");
        clbl6.setBounds(20,260,175,30);
        jPanel2.add(clbl6);


        JTextField ctxt1 = new JTextField();
        ctxt1.setToolTipText("Full Name");
        ctxt1.setBounds(190,20,200,30);
        jPanel2.add(ctxt1);

        String[] cday= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15",
                "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

        JComboBox ctxt2dd = new JComboBox(cday);
        ctxt2dd.setBounds(190,60,45,30);
        ctxt2dd.setToolTipText("DD");
        jPanel2.add(ctxt2dd);

        String[] cmonth = {"01","02","03","04","05","06","07","08","09","10","11","12"};

        JComboBox ctxt2mm = new JComboBox(cmonth);
        ctxt2mm.setBounds(255,60,45,30);
        ctxt2mm.setToolTipText("MM");
        jPanel2.add(ctxt2mm);

        JComboBox ctxt2yy = new JComboBox();
        ctxt2yy.setBounds(320,60,70,30);
        ctxt2yy.setToolTipText("YYYY");
        jPanel2.add(ctxt2yy);

        for(int cy=2019;cy>=1975;cy--) {
            ctxt2yy.addItem(cy);
        }



        JTextField ctxt3 = new JTextField();
        ctxt3.setBounds(190,100,200,30);
        jPanel2.add(ctxt3);

        ButtonGroup cbtnGrp = new ButtonGroup();
        JRadioButton crdoBtn1 = new JRadioButton("Male");
        crdoBtn1.setBounds(190, 140, 100,20);
        crdoBtn1.setActionCommand("Male");
        JRadioButton crdoBtn2 = new JRadioButton("Female");
        crdoBtn2.setBounds(190, 160, 100,20);
        crdoBtn2.setActionCommand("Female");
        JRadioButton crdoBtn3 = new JRadioButton("Others");
        crdoBtn3.setBounds(190, 180, 100,20);
        crdoBtn3.setActionCommand("Others");

        cbtnGrp.add(crdoBtn1);
        cbtnGrp.add(crdoBtn2);
        cbtnGrp.add(crdoBtn3);

        jPanel2.add(crdoBtn1);
        jPanel2.add(crdoBtn2);
        jPanel2.add(crdoBtn3);


        JTextField ctxt5 = new JTextField();
        ctxt5.setBounds(190,220,200,30);
        jPanel2.add(ctxt5);

        JTextField ctxt6 = new JTextField();
        ctxt6.setBounds(190,260,200,30);
        jPanel2.add(ctxt6);


        JButton conductorbtn1 = new JButton("Register");
        conductorbtn1.setBounds(120,360,120,30);
        jPanel2.add(conductorbtn1);

        JButton conducterbtn2 = new JButton("Cancel");
        conducterbtn2.setBounds(300,360,120,30);
        jPanel2.add(conducterbtn2);

        driverbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String dname = txt1.getText();
                int dd1 = Integer.parseInt(txt2dd.getSelectedItem().toString());
                int dm1 = Integer.parseInt(txt2mm.getSelectedItem().toString());
                int dy1 = Integer.parseInt(txt2yy.getSelectedItem().toString());
                String daddress = txt3.getText();
                String dgender = btnGrp.getSelection().getActionCommand();
                long dcontact = Long.parseLong(txt5.getText());
                String dlicence = (txt6.getText());
                String qualification = txt7.getSelectedItem().toString();



                DataBase dataBase1 = new DataBase(dname,dd1,dm1,dy1,daddress,dgender,dcontact,dlicence,qualification);
                dataBase1.executeDriver();

                frame.dispose();
                DriverAndCunductor driverAndCunductor1 = new DriverAndCunductor();
            }
        });

        conductorbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String cname = ctxt1.getText();
                int cd1 = Integer.parseInt(ctxt2dd.getSelectedItem().toString());
                int cm1 = Integer.parseInt(ctxt2mm.getSelectedItem().toString());
                int cy1 = Integer.parseInt(ctxt2yy.getSelectedItem().toString());
                String caddress = ctxt3.getText();
                String cgender = cbtnGrp.getSelection().getActionCommand();
                long ccontact = Long.parseLong(ctxt5.getText());
                String ccitizenship = (ctxt6.getText());

                DataBase dataBase2 = new DataBase(cname,cd1,cm1,cy1,caddress,cgender,ccontact,ccitizenship);
                dataBase2.executeConductor();

                frame.dispose();
                DriverAndCunductor driverAndCunductor2 = new DriverAndCunductor();

            }
        });
        driverbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        conducterbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
