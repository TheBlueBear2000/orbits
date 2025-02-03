
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Main {

    Particle[] particles = new Particle[];


    public static void main(String[] args) {
        JFrame frame = new JFrame("Orbits");
        frame.setSize(600, 600);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.getContentPane().add(new Draw ());
        frame.setVisible(true);  
    }
    
}