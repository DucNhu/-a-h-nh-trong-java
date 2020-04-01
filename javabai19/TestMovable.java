package javabai19;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(1,2);
        System.out.println(p1);
        p1.moveUp();
        System.out.println(p1);
//
        Movable p2 = new MovablePoint(12,22);
        p2.moveUp();
        System.out.println(p2);
        MovablePoint p3 = (MovablePoint)p1;
        System.out.println(p3);
    }
}
