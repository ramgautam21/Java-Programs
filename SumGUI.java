import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SumGUI
{
  JLabel lblFirst, lblSecond;
  JTextField txtFirst, txtSecond;
  JButton btnSum;
  JFrame meroFrame;
  
  public static void main(String[] args)
  {
    new SumGUI();
  }
  
  public SumGUI()
  {
    meroFrame = new JFrame("Sum");
    meroFrame.setLayout(null);
    meroFrame.setSize(600,500);
   
    
    lblFirst = new JLabel("Enter First No:");
    lblFirst.setBounds(20,20,200,30);
    meroFrame.add(lblFirst);
    
    txtFirst = new JTextField();
    txtFirst.setBounds(280,20,200,30);
    meroFrame.add(txtFirst);
    
    lblSecond = new JLabel("Enter Second No:");
    lblSecond.setBounds(20,60,200,30);
    meroFrame.add(lblSecond);
    
    txtSecond = new JTextField();
    txtSecond.setBounds(280,60,200,30);
    meroFrame.add(txtSecond);
    
    btnSum = new JButton("Sum");
    btnSum.setBounds(170,130,150,30);
    meroFrame.add(btnSum);
    
    JButton btnClose = new JButton("Close");
    btnClose.setBounds(350,130,150,30);
    meroFrame.add(btnClose);
    
    btnClose.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        System.exit(0);
      }});
    
    btnSum.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
         int m1 = Integer.parseInt(txtFirst.getText());
         int m2 = Integer.parseInt(txtSecond.getText());
         
         int sum = m1 + m2;
         JOptionPane.showMessageDialog(null,"Sum is "+sum);
      }
    });
    
    meroFrame.setVisible(true);
    meroFrame.setLocationRelativeTo(null);
  } 
}
