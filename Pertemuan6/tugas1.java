import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class tugas1 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {

            JFrame frame = new JFrame();
            frame.setTitle("Tugas 1 Komponen Gui Dasar");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            
            JButton mulai = new JButton();
            mulai.setText("😃");

            JLabel label = new JLabel();
            label.setText("Label");
            
            mulai.addActionListener(e -> {
                mulai.setText("Tombol Di Klik");
                label.setText("Tombol Di Klik");
            });

            frame.setLayout(new BorderLayout());
            frame.add(label,BorderLayout.NORTH);

            frame.add(new JButton("Tombol 1"),BorderLayout.NORTH);
            frame.add(new JButton("Tombol 2"),BorderLayout.WEST);
            frame.add(new JButton("Tombol 3"),BorderLayout.EAST);
            frame.add(new JButton("Tombol 4"),BorderLayout.SOUTH);
            frame.add(mulai,BorderLayout.CENTER);
            

            frame.setVisible(true);
        } 
    });
    }
}