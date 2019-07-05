import DatabasePackage.DataBase;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;

public class D_C_Details {

    private int Did;
    private String Name;
    private String DOB;
    private String Address;
    private long Contact_No;
    private String gender;
    private String Licenceno;
    private String qualification;



    public D_C_Details() {

        JFrame f = new JFrame("Driver And Conductor Details");

        JPanel jPanel = new JPanel();
        jPanel.setBounds(0,0,800,400);
        jPanel.setBackground(Color.cyan);
        f.add(jPanel);

        JPanel jPanel2 = new JPanel();
        jPanel2.setBounds(0,410,800,200);
        jPanel2.setBackground(Color.blue);
        f.add(jPanel2);


        DefaultTableModel model= new DefaultTableModel(new String[]{"User ID",
                "Name", "Email", "Address", "Contact No", "UserName"},0);
        JTable jt = new JTable();
        jt.setModel(model);
        jt.setBounds(0, 40, 800, 600);
        try {
            DataBase db = new DataBase();
            ResultSet rs = db.fetchDriverDetails();

            while (rs.next()) {
                for (int i = 0; i <= rs.getFetchSize(); i++) {
                    this.Did = Integer.parseInt(rs.getString("D_id"));
                    this.Name = rs.getString("D_Name");
                    this.DOB = rs.getString("DOB");
                    this.Address = rs.getString("Address");
                    this.Contact_No = Long.parseLong(rs.getString("ContactNO"));
                    this.gender= rs.getString("Gender");
                    this.Licenceno= rs.getString("LicenceNo");
                    this.qualification= rs.getString("Qualification");
                    model.addRow(new Object[]{this.Did, this.Name, this.DOB,this.Address,
                            this.Contact_No,this.gender,this.Licenceno,this.qualification});
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
