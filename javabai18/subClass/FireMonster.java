package javabai18.subClass;

import javabai18.supClass.Monster;

public class FireMonster  extends Monster {
    public FireMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
