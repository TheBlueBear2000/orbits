package projects.java.orbit_simulator;

public class Particle {
    int x;
    int y;
    int x_vector;
    int y_vector;
    int mass;
    int size;

    public static void Particle(_x, _y, _mass, _radius) {
        x = _x;
        y = _y;
        mass = _mass;
        size = 2 * _radius;
    }
}
