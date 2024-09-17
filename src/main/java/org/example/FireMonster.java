package org.example;

public class FireMonster extends Monster {
    // Constructor
    public FireMonster(String name) {
        super(name);
    }

    // Override the attack method
    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
