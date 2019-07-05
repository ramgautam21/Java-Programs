import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MarkSheetGeneratorGUI{

  
  public static void main(String args[]){
     new MarkSheetGenerator();
  } 
}

class MarkSheetGenerator{
  JLabel lblfirst,lblsecond,lblthird,lblfourth,lblfifth,lblsixth,lblseventh;
  JTextField txtfirst,txtsecond,txtthird;
  JButton btn;
  JFrame myFrame;
  public MarkSheetGenerator(){
    myFrame = new JFrame("Mark Sheet");
     myFrame.setSize(500,500);
    myFrame.setLayout(null);
   
    
    lblfirst = new JLabel("Enter DB marks:");
    lblfirst.setBounds(20,20,200,30);
    myFrame.add(lblfirst);
    
    lblsecond = new JLabel("Enter OOP marks:");
    lblsecond.setBounds(20,60,200,30);
    myFrame.add(lblsecond);
    
    lblthird = new JLabel("Enter OOT marks:");
    lblthird.setBounds(20,100,200,30);
    myFrame.add(lblthird);
    
    TextField txtfirst = new TextField();
    txtfirst.setBounds(240,20,200,30);
    myFrame.add(txtfirst);
    
    TextField txtsecond = new TextField();
    txtsecond.setBounds(240,60,200,30);
    myFrame.add(txtsecond);
    
    TextField txtthird = new TextField();
    txtthird.setBounds(240,100,200,30);
    myFrame.add(txtthird);
    
    JButton btn = new JButton("Generate Maeksheet");
    btn.setBounds(140,160,180,30);
    myFrame.add(btn);
    
    JLabel lblfourth = new JLabel();
    lblfourth.setBounds(20,240,200,20);
    myFrame.add(lblfourth);
    
    JLabel lblfifth = new JLabel();
    lblfifth.setBounds(20,280,200,20);
    myFrame.add(lblfifth);
    
    JLabel lblsixth = new JLabel();
    lblsixth.setBounds(20,320,200,20);
    myFrame.add(lblsixth);
    
    JLabel lblseventh = new JLabel();
    lblseventh.setBounds(20,360,200,20);
    myFrame.add(lblseventh);
    
    btn.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
    int m1 = Integer.parseInt(txtfirst.getText());
    int m2 = Integer.parseInt(txtsecond.getText());
    int m3 = Integer.parseInt(txtthird.getText());
    
    int sum = m1+m2+m3;
    double percent = sum/3;
    
    lblfourth.setText("Total Marks: "+sum);
    lblfifth.setText("Percentage: "+percent);
            
    if(m1 >=40 && m2>= 40 && m3 >= 40){
     lblseventh.setText("Remarks:"+" Pass");
     
     if(percent>=80)
      lblsixth.setText("Division:"+" Distinction.");
    else if (percent>=60)
      lblsixth.setText("Division:"+" First Division.");
    else if(percent>=40)
      lblsixth.setText("Division:"+" Third Division");
    else
      lblsixth.setText("Division:"+" Fail");
    }   
    else
      lblseventh.setText("Remarks:"+" Fail");
        
      }
    });
       
    myFrame.setVisible(true);
    myFrame.setLocationRelativeTo(null);
  }
}

