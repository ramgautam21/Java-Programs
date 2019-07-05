import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import javax.swing.AbstractButton;



class StudentDetails{
  public static void main(String args[]){
     
    JFrame myFrame = new JFrame("Student Details");
    myFrame.setSize(700,700);
    myFrame.setLayout(null);
     
    JPanel jp1 = new JPanel();
    jp1.setBounds(0,0,700,350);
    jp1.setBackground(Color.green);
    jp1.setLayout(null);
    myFrame.add(jp1);
    
    JPanel jp2 = new JPanel();
    jp2.setBounds(0,350,700,700);
    jp2.setBackground(Color.yellow);
    jp2.setLayout(null);
    myFrame.add(jp2);
    
    JLabel lbl = new JLabel("First Name:",SwingConstants.RIGHT);
    lbl.setBounds(20,20,100,30);
    jp1.add(lbl);
    
    JTextField txt1 = new JTextField();
    txt1.setBounds(140,20,150,30);
    jp1.add(txt1);
    
    JLabel lbl2 = new JLabel("Last Name:",SwingConstants.RIGHT);
    lbl2.setBounds(370,20,100,30);
    jp1.add(lbl2);
    
    JTextField txt2 = new JTextField();
    txt2.setBounds(490,20,150,30);
    jp1.add(txt2);

    JLabel lbl3 = new JLabel("Date of Birth:",SwingConstants.RIGHT);
    lbl3.setBounds(20,70,100,30);
    jp1.add(lbl3);
    
    JTextField txt3 = new JTextField();
    txt3.setBounds(140,70,50,30);
    txt3.setToolTipText("dd");
    jp1.add(txt3);
    
    JTextField mtxt3 = new JTextField();
    mtxt3.setBounds(200,70,50,30);
    mtxt3.setToolTipText("mm");
    jp1.add(mtxt3);
    
    JTextField ytxt3 = new JTextField();
    ytxt3.setBounds(260,70,70,30);
    ytxt3.setToolTipText("yyyy");
    jp1.add(ytxt3);
    
    JLabel lbl4 = new JLabel("Address:",SwingConstants.RIGHT);
    lbl4.setBounds(370,70,100,30);
    jp1.add(lbl4);
    
    JTextField txt4 = new JTextField();
    txt4.setBounds(490,70,150,30);
    jp1.add(txt4);
    
    JLabel lbl5 = new JLabel("Select Gender:",SwingConstants.RIGHT);
    lbl5.setBounds(20,120,100,30);
    jp1.add(lbl5);
    
    ButtonGroup btnGrp = new ButtonGroup();
    JRadioButton rdoBtn1 = new JRadioButton("Male");
    rdoBtn1.setBounds(140, 120, 100,20);
    rdoBtn1.setActionCommand("Male");
    JRadioButton rdoBtn2 = new JRadioButton("Female");
    rdoBtn2.setBounds(140, 140, 100,20);
    rdoBtn2.setActionCommand("Female");
    JRadioButton rdoBtn3 = new JRadioButton("Others");
    rdoBtn3.setBounds(140, 160, 100,20);
    rdoBtn3.setActionCommand("Others");
    
    btnGrp.add(rdoBtn1);
    btnGrp.add(rdoBtn2);
    btnGrp.add(rdoBtn3);
    
    
    jp1.add(rdoBtn1);
    jp1.add(rdoBtn2);
    jp1.add(rdoBtn3);
    
    JLabel lbl6 = new JLabel("Select Country:",SwingConstants.RIGHT);
    lbl6.setBounds(370,120,100,30);
    jp1.add(lbl6);
    
    String[] country = new String[] {"Nepal","Germany","India","China","Portugal","Spain"};
    JComboBox cb = new JComboBox(country);
    cb.setBounds(490,120,150,30);
    jp1.add(cb);
    
    JLabel lbl7 = new JLabel("Select Hobbies:",SwingConstants.RIGHT);
    lbl7.setBounds(20,200,100,30);
    jp1.add(lbl7);
    
    JCheckBox cb1 = new JCheckBox("Football");
    cb1.setBounds(140,200,100,20);
    jp1.add(cb1);
    
    JCheckBox cb2 = new JCheckBox("BasketBall");
    cb2.setBounds(140,220,100,20);
    jp1.add(cb2);
    
    JCheckBox cb3 = new JCheckBox("Table Tennis");
    cb3.setBounds(140,240,100,20);
    jp1.add(cb3);
    
    JCheckBox cb4 = new JCheckBox("Volley Ball");
    cb4.setBounds(140,260,100,20);
    jp1.add(cb4);
    
    JButton jb = new JButton("Submit");
    jb.setBounds(490,280,150,30);
    jp1.add(jb);
    
    //Second Panal
    
    JLabel l = new JLabel("STUDENT INFORMATION");
    l.setBounds(50,10,300,20);
    jp2.add(l);
    
    JLabel l1 = new JLabel();
    l1.setBounds(50,50,200,30);
    jp2.add(l1);
    
    JLabel l3 = new JLabel();
    l3.setBounds(50,80,200,30);
    jp2.add(l3);
    
    JLabel l7 = new JLabel();
    l7.setBounds(50,110,200,30);
    jp2.add(l7);
    
    JLabel l2 = new JLabel();
    l2.setBounds(50,140,200,30);
    jp2.add(l2);
        
    JLabel l4 = new JLabel();
    l4.setBounds(50,170,400,30);
    jp2.add(l4);
    
    JLabel l6 = new JLabel();
    l6.setBounds(50,200,200,30);
    jp2.add(l6);
    
    //Event Performed
    
    jb.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        
        String s1 = txt1.getText();
        String s2 = txt2.getText();
        int d3 = Integer.parseInt(txt3.getText());
        int m3 = Integer.parseInt(mtxt3.getText());
        int y3 = Integer.parseInt(ytxt3.getText());
        String s4 = txt4.getText();
        String value = cb.getSelectedItem().toString();
                
        l1.setText("Student Name:   "+s1+" "+s2);
        l2.setText("Address:   "+s4);
        l3.setText("Date of Birth:   "+d3+"/"+m3+"/"+y3);
        l6.setText("Country:   "+value);       
               
        String st1=" ",st2=" ",st3=" ",st4=" ";
        
        if(cb1.isSelected()){
           st1= "Football, ";
        }
        if(cb2.isSelected()){
           st2= "Basketball, ";
        }
        if(cb3.isSelected()){
           st3= "Table Tennis, ";
        }
        if(cb4.isSelected()){
           st4= "Volley Ball";
        }
        if(cb1.isSelected() ||cb2.isSelected() ||cb3.isSelected() ||cb4.isSelected() ){
           l4.setText("Hobbies:   "+st1+""+st2+""+st3+""+st4);
        }
        else{
          l4.setText("Hobbies: Not Selected.");
        }
        String gender = btnGrp.getSelection().getActionCommand();
        l7.setText("Gender:   "+gender);
        
       }         
    });
    
    myFrame.setLocationRelativeTo(null);
    myFrame.setVisible(true);
  }
}




