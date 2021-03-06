package javabai18.subClass;

import javabai18.supClass.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public double getVolumne() {
        return super.getArea() * height;
    }
    @Override
    public double getArea() {
        return 2.0 * Math.PI * getRadius() *height;
    }
    @Override
    public String toString() {
        return "Cylinder[height= "
                + height
                + ", "
                + super.toString()
                + "]";
    }
}
