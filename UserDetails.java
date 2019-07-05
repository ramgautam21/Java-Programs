import DatabasePackage.DataBase;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDetails {

    private int rid;
    private String rname;
    private String remail;
    private String address;
    private String username;
    private long pno;
    private String[][] data1;


    public UserDetails() {

        JFrame f = new JFrame("User Details");

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
            ResultSet rs = db.fetchUserDetail();

            while (rs.next()) {
                for (int i = 0; i <= rs.getFetchSize(); i++) {
                     this.rid = Integer.parseInt(rs.getString("Rid"));
                     this.rname = rs.getString("Rname");
                     this.remail = rs.getString("Remail");
                    this.address = rs.getString("address");
                    this.pno = Long.parseLong(rs.getString("pno"));
                     this.username = rs.getString("username");
                    model.addRow(new Object[]{this.rid, this.rname, this.remail,this.address,this.pno,this.username});
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
