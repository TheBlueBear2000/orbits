// Written by George Berkeley
package projects.java.orbit_simulator;

public class Particle {
    double x;
    double y;
    double x_vector;
    double y_vector;
    int mass;
    int size;

    public Particle(int in_x, int in_y, double x_vect, double y_vect, int in_mass, int radius) {
        this.x = in_x;
        this.y = in_y;
        this.x_vector = x_vect;
        this.y_vector = y_vect;
        this.mass = in_mass;
        this.size = 2 * radius;
    }
    public void move() {
        //System.out.println();
        for (Particle particle : Main.particles) {
            if (particle != this) {
                double distance = Math.max((Math.pow(particle.x - this.x, 2) + Math.pow(particle.y - this.y, 2)), 
                                            750);
                System.out.println(distance);
                double gravity = 0.01;
                try {
                    gravity = (particle.mass * 1) / Math.pow(distance, 2);
                } catch (ArithmeticException e) {}

                //gravity = 0.025;
                //System.out.println(gravity);

                this.x_vector += ((particle.x - this.x) * gravity);
                this.y_vector += ((particle.y - this.y) * gravity);
                //System.out.println(this.x_vector);
                //System.out.println(this.y_vector);
            }
        }

        this.x += this.x_vector;
        this.y += this.y_vector;
    }

    public int get_x() { return (int) this.x; }
    public int get_y() { return (int) this.y; }
}
