package javabai18.supClass;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Shape[color= " + color + "]";
    }
    public double getArea() {
        System.out.println("Shape unlnow! Cannot compute areal!");
       return 0;
    }
}
