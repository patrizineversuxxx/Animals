package Classes;

import Interfaces.Bird;

public class Colibry implements Bird {
    private boolean dead = false;

    @Override
    public void fly(String where) {
        System.out.println("Flying to " + where);
    }

    @Override
    public void sleep() {
        System.out.println("    ");
    }

    @Override
    public void eat(int foodsCount) {
        for(int i=0; i<foodsCount; i++){
            System.out.println("Chirik!");
        }
    }

    @Override
    public void sound() {
        System.out.println("Chirik chirik, blyad!");
    }

    @Override
    public void die() {
        System.out.println("Chrik chirik, blyad! Ya maslinu poymal!!");
        dead = true;
    }
}
