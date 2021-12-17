package ss6_inheritance.bai_tap;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", height=" + height +
                ", color=" + getColor() +
                ", volume=" + getVolume() +
                '}';
    }
}
