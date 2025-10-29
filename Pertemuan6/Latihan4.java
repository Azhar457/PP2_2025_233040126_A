
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Latihan4 {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
            JFrame frame = new JFrame();
            frame.setTitle("Label dan Tombol");
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setLayout(new BorderLayout());
            
            JLabel label = new JLabel("Label ada di Atas (North)");
            JButton button = new JButton("Tombol ada di Bawah (South)");

            button.addActionListener(e -> {
                if (label.getText().equals("Tombol South di Klik")) {
                    label.setText("Label ada di Atas (North)");
                } else {
                label.setText("Tombol South di Klik");
                }
            });

            frame.add(label, BorderLayout.NORTH);
            frame.add(button, BorderLayout.SOUTH);
            frame.add(new JButton("West"),BorderLayout.WEST);
            frame.add(new JButton("East"),BorderLayout.EAST);
            frame.add(new JButton("Center"),BorderLayout.CENTER);

            frame.setVisible(true);
            }
        });
    }
}
