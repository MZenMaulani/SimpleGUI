package pertemuan4;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SimpleGUI {
   public SimpleGUI(){
       JFrame frame = new JFrame("Simpe GUI");
       JLabel lbl = new JLabel("Nama ");
       JTextField tf = new JTextField(30);
       JButton btn = new JButton("Sapa Saya!");
       
       frame.setLayout(new FlowLayout());
       
       lbl.setText("Nama ");
       lbl.setFont(new java.awt.Font("Tahoma",0,36));
       
       
       frame.setSize(400, 300);
       
       frame.add(lbl);
       frame.add(tf);
       frame.add(btn);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       frame.setVisible(true);
           }
    
           
    public static void main(String[] args) {
        SimpleGUI simple = new SimpleGUI();
    }
}
