package javabai18.subClass;

import javabai18.supClass.Monster;

public class TestMonter {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("Bùa đỏ");
        Monster m2 = new WaterMonster("Bùa xanh");
        Monster m3 = new StoneMonster("Bùa xám");
//
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
//
        Monster m4 = new Monster("Dragonnnnnnn");
        System.out.println(m4);
//
        m1 = new StoneMonster("Greeeeennnnnnnnn");
        System.out.println(m1.attack());
    }
}
