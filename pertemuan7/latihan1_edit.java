package id.unpas.ac.id.pertemuan7;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
public class latihan1_edit implements Runnable {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new latihan1_edit());
    }

    @Override
    public void run() {
        JFrame frame = new JFrame("Kalkulator Kustom");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(5, 5));
        JTextField displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setBackground(Color.BLACK);
        displayField.setForeground(new Color(50, 255, 50)); 
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Consolas", Font.BOLD, 32));
        displayField.setPreferredSize(new Dimension(400, 60)); 
        displayField.setBorder(new EmptyBorder(10, 10, 10, 10));
        frame.add(displayField, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
        buttonPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            styleButton(button);
            buttonPanel.add(button);
        }
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }
    
    private void styleButton(JButton button) {
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setFocusable(false);
        
        String label = button.getText();
        if (label.equals("C")) {
            button.setBackground(new Color(220, 50, 50));
            button.setForeground(Color.WHITE);
        } else if (label.equals("=")) {
            button.setBackground(new Color(50, 150, 255));
            button.setForeground(Color.WHITE);
        } else if (label.matches("[/*\\-+]")) { 
            button.setBackground(new Color(220, 220, 220));
        } else { // Jika tombol adalah angka
            button.setBackground(Color.WHITE);
            button.setForeground(Color.BLACK);
        }
    }
}