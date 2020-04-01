package javabai19;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 32,23);
        System.out.println(s1);
        System.out.println("Area Is " + s1.getArea());
        Shape s2 = new Triangle("red", 4,7);
        System.out.println(s2);
        System.out.println(s2.getArea());

//
        SHape_5_5 ss = new Ractangle_5_5(2,3);
        System.out.println(ss);
    }
}
