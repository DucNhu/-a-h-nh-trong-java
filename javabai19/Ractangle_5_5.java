package javabai19;

public class Ractangle_5_5 implements SHape_5_5{
    private int length, width;
//    Constructor

    public Ractangle_5_5(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public String toString() {
        return "Rectangle[length= " + length + ", width= " + width + "]";
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
