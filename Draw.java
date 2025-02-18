// Written by George Berkeley
package projects.java.orbit_simulator;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

class Draw extends JPanel {

    private BufferedImage image;

    // Constructor to accept the particles list
    //public Draw(Particle[] particles) {
    //    this.particles = particles;  // Assign the particles array to this class's field
    //}

    public Draw (BufferedImage image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintChildren(g);

        //g2.setColor(Color.BLUE);
        //g2.fillOval(100, 100, 20, 20);

        for (Particle particle : Main.particles) {
            g.fillOval(Main.camera.camera_x(particle.get_x()), Main.camera.camera_y(particle.get_y()), (int) (particle.size * Main.camera.zoom), (int) (particle.size * Main.camera.zoom));
            g.drawLine(Main.camera.camera_x(particle.get_x()) + ((int) (particle.size * Main.camera.zoom) / 2), Main.camera.camera_y(particle.get_y()) + ((int) (particle.size * Main.camera.zoom) / 2), 
                        Main.camera.camera_x(particle.get_x()) - ((int)particle.x_vector * 6) + ((int) (particle.size * Main.camera.zoom) / 2), 
                        Main.camera.camera_y(particle.get_y()) - ((int)particle.y_vector * 6) + ((int) (particle.size * Main.camera.zoom) / 2));
            

        }
        //g2.drawRect(100, 150, 60, 200);
    }
}
