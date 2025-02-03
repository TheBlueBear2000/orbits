package projects.java.orbit_simulator;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

class Draw extends JComponent {

    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(100, 150, 60, 200);
    }
}
