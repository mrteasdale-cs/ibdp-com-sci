public class Cylinder {
    int height;
    double radius;

    public Cylinder(double radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double calcVolume(double radius, int height){
        return (Math.PI * radius * radius) * height;
    }
}
