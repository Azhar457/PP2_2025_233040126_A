
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Latihan2 {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
            JFrame frame = new JFrame();
            frame.setTitle("Jendela Pertamaku");
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JLabel label = new JLabel("Ini adalah Jlabel.");
            frame.add(label);

            frame.setVisible(true);
            }
        });
    }
}
