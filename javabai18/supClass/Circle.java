package javabai18.supClass;

public class Circle {
    private double radius;
//    COnstructor

    public Circle(double radius) {
        this.radius = radius;
    }
//    Getter Setter

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    public String toString() {
        return "Circle[radius= " + radius + "]";
    }
}
