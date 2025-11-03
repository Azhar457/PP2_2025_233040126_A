package pertemuan7;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class latihan1 {
     public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
            JFrame frame = new JFrame();
            frame.setTitle("Jendela Pertamaku");
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            }
        });
    }
}
