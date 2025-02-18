// Written by George Berkeley
package projects.java.orbit_simulator;

import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Main {

    public static Particle[] particles = {
        new Particle(0, 0, 0, 0, 2500000, 20),
        new Particle(0, 300, 5, 0, 5, 20)
    };

    static Draw draw;
    static BufferedImage canvas;

    static Camera camera;
    final static int SCREEN_WIDTH = 600;
    final static int SCREEN_HEIGHT = 600;

    public static void main(String[] args) {
        // Setup frame
        JFrame frame = new JFrame("Orbits");
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        canvas = new BufferedImage(600, 600, BufferedImage.TYPE_INT_RGB);
        draw = new Draw(canvas);
        frame.getContentPane().add(draw);

        camera = new Camera(particles[0]);

        while (true) {
            // Process
            for (Particle particle : particles) {
                particle.move();
                System.out.print("x: ");
                System.out.print(particle.get_x());
                System.out.print(", y: ");
                System.out.print(particle.get_y());
                System.out.println();
            }
            System.out.println();

            camera.update();

            // Draw
            frame.repaint();
            frame.setVisible(true);
            
            // Wait
            try {
                Thread.sleep(2);
            }
            catch (InterruptedException e) {
                System.out.println("Program crashed");
            }
        }
    }
    
}