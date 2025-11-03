/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.unpas.ac.id.pertemuan7;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author azhar
 */
public class ContohBorderLayout {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           public void run() {
            JFrame frame = new JFrame();
            frame.setTitle("Contoh Border Layout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            
            frame.setLayout(new BorderLayout());
            frame.add(new JButton("NORTH"), BorderLayout.NORTH);
            frame.add(new JButton("SOUTH"),BorderLayout.SOUTH);
            frame.add(new JButton("EAST"),BorderLayout.EAST);
            frame.add(new JButton("WEST"),BorderLayout.WEST);
            frame.add(new JButton("CENTER"),BorderLayout.CENTER);
            frame.setVisible(true);
        } 
    });
    }
}
