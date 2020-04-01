package javabai18.subClass;

import javabai18.supClass.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape p1 = new Rectangle("red", 4, 5);
        System.out.println(p1);
        System.out.println("Area is: " + p1.getArea());
        Shape s2 = new Triangle("blue", 3, 6);
        System.out.println("Area is: " + s2.getArea());
        Shape s3 = new Shape("green");
        System.out.println(s3);
        System.out.println("Area is " + s3.getArea());
    }
}
