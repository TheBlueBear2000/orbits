package projects.java.orbit_simulator;

public class Camera {
    int x;
    int y;
    Particle tracking;
    double zoom;

    public Camera(Particle tracking) {
        this.tracking = tracking;
        this.zoom = 0.25;
        this.update();
    }

    public void update() {
        this.x = this.tracking.get_x();
        this.y = this.tracking.get_y();
    }

    public int camera_x (int x) {
        return (int) ( this.x + (zoom * (x - this.x)) - this.tracking.get_x() + (Main.SCREEN_WIDTH/2) );
    }
    public int camera_y (int y) {
        return (int) ( this.y + (zoom * (y - this.y)) - this.tracking.get_y() + (Main.SCREEN_HEIGHT/2) );
    }
}
