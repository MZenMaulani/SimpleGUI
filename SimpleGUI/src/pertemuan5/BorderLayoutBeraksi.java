/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 *
 * @author mzenm
 */
    
public class BorderLayoutBeraksi extends JFrame {
JButton nButton = new JButton("North");
JButton sButton = new JButton("South");
JButton eButton = new JButton("East");
JButton wButton = new JButton("West");
JButton cButton = new JButton("Center");

public BorderLayoutBeraksi() {
super("Border Layout Beraksi");
setSize(600, 400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setLayout(new BorderLayout());
add(nButton, BorderLayout.NORTH);
add(sButton, BorderLayout.SOUTH);
add(eButton, BorderLayout.EAST);
add(wButton, BorderLayout.WEST);
add(cButton, BorderLayout.CENTER);
}

public static void main(String[] args) {
BorderLayoutBeraksi frame = new BorderLayoutBeraksi();
frame.setVisible(true);
}
}