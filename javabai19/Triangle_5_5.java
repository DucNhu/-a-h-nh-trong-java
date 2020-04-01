package javabai19;

public class Triangle_5_5 implements SHape_5_5{
    private int base, height;
    public Triangle_5_5(int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
        public String toString() {
            return "Triangle[base= " + base + ", height = " + height + "]";
         }


    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
