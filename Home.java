import DatabasePackage.DataBase;
import jdk.nashorn.internal.scripts.JO;
import sun.management.jdp.JdpJmxPacket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Home {


    public void Home() {
        JFrame homeframe = new JFrame("TransportationManagementSystem");
        homeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeframe.setSize(900,600);
        homeframe.setVisible(true);
        homeframe.setLayout(null);

        JButton jb = new JButton("New Customer");
        jb.setBounds(530,300,120,30);
        homeframe.add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                AddCustomer addCustomer = new AddCustomer();
            }
        });

        JTextField search = new JTextField();
        search.setBounds(300,250,200,30);
        search.setToolTipText("Search Customer");
        homeframe.add(search);


        JButton searchbtn = new JButton("Search");
        searchbtn.setBounds(530,250,120,30);
        homeframe.add(searchbtn);


        {
           JMenuBar mb = new JMenuBar();
           JMenu admin= new JMenu("Admin");
           JMenu driver = new JMenu("Driver/Conductor");
           JMenu vehicles = new JMenu("Vehicles");
           JMenu customer = new JMenu("Customers");
           JMenu booking = new JMenu("Booking");
           JMenu route = new JMenu("Route");

            mb.add(admin);
            mb.add(driver);
            mb.add(vehicles);
            mb.add(customer);
            mb.add(booking);
            mb.add(route);
            JButton logout= new JButton("Log Out");
            mb.add(Box.createHorizontalGlue());
            mb.add(logout);

            // create menuitems
            JMenuItem m1 = new JMenuItem("Add User");
            JMenuItem m2 = new JMenuItem("About User");


            JMenuItem d1 = new JMenuItem("Add D/C ");
            JMenuItem d2 = new JMenuItem("About D/C");

            JMenuItem v1 = new JMenuItem("Add Vehicles");
            JMenuItem v2 = new JMenuItem("About Vehicles");

            JMenuItem c2 = new JMenuItem("Add New Customer");
            JMenuItem c1 = new JMenuItem("Customers Details");

            JMenuItem b1 = new JMenuItem("Add Booking");
            JMenuItem b2 = new JMenuItem("Booking Details");

            JMenuItem r1 = new JMenuItem("Add Route");
            JMenuItem r2 = new JMenuItem("Route Details");

            // add menu items to menu
            admin.add(m1);
            admin.add(m2);

            driver.add(d1);
            driver.add(d2);

            vehicles.add(v1);
            vehicles.add(v2);

            customer.add(c1);
            customer.add(c2);

            booking.add(b1);
            booking.add(b2);

            route.add(r1);
            route.add(r2);

            m1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Register r = new Register();
                }
            });

            m2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    UserDetails userDetails = new UserDetails();

                }
            });
            d1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DriverAndCunductor dandc = new DriverAndCunductor();

                }
            });

            v1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    AddVehicles addVehicles = new AddVehicles();
                }
            });
            v2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    AboutVehicles aboutVehicles = new AboutVehicles();
                }
            });

            logout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Login login = new Login();
                    homeframe.dispose();
                }
            });
            d2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    D_C_Details d_c_details = new D_C_Details();
                }
            });
            c2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    AddCustomer addCustomer = new AddCustomer();
                }
            });
            c1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    CustomerDetails customerDetails = new CustomerDetails();
                }
            });

            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Booking booking1 = new Booking();
                }
            });
            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    BookingDetails bookingDetails = new BookingDetails();
                }
            });
            r1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    AddRoute addRoute = new AddRoute();
                }
            });
            r2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    RouteDetails routeDetails = new RouteDetails();
                }
            });
            searchbtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String search12 = search.getText();
                    DataBase db = new DataBase(search12);
                    String data =db.fetchSearch();

                    JFrame jFrame = new JFrame("Customer Details");
                    jFrame.setSize(500,400);
                    jFrame.setLayout(null);

                    JLabel jLabel = new JLabel("Customer Found");
                    jLabel.setBounds(200,20,200,30);
                    jFrame.add(jLabel);

                    JLabel jLabel1 = new JLabel("Customer Name:");
                    jLabel1.setBounds(30,70,100,30);
                    jFrame.add(jLabel1);

                    JLabel jLabel2 = new JLabel(""+data);
                    jLabel2.setBounds(150,70,100,30);
                    jFrame.add(jLabel2);

                    JButton jButton1 = new JButton("Make Booking");
                    jButton1.setBounds(70,200,150,30);
                    jFrame.add(jButton1);

                    JButton jButton2 = new JButton("Cancel");
                    jButton2.setBounds(260,200,150,30);
                    jFrame.add(jButton2);

                    jButton1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Booking booking1 = new Booking();
                            jFrame.dispose();
                        }
                    });
                    jButton2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            jFrame.dispose();
                        }
                    });

                    jFrame.setVisible(true);
                    jFrame.setLocationRelativeTo(null);

                }
                });



            // add menubar to frame
            homeframe.setJMenuBar(mb);

        }

        homeframe.setVisible(true);
        homeframe.setLocationRelativeTo(null);



    }
}
