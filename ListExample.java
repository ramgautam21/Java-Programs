import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListExample{
  public static void main(String args[]){
     
    JFrame myFrame = new JFrame("Just Example:");
    myFrame.setSize(500,500);
    myFrame.setLayout(null);
    
    JLabel lblFruits = new JLabel("Select a Fruit:");
    lblFruits.setBounds(20,20,100,30);
    myFrame.add(lblFruits);
    
    String[] fruitItems = { "Apple", "Mango", "Banana", "Pineapple" };
    
    JList list = new JList(fruitItems);
    list.setBounds(200,20,100,100);
    list.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
    myFrame.add(list);
    
    JLabel lblMessage = new JLabel("Clicked value:");
    lblMessage.setBounds(240,140,100,30);
    myFrame.add(lblMessage);
    
    JButton btn = new JButton("Send to Label");
    btn.setBounds(20,140,200,30);
    myFrame.add(btn);
    
     
      btn.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
    
        lblMessage.setText(list.getSelectedValue().toString());
      }
    });
       
    
    myFrame.setVisible(true);
    myFrame.setLocationRelativeTo(null);
  }
}