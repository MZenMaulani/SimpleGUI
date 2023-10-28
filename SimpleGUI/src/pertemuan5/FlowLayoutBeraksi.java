/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author mzenm
 */
public class FlowLayoutBeraksi extends JFrame {
JButton a = new JButton("Alibi");
JButton b = new JButton("Burglar");
JButton c = new JButton("Corpse");
JButton d = new JButton("Deadbeat");
JButton e = new JButton("Evidence");
JButton f = new JButton("Fugitive");
public FlowLayoutBeraksi() {
super("Flow Layout Beraksi"); setSize(600, 400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
FlowLayout lm = new FlowLayout(FlowLayout.LEFT); 
setLayout(lm);
add(a); add(b); add(c); add(d);
add(e); add(f);
setVisible(true);
}
public static void main(String[] args) {
FlowLayoutBeraksi frame = new
FlowLayoutBeraksi();
}
}

