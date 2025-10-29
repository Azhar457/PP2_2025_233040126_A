
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Latihan3 {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
            JFrame frame = new JFrame();
            frame.setTitle("Label dan Tombol");
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setLayout(new FlowLayout());
            
            JLabel label = new JLabel("Teks Awal");
            JButton button = new JButton("Klik Saya!");

            button.addActionListener(e -> {
                if (label.getText().equals("Tombol Berhasil di Klik")) {
                    label.setText("Teks Awal");
                } else {
                label.setText("Tombol Berhasil di Klik");
                }
            });

            frame.add(button);
            frame.add(label);

            frame.setVisible(true);
            }
        });
    }
}
