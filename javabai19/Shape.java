package javabai19;

public abstract class Shape {
    String color;
//    COnstructor

    public Shape(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Shape[color= " + color + "]";
    }
    public abstract  double getArea();
}
