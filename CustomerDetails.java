import DatabasePackage.DataBase;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;

public class CustomerDetails {

    private int Cid;
    private String Cname;
    private String Address;
    private long ContactNo;
    private String Gender;
    private String Country;

    public CustomerDetails() {

        JFrame f = new JFrame("Customer Details");

        JPanel jPanel = new JPanel();
        jPanel.setBounds(0,0,800,400);
        jPanel.setBackground(Color.cyan);
        f.add(jPanel);

        JPanel jPanel2 = new JPanel();
        jPanel2.setBounds(0,410,800,200);
        jPanel2.setBackground(Color.blue);
        f.add(jPanel2);


        DefaultTableModel model= new DefaultTableModel(new String[]{"Customer ID",
                "Name", "Address", "Contact No", "Gender", "Country"},0);
        JTable jt = new JTable();
        jt.setModel(model);
        jt.setBounds(0, 40, 800, 600);
        try {
            DataBase db = new DataBase();
            ResultSet rs = db.fetchCustomerDetails();

            while (rs.next()) {
                for (int i = 0; i <= rs.getFetchSize(); i++) {
                    this.Cid = Integer.parseInt(rs.getString("C_id"));
                    this.Cname = rs.getString("C_Name");
                    this.Address = rs.getString("Address");
                    this.ContactNo = Long.parseLong(rs.getString("ContactNO"));
                    this.Gender = rs.getString("Gender");
                    this.Country = rs.getString("Country");
                    model.addRow(new Object[]{this.Cid, this.Cname, this.Address,this.ContactNo,this.Gender,this.Country});
                }

            }
        } catch (Exception e) {

        }

        JScrollPane sp = new JScrollPane(jt);
        jPanel.add(sp);

        f.setSize(800, 600);
        f.setVisible(true);
        f.setLocationRelativeTo(null);

    }
}
